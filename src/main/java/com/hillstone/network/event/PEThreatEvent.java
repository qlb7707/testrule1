package com.hillstone.network.event;

/**
 * @author lbqin
 * @ClassName: PEThreatEvent.java
 * @Description: Threat Event structure definition,override equals, hashCode methods to support CEP API
 * @Date 2018/11/5 9:11
 */
public class PEThreatEvent extends Event{

    private long id;
    private long flag_mask;
    private long aggregation_id;
    private int defender_id;
    private int real_defender;
    private int pri_type;
    private int sec_type;
    private long begin_time;
    private long end_time;
    private int severity;
    private int confidence;
    private long app_id;
    private String app_name;
    private int protocol;
    private long policy_id;
    private long profile_id;
    private int action_id;
    private int stage_id;
    private long count;
    private String event_name;
    private int event_status;
    private int event_interv;
    private String interv_comments;
    private int src_vsysid;
    private String src_vsysname;
    private int src_vrid;
    private String src_vrname;
    private int src_interfaceid;
    private String src_interfacename;
    private int src_zoneid;
    private String src_zonename;
    private long src_ip;
    private int src_ip_mask_len;
    private int src_port;
    private long src_hostindex;
    private String src_hostname;
    private String src_country;
    private String src_region;
    private String src_city;
    private int dst_vsysid;
    private String dst_vsysname;
    private int dst_vrid;
    private String dst_vrname;
    private int dst_interfaceid;
    private String dst_interfacename;
    private int dst_zoneid;
    private String dst_zonename;
    private long dst_ip;
    private int dst_ip_mask_len;
    private int dst_port;
    private long dst_hostindex;
    private String dst_hostname;
    private String dst_country;
    private String dst_region;
    private String dst_city;
    private String priv_data;
    private int is_ioc;
    private int need_show;
    private int threat_cat;
    private int category_type;
    private long hscc;
    private long correlate_id;
    private String src_serversubnet;
    private String dst_serversubnet;

    public PEThreatEvent() {}

    public PEThreatEvent(long id, long flag_mask, long aggregation_id, int defender_id
            , int real_defender, int pri_type, int sec_type, long begin_time
            , long end_time, int severity, int confidence, long app_id
            , String app_name, int protocol, long policy_id, long profile_id
            , int action_id, int stage_id, long count, String event_name
            , int event_status, int event_interv, String interv_comments, int src_vsysid
            , String src_vsysname, int src_vrid, String src_vrname, int src_interfaceid
            , String src_interfacename, int src_zoneid, String src_zonename, long src_ip
            , int src_ip_mask_len, int src_port, long src_hostindex, String src_hostname
            , String src_country, String src_region, String src_city, int dst_vsysid
            , String dst_vsysname, int dst_vrid, String dst_vrname, int dst_interfaceid
            , String dst_interfacename, int dst_zoneid, String dst_zonename, long dst_ip
            , int dst_ip_mask_len, int dst_port, long dst_hostindex, String dst_hostname
            , String dst_country, String dst_region, String dst_city, String priv_data
            , int is_ioc, int need_show, int threat_cat, int category_type
            , long hscc, long correlate_id, String src_serversubnet, String dst_serversubnet) {

        this.id = id;
        this.flag_mask = flag_mask;
        this.aggregation_id = aggregation_id;
        this.defender_id = defender_id;
        this.real_defender = real_defender;
        this.pri_type = pri_type;
        this.sec_type = sec_type;
        this.begin_time = begin_time;
        this.end_time = end_time;
        this.severity = severity;
        this.confidence = confidence;
        this.app_id = app_id;
        this.app_name = app_name;
        this.protocol = protocol;
        this.policy_id = policy_id;
        this.profile_id = profile_id;
        this.action_id = action_id;
        this.stage_id = stage_id;
        this.count = count;
        this.event_name = event_name;
        this.event_status = event_status;
        this.event_interv = event_interv;
        this.interv_comments = interv_comments;
        this.src_vsysid = src_vsysid;
        this.src_vsysname = src_vsysname;
        this.src_vrid = src_vrid;
        this.src_vrname = src_vrname;
        this.src_interfaceid = src_interfaceid;
        this.src_interfacename = src_interfacename;
        this.src_zoneid = src_zoneid;
        this.src_zonename = src_zonename;
        this.src_ip = src_ip;
        this.src_ip_mask_len = src_ip_mask_len;
        this.src_port = src_port;
        this.src_hostindex = src_hostindex;
        this.src_hostname = src_hostname;
        this.src_country = src_country;
        this.src_region = src_region;
        this.src_city = src_city;
        this.dst_vsysid = dst_vsysid;
        this.dst_vsysname = dst_vsysname;
        this.dst_vrid = dst_vrid;
        this.dst_vrname = dst_vrname;
        this.dst_interfaceid = dst_interfaceid;
        this.dst_interfacename = dst_interfacename;
        this.dst_zoneid = dst_zoneid;
        this.dst_zonename = dst_zonename;
        this.dst_ip = dst_ip;
        this.dst_ip_mask_len = dst_ip_mask_len;
        this.dst_port = dst_port;
        this.dst_hostindex = dst_hostindex;
        this.dst_hostname = dst_hostname;
        this.dst_country = dst_country;
        this.dst_region = dst_region;
        this.dst_city = dst_city;
        this.priv_data = priv_data;
        this.is_ioc = is_ioc;
        this.need_show = need_show;
        this.threat_cat = threat_cat;
        this.category_type = category_type;
        this.hscc = hscc;
        this.correlate_id = correlate_id;
        this.src_serversubnet = src_serversubnet;
        this.dst_serversubnet = dst_serversubnet;

    }

    /**
     * Gets the value of the 'id' field.
     * @return The value of the 'id' field.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the 'id' field.
     * @param value the value to set.
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the 'flag_mask' field.
     * @return The value of the 'flag_mask' field.
     */
    public long getFlag_mask() {
        return flag_mask;
    }

    /**
     * Sets the value of the 'flag_mask' field.
     * @param value the value to set.
     */
    public void setFlag_mask(long value) {
        this.flag_mask = value;
    }

    /**
     * Gets the value of the 'aggregation_id' field.
     * @return The value of the 'aggregation_id' field.
     */
    public long getAggregation_id() {
        return aggregation_id;
    }

    /**
     * Sets the value of the 'aggregation_id' field.
     * @param value the value to set.
     */
    public void setAggregation_id(long value) {
        this.aggregation_id = value;
    }

    /**
     * Gets the value of the 'defender_id' field.
     * @return The value of the 'defender_id' field.
     */
    public int getDefender_id() {
        return defender_id;
    }

    /**
     * Sets the value of the 'defender_id' field.
     * @param value the value to set.
     */
    public void setDefender_id(int value) {
        this.defender_id = value;
    }

    /**
     * Gets the value of the 'real_defender' field.
     * @return The value of the 'real_defender' field.
     */
    public int getReal_defender() {
        return real_defender;
    }

    /**
     * Sets the value of the 'real_defender' field.
     * @param value the value to set.
     */
    public void setReal_defender(int value) {
        this.real_defender = value;
    }

    /**
     * Gets the value of the 'pri_type' field.
     * @return The value of the 'pri_type' field.
     */
    public int getPri_type() {
        return pri_type;
    }

    /**
     * Sets the value of the 'pri_type' field.
     * @param value the value to set.
     */
    public void setPri_type(int value) {
        this.pri_type = value;
    }

    /**
     * Gets the value of the 'sec_type' field.
     * @return The value of the 'sec_type' field.
     */
    public int getSec_type() {
        return sec_type;
    }

    /**
     * Sets the value of the 'sec_type' field.
     * @param value the value to set.
     */
    public void setSec_type(int value) {
        this.sec_type = value;
    }

    /**
     * Gets the value of the 'begin_time' field.
     * @return The value of the 'begin_time' field.
     */
    public long getBegin_time() {
        return begin_time;
    }

    /**
     * Sets the value of the 'begin_time' field.
     * @param value the value to set.
     */
    public void setBegin_time(long value) {
        this.begin_time = value;
    }

    /**
     * Gets the value of the 'end_time' field.
     * @return The value of the 'end_time' field.
     */
    public long getEnd_time() {
        return end_time;
    }

    /**
     * Sets the value of the 'end_time' field.
     * @param value the value to set.
     */
    public void setEnd_time(long value) {
        this.end_time = value;
    }

    /**
     * Gets the value of the 'severity' field.
     * @return The value of the 'severity' field.
     */
    public int getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the 'severity' field.
     * @param value the value to set.
     */
    public void setSeverity(int value) {
        this.severity = value;
    }

    /**
     * Gets the value of the 'confidence' field.
     * @return The value of the 'confidence' field.
     */
    public int getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the 'confidence' field.
     * @param value the value to set.
     */
    public void setConfidence(int value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the 'app_id' field.
     * @return The value of the 'app_id' field.
     */
    public long getApp_id() {
        return app_id;
    }

    /**
     * Sets the value of the 'app_id' field.
     * @param value the value to set.
     */
    public void setApp_id(long value) {
        this.app_id = value;
    }

    /**
     * Gets the value of the 'app_name' field.
     * @return The value of the 'app_name' field.
     */
    public String getApp_name() {
        return app_name;
    }

    /**
     * Sets the value of the 'app_name' field.
     * @param value the value to set.
     */
    public void setApp_name(String value) {
        this.app_name = value;
    }

    /**
     * Gets the value of the 'protocol' field.
     * @return The value of the 'protocol' field.
     */
    public int getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the 'protocol' field.
     * @param value the value to set.
     */
    public void setProtocol(int value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the 'policy_id' field.
     * @return The value of the 'policy_id' field.
     */
    public long getPolicy_id() {
        return policy_id;
    }

    /**
     * Sets the value of the 'policy_id' field.
     * @param value the value to set.
     */
    public void setPolicy_id(long value) {
        this.policy_id = value;
    }

    /**
     * Gets the value of the 'profile_id' field.
     * @return The value of the 'profile_id' field.
     */
    public long getProfile_id() {
        return profile_id;
    }

    /**
     * Sets the value of the 'profile_id' field.
     * @param value the value to set.
     */
    public void setProfile_id(long value) {
        this.profile_id = value;
    }

    /**
     * Gets the value of the 'action_id' field.
     * @return The value of the 'action_id' field.
     */
    public int getAction_id() {
        return action_id;
    }

    /**
     * Sets the value of the 'action_id' field.
     * @param value the value to set.
     */
    public void setAction_id(int value) {
        this.action_id = value;
    }

    /**
     * Gets the value of the 'stage_id' field.
     * @return The value of the 'stage_id' field.
     */
    public int getStage_id() {
        return stage_id;
    }

    /**
     * Sets the value of the 'stage_id' field.
     * @param value the value to set.
     */
    public void setStage_id(int value) {
        this.stage_id = value;
    }

    /**
     * Gets the value of the 'count' field.
     * @return The value of the 'count' field.
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the 'count' field.
     * @param value the value to set.
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the 'event_name' field.
     * @return The value of the 'event_name' field.
     */
    public String getEvent_name() {
        return event_name;
    }

    /**
     * Sets the value of the 'event_name' field.
     * @param value the value to set.
     */
    public void setEvent_name(String value) {
        this.event_name = value;
    }

    /**
     * Gets the value of the 'event_status' field.
     * @return The value of the 'event_status' field.
     */
    public int getEvent_status() {
        return event_status;
    }

    /**
     * Sets the value of the 'event_status' field.
     * @param value the value to set.
     */
    public void setEvent_status(int value) {
        this.event_status = value;
    }

    /**
     * Gets the value of the 'event_interv' field.
     * @return The value of the 'event_interv' field.
     */
    public int getEvent_interv() {
        return event_interv;
    }

    /**
     * Sets the value of the 'event_interv' field.
     * @param value the value to set.
     */
    public void setEvent_interv(int value) {
        this.event_interv = value;
    }

    /**
     * Gets the value of the 'interv_comments' field.
     * @return The value of the 'interv_comments' field.
     */
    public String getInterv_comments() {
        return interv_comments;
    }

    /**
     * Sets the value of the 'interv_comments' field.
     * @param value the value to set.
     */
    public void setInterv_comments(String value) {
        this.interv_comments = value;
    }

    /**
     * Gets the value of the 'src_vsysid' field.
     * @return The value of the 'src_vsysid' field.
     */
    public int getSrc_vsysid() {
        return src_vsysid;
    }

    /**
     * Sets the value of the 'src_vsysid' field.
     * @param value the value to set.
     */
    public void setSrc_vsysid(int value) {
        this.src_vsysid = value;
    }

    /**
     * Gets the value of the 'src_vsysname' field.
     * @return The value of the 'src_vsysname' field.
     */
    public String getSrc_vsysname() {
        return src_vsysname;
    }

    /**
     * Sets the value of the 'src_vsysname' field.
     * @param value the value to set.
     */
    public void setSrc_vsysname(String value) {
        this.src_vsysname = value;
    }

    /**
     * Gets the value of the 'src_vrid' field.
     * @return The value of the 'src_vrid' field.
     */
    public int getSrc_vrid() {
        return src_vrid;
    }

    /**
     * Sets the value of the 'src_vrid' field.
     * @param value the value to set.
     */
    public void setSrc_vrid(int value) {
        this.src_vrid = value;
    }

    /**
     * Gets the value of the 'src_vrname' field.
     * @return The value of the 'src_vrname' field.
     */
    public String getSrc_vrname() {
        return src_vrname;
    }

    /**
     * Sets the value of the 'src_vrname' field.
     * @param value the value to set.
     */
    public void setSrc_vrname(String value) {
        this.src_vrname = value;
    }

    /**
     * Gets the value of the 'src_interfaceid' field.
     * @return The value of the 'src_interfaceid' field.
     */
    public int getSrc_interfaceid() {
        return src_interfaceid;
    }

    /**
     * Sets the value of the 'src_interfaceid' field.
     * @param value the value to set.
     */
    public void setSrc_interfaceid(int value) {
        this.src_interfaceid = value;
    }

    /**
     * Gets the value of the 'src_interfacename' field.
     * @return The value of the 'src_interfacename' field.
     */
    public String getSrc_interfacename() {
        return src_interfacename;
    }

    /**
     * Sets the value of the 'src_interfacename' field.
     * @param value the value to set.
     */
    public void setSrc_interfacename(String value) {
        this.src_interfacename = value;
    }

    /**
     * Gets the value of the 'src_zoneid' field.
     * @return The value of the 'src_zoneid' field.
     */
    public int getSrc_zoneid() {
        return src_zoneid;
    }

    /**
     * Sets the value of the 'src_zoneid' field.
     * @param value the value to set.
     */
    public void setSrc_zoneid(int value) {
        this.src_zoneid = value;
    }

    /**
     * Gets the value of the 'src_zonename' field.
     * @return The value of the 'src_zonename' field.
     */
    public String getSrc_zonename() {
        return src_zonename;
    }

    /**
     * Sets the value of the 'src_zonename' field.
     * @param value the value to set.
     */
    public void setSrc_zonename(String value) {
        this.src_zonename = value;
    }

    /**
     * Gets the value of the 'src_ip' field.
     * @return The value of the 'src_ip' field.
     */
    public long getSrc_ip() {
        return src_ip;
    }

    /**
     * Sets the value of the 'src_ip' field.
     * @param value the value to set.
     */
    public void setSrc_ip(long value) {
        this.src_ip = value;
    }

    /**
     * Gets the value of the 'src_ip_mask_len' field.
     * @return The value of the 'src_ip_mask_len' field.
     */
    public int getSrc_ip_mask_len() {
        return src_ip_mask_len;
    }

    /**
     * Sets the value of the 'src_ip_mask_len' field.
     * @param value the value to set.
     */
    public void setSrc_ip_mask_len(int value) {
        this.src_ip_mask_len = value;
    }

    /**
     * Gets the value of the 'src_port' field.
     * @return The value of the 'src_port' field.
     */
    public int getSrc_port() {
        return src_port;
    }

    /**
     * Sets the value of the 'src_port' field.
     * @param value the value to set.
     */
    public void setSrc_port(int value) {
        this.src_port = value;
    }

    /**
     * Gets the value of the 'src_hostindex' field.
     * @return The value of the 'src_hostindex' field.
     */
    public long getSrc_hostindex() {
        return src_hostindex;
    }

    /**
     * Sets the value of the 'src_hostindex' field.
     * @param value the value to set.
     */
    public void setSrc_hostindex(long value) {
        this.src_hostindex = value;
    }

    /**
     * Gets the value of the 'src_hostname' field.
     * @return The value of the 'src_hostname' field.
     */
    public String getSrc_hostname() {
        return src_hostname;
    }

    /**
     * Sets the value of the 'src_hostname' field.
     * @param value the value to set.
     */
    public void setSrc_hostname(String value) {
        this.src_hostname = value;
    }

    /**
     * Gets the value of the 'src_country' field.
     * @return The value of the 'src_country' field.
     */
    public String getSrc_country() {
        return src_country;
    }

    /**
     * Sets the value of the 'src_country' field.
     * @param value the value to set.
     */
    public void setSrc_country(String value) {
        this.src_country = value;
    }

    /**
     * Gets the value of the 'src_region' field.
     * @return The value of the 'src_region' field.
     */
    public String getSrc_region() {
        return src_region;
    }

    /**
     * Sets the value of the 'src_region' field.
     * @param value the value to set.
     */
    public void setSrc_region(String value) {
        this.src_region = value;
    }

    /**
     * Gets the value of the 'src_city' field.
     * @return The value of the 'src_city' field.
     */
    public String getSrc_city() {
        return src_city;
    }

    /**
     * Sets the value of the 'src_city' field.
     * @param value the value to set.
     */
    public void setSrc_city(String value) {
        this.src_city = value;
    }

    /**
     * Gets the value of the 'dst_vsysid' field.
     * @return The value of the 'dst_vsysid' field.
     */
    public int getDst_vsysid() {
        return dst_vsysid;
    }

    /**
     * Sets the value of the 'dst_vsysid' field.
     * @param value the value to set.
     */
    public void setDst_vsysid(int value) {
        this.dst_vsysid = value;
    }

    /**
     * Gets the value of the 'dst_vsysname' field.
     * @return The value of the 'dst_vsysname' field.
     */
    public String getDst_vsysname() {
        return dst_vsysname;
    }

    /**
     * Sets the value of the 'dst_vsysname' field.
     * @param value the value to set.
     */
    public void setDst_vsysname(String value) {
        this.dst_vsysname = value;
    }

    /**
     * Gets the value of the 'dst_vrid' field.
     * @return The value of the 'dst_vrid' field.
     */
    public int getDst_vrid() {
        return dst_vrid;
    }

    /**
     * Sets the value of the 'dst_vrid' field.
     * @param value the value to set.
     */
    public void setDst_vrid(int value) {
        this.dst_vrid = value;
    }

    /**
     * Gets the value of the 'dst_vrname' field.
     * @return The value of the 'dst_vrname' field.
     */
    public String getDst_vrname() {
        return dst_vrname;
    }

    /**
     * Sets the value of the 'dst_vrname' field.
     * @param value the value to set.
     */
    public void setDst_vrname(String value) {
        this.dst_vrname = value;
    }

    /**
     * Gets the value of the 'dst_interfaceid' field.
     * @return The value of the 'dst_interfaceid' field.
     */
    public int getDst_interfaceid() {
        return dst_interfaceid;
    }

    /**
     * Sets the value of the 'dst_interfaceid' field.
     * @param value the value to set.
     */
    public void setDst_interfaceid(int value) {
        this.dst_interfaceid = value;
    }

    /**
     * Gets the value of the 'dst_interfacename' field.
     * @return The value of the 'dst_interfacename' field.
     */
    public String getDst_interfacename() {
        return dst_interfacename;
    }

    /**
     * Sets the value of the 'dst_interfacename' field.
     * @param value the value to set.
     */
    public void setDst_interfacename(String value) {
        this.dst_interfacename = value;
    }

    /**
     * Gets the value of the 'dst_zoneid' field.
     * @return The value of the 'dst_zoneid' field.
     */
    public int getDst_zoneid() {
        return dst_zoneid;
    }

    /**
     * Sets the value of the 'dst_zoneid' field.
     * @param value the value to set.
     */
    public void setDst_zoneid(int value) {
        this.dst_zoneid = value;
    }

    /**
     * Gets the value of the 'dst_zonename' field.
     * @return The value of the 'dst_zonename' field.
     */
    public String getDst_zonename() {
        return dst_zonename;
    }

    /**
     * Sets the value of the 'dst_zonename' field.
     * @param value the value to set.
     */
    public void setDst_zonename(String value) {
        this.dst_zonename = value;
    }

    /**
     * Gets the value of the 'dst_ip' field.
     * @return The value of the 'dst_ip' field.
     */
    public long getDst_ip() {
        return dst_ip;
    }

    /**
     * Sets the value of the 'dst_ip' field.
     * @param value the value to set.
     */
    public void setDst_ip(long value) {
        this.dst_ip = value;
    }

    /**
     * Gets the value of the 'dst_ip_mask_len' field.
     * @return The value of the 'dst_ip_mask_len' field.
     */
    public int getDst_ip_mask_len() {
        return dst_ip_mask_len;
    }

    /**
     * Sets the value of the 'dst_ip_mask_len' field.
     * @param value the value to set.
     */
    public void setDst_ip_mask_len(int value) {
        this.dst_ip_mask_len = value;
    }

    /**
     * Gets the value of the 'dst_port' field.
     * @return The value of the 'dst_port' field.
     */
    public int getDst_port() {
        return dst_port;
    }

    /**
     * Sets the value of the 'dst_port' field.
     * @param value the value to set.
     */
    public void setDst_port(int value) {
        this.dst_port = value;
    }

    /**
     * Gets the value of the 'dst_hostindex' field.
     * @return The value of the 'dst_hostindex' field.
     */
    public long getDst_hostindex() {
        return dst_hostindex;
    }

    /**
     * Sets the value of the 'dst_hostindex' field.
     * @param value the value to set.
     */
    public void setDst_hostindex(long value) {
        this.dst_hostindex = value;
    }

    /**
     * Gets the value of the 'dst_hostname' field.
     * @return The value of the 'dst_hostname' field.
     */
    public String getDst_hostname() {
        return dst_hostname;
    }

    /**
     * Sets the value of the 'dst_hostname' field.
     * @param value the value to set.
     */
    public void setDst_hostname(String value) {
        this.dst_hostname = value;
    }

    /**
     * Gets the value of the 'dst_country' field.
     * @return The value of the 'dst_country' field.
     */
    public String getDst_country() {
        return dst_country;
    }

    /**
     * Sets the value of the 'dst_country' field.
     * @param value the value to set.
     */
    public void setDst_country(String value) {
        this.dst_country = value;
    }

    /**
     * Gets the value of the 'dst_region' field.
     * @return The value of the 'dst_region' field.
     */
    public String getDst_region() {
        return dst_region;
    }

    /**
     * Sets the value of the 'dst_region' field.
     * @param value the value to set.
     */
    public void setDst_region(String value) {
        this.dst_region = value;
    }

    /**
     * Gets the value of the 'dst_city' field.
     * @return The value of the 'dst_city' field.
     */
    public String getDst_city() {
        return dst_city;
    }

    /**
     * Sets the value of the 'dst_city' field.
     * @param value the value to set.
     */
    public void setDst_city(String value) {
        this.dst_city = value;
    }

    /**
     * Gets the value of the 'priv_data' field.
     * @return The value of the 'priv_data' field.
     */
    public String getPriv_data() {
        return priv_data;
    }

    /**
     * Sets the value of the 'priv_data' field.
     * @param value the value to set.
     */
    public void setPriv_data(String value) {
        this.priv_data = value;
    }

    /**
     * Gets the value of the 'is_ioc' field.
     * @return The value of the 'is_ioc' field.
     */
    public int getIs_ioc() {
        return is_ioc;
    }

    /**
     * Sets the value of the 'is_ioc' field.
     * @param value the value to set.
     */
    public void setIs_ioc(int value) {
        this.is_ioc = value;
    }

    /**
     * Gets the value of the 'need_show' field.
     * @return The value of the 'need_show' field.
     */
    public int getNeed_show() {
        return need_show;
    }

    /**
     * Sets the value of the 'need_show' field.
     * @param value the value to set.
     */
    public void setNeed_show(int value) {
        this.need_show = value;
    }

    /**
     * Gets the value of the 'threat_cat' field.
     * @return The value of the 'threat_cat' field.
     */
    public int getThreat_cat() {
        return threat_cat;
    }

    /**
     * Sets the value of the 'threat_cat' field.
     * @param value the value to set.
     */
    public void setThreat_cat(int value) {
        this.threat_cat = value;
    }

    /**
     * Gets the value of the 'category_type' field.
     * @return The value of the 'category_type' field.
     */
    public int getCategory_type() {
        return category_type;
    }

    /**
     * Sets the value of the 'category_type' field.
     * @param value the value to set.
     */
    public void setCategory_type(int value) {
        this.category_type = value;
    }

    /**
     * Gets the value of the 'hscc' field.
     * @return The value of the 'hscc' field.
     */
    public long getHscc() {
        return hscc;
    }

    /**
     * Sets the value of the 'hscc' field.
     * @param value the value to set.
     */
    public void setHscc(long value) {
        this.hscc = value;
    }

    /**
     * Gets the value of the 'correlate_id' field.
     * @return The value of the 'correlate_id' field.
     */
    public long getCorrelate_id() {
        return correlate_id;
    }

    /**
     * Sets the value of the 'correlate_id' field.
     * @param value the value to set.
     */
    public void setCorrelate_id(long value) {
        this.correlate_id = value;
    }

    /**
     * Gets the value of the 'src_serversubnet' field.
     * @return The value of the 'src_serversubnet' field.
     */
    public String getSrc_serversubnet() {
        return src_serversubnet;
    }

    /**
     * Sets the value of the 'src_serversubnet' field.
     * @param value the value to set.
     */
    public void setSrc_serversubnet(String value) {
        this.src_serversubnet = value;
    }

    /**
     * Gets the value of the 'dst_serversubnet' field.
     * @return The value of the 'dst_serversubnet' field.
     */
    public String getDst_serversubnet() {
        return dst_serversubnet;
    }

    /**
     * Sets the value of the 'dst_serversubnet' field.
     * @param value the value to set.
     */
    public void setDst_serversubnet(String value) {
        this.dst_serversubnet = value;
    }

    public boolean canEquals(Object obj) {
        return obj instanceof PEThreatEvent;
    }

    /*to support CEP, we should override equals,hashCode method*/

    @Override
    public boolean equals (Object obj) {
        PEThreatEvent other = (PEThreatEvent) obj;
        return other.canEquals(this) &&  id == other.getId()
                && flag_mask == other.getFlag_mask() && defender_id == other.getDefender_id()
                && real_defender == other.getReal_defender() && pri_type == other.getPri_type()
                && sec_type == other.getSec_type() && begin_time == other.getBegin_time()
                && end_time == other.getEnd_time() && severity == other.getSeverity()
                && confidence == other.getConfidence() && app_id == other.getApp_id()
                && app_name.equals(other.getApp_name()) && protocol == other.getProtocol()
                && policy_id == other.getPolicy_id() && profile_id == other.getProfile_id()
                && action_id == other.getAction_id() && stage_id == other.getStage_id()
                && count == other.getCount() && event_name.equals(other.getEvent_name())
                && event_status == other.getEvent_status() && event_interv == other.getEvent_interv()
                && interv_comments.equals(other.getInterv_comments()) && src_vsysid == other.getSrc_vsysid()
                && src_vsysname.equals(other.getSrc_vsysname()) && src_vrid == other.getSrc_vrid()
                && src_vrname.equals(other.getSrc_vrname()) && src_interfaceid == other.getSrc_interfaceid()
                && src_interfacename.equals(other.getSrc_interfacename()) && src_zoneid == other.getSrc_zoneid()
                && src_zonename.equals(other.getSrc_zonename()) && src_ip == other.getSrc_ip()
                && src_ip_mask_len == other.getSrc_ip_mask_len() && src_port == other.getSrc_port()
                && src_hostindex == other.getSrc_hostindex() && src_hostname.equals(other.getSrc_hostname())
                && src_country.equals(other.getSrc_country()) && src_region.equals(other.getSrc_region())
                && src_city.equals(other.getSrc_city()) && dst_vsysid == other.getDst_vsysid()
                && dst_vsysname.equals(other.getDst_vsysname()) && dst_vrid == other.getDst_vrid()
                && dst_vrname.equals(other.getDst_vrname()) && dst_interfaceid == other.getDst_interfaceid()
                && dst_interfacename.equals(other.getDst_interfacename()) && dst_zoneid == other.getDst_zoneid()
                && dst_zonename.equals(other.getDst_zonename()) && dst_ip == other.getDst_ip()
                && dst_ip_mask_len == other.getDst_ip_mask_len() && dst_port == other.getDst_port()
                && dst_hostindex == other.getDst_hostindex() && dst_hostname.equals(other.getDst_hostname())
                && dst_country.equals(other.getDst_country()) && dst_region.equals(other.getDst_region())
                && dst_city.equals(other.getDst_city()) && priv_data.equals(other.getPriv_data())
                && is_ioc == other.getIs_ioc() && need_show == other.getNeed_show()
                && threat_cat == other.getThreat_cat() && category_type == other.getCategory_type()
                && hscc == other.getHscc() && correlate_id == other.getCorrelate_id()
                && src_serversubnet.equals(other.getSrc_serversubnet()) && dst_serversubnet.equals(other.getDst_serversubnet());
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id) + Long.hashCode(flag_mask) + Integer.hashCode(defender_id)
                + Integer.hashCode(real_defender) + Integer.hashCode(pri_type) + Integer.hashCode(sec_type)
                + Long.hashCode(begin_time) + Long.hashCode(end_time) + Integer.hashCode(severity)
                + Integer.hashCode(confidence) + Long.hashCode(app_id) + app_name.hashCode()
                + Integer.hashCode(protocol) + Long.hashCode(policy_id) + Long.hashCode(profile_id)
                + Integer.hashCode(action_id) + Integer.hashCode(stage_id) + Long.hashCode(count)
                + event_name.hashCode() + Integer.hashCode(event_status) + Integer.hashCode(event_interv)
                + interv_comments.hashCode() + Integer.hashCode(src_vsysid) + src_vsysname.hashCode()
                + Integer.hashCode(src_vrid) + src_vrname.hashCode() + Integer.hashCode(src_interfaceid)
                + src_interfacename.hashCode() + Integer.hashCode(src_zoneid) + src_zonename.hashCode()
                + Long.hashCode(src_ip) + Integer.hashCode(src_ip_mask_len) + Integer.hashCode(src_port)
                + Long.hashCode(src_hostindex) + src_hostname.hashCode() + src_country.hashCode()
                + src_region.hashCode() + src_city.hashCode() + Integer.hashCode(dst_vsysid)
                + dst_vsysname.hashCode() + Integer.hashCode(dst_vrid) + dst_vrname.hashCode()
                + Integer.hashCode(dst_interfaceid) + dst_interfacename.hashCode() + Integer.hashCode(dst_zoneid)
                + dst_zonename.hashCode() + Long.hashCode(dst_ip) + Integer.hashCode(dst_ip_mask_len)
                + Integer.hashCode(dst_port) + Long.hashCode(dst_hostindex) + dst_hostname.hashCode()
                + dst_country.hashCode() + dst_region.hashCode() + dst_city.hashCode()
                + priv_data.hashCode() + Integer.hashCode(is_ioc) + Integer.hashCode(need_show)
                + Integer.hashCode(threat_cat) + Integer.hashCode(category_type) + Long.hashCode(hscc)
                + Long.hashCode(correlate_id) + src_serversubnet.hashCode() + dst_serversubnet.hashCode();

    }

    @Override
    public String toString() {
        return "PEThreatEvent{" + "id:" + getId() + ",flag_mask:" + getFlag_mask()
                + ",defender_id:" + getDefender_id() + ",pri_type:" + getPri_type()
                + ",sec_type:" + getSec_type() + ",begin_time:" + getBegin_time()
                + ",end_time:" + getEnd_time() + ",severity:" + getSeverity()
                + ",confidence:" + getConfidence() + ",event_name:" + getEvent_name()
                + ",src_ip:" + getSrc_ip() + ",dst_ip:" + getDst_ip()
                + ",is_ioc:" + getIs_ioc() + ",need_show:" + getNeed_show()
                + ",threat_cat:" + getThreat_cat() + ",category_type:" + getCategory_type()
                + ",priv_data:" + getPriv_data() + "}";
    }

}
