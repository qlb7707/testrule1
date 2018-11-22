package com.hillstone.network.sink;

import com.hillstone.network.event.PEThreatEvent;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author lbqin
 * @ClassName: PeJDBCSink.java
 * @Description: JDBC sink for PEThreatEvent
 * @Date 2018/11/6 16:39
 */
public class PeJDBCSink extends PeSink {
    private static final String PLACEHOLDER = "?";
    private String driver;
    private String url;
    private String username;
    private String password;
    private Connection connection;
    private PreparedStatement ps;
    private String[] columns;

    public PeJDBCSink(String driver, String url, String username
                        , String password, String[] columns) {
        super();
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
        this.columns = columns;
    }

    public PeJDBCSink() {
        this("com.mysql.jdbc.Driver","jdbc:mysql://10.180.171.113:3306/risk_mgmt_db"
                ,"hillstone", "hillstone", null );
    }

    public void setFields(String[] fields) {
        this.columns = fields;
    }

    @Override
    public void open(Configuration configuration) throws Exception {
        super.open(configuration);
        Class.forName(driver);
        connection = DriverManager.getConnection(url, username, password);
        String cols = String.join(",", columns);
        String valsPlaceholder = "";
        int len = columns.length;
        for (int i = 0; i < len; i++) {
            String column = columns[i];
            valsPlaceholder += PLACEHOLDER;
            if (i < len - 1) {
                valsPlaceholder += ",";
            }

        }
        String sql = "replace into threat_event_tbl(" + cols + ")" + " values(" + valsPlaceholder +");";
        ps = connection.prepareStatement(sql);

    }

    @Override
    public void invoke(PEThreatEvent value, SinkFunction.Context ctx) throws Exception {

        int len = columns.length;
        for (int i = 0; i < len; i++) {
            String column = columns[i];
            String firstUp = column.substring(0,1).toUpperCase() + column.substring(1);
            String type = value.getClass().getDeclaredField(column).getType().getName();
            switch (type)
            {
                case "java.lang.String":
                    ps.setString(i + 1, (String) value.getClass().getMethod("get" + firstUp).invoke(value));
                    break;
                case "int":
                    ps.setInt(i + 1, (int) value.getClass().getMethod("get" + firstUp).invoke(value));
                    break;
                case "long":
                    ps.setLong(i + 1,(long) value.getClass().getMethod("get" + firstUp).invoke(value));
                    break;
                default:
                    throw new Exception("Not excepted type:" + type);
            }

        }
        ps.executeUpdate();
    }

    @Override
    public void close() throws Exception {
        super.close();
        if (connection != null) {
            connection.close();
        }
        if (ps != null) {
            ps.close();
        }

    }

}
