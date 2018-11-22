package com.hillstone.network.event;

/**
 * @author lbqin
 * @ClassName: TestWarning.java
 * @Description: simple warning of two matched PEThreatEvent, for testing
 * @Date 2018/11/5 15:31
 */
public class TestWarning {

    private long threat_id1;
    private long threat_id2;
    private String name1;
    private String name2;
    private String ruleName;

    public TestWarning(long id1, long id2, String name1, String name2, String ruleName) {
        this.threat_id1 = id1;
        this.threat_id2 = id2;
        this.name1 = name1;
        this.name2 = name2;
        this.ruleName = ruleName;
    }

    public TestWarning() {
        this(0,0,"","", "None");
    }

    @Override
    public String toString() {
        return "TestWarning {" + "id1:" + threat_id1 + ",id2:" + threat_id2
                + ",name1:" + name1 + ",name2" + name2 + ",rule:" + ruleName + "}";
    }

}
