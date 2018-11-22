package com.hillstone.network.event;

import javax.print.attribute.standard.Destination;
import java.text.SimpleDateFormat;

/**
 * @author lbqin
 * @ClassName: null.java
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @Date 2018/11/9 15:17
 */
public class WinSystemLog extends Event{
    private String processGuid;
    private String destinationIp;
    private String utcTime;
    private String processId;
    private String sourceIsIpv6;
    private String initiated;
    private String destinationIsIpv6;
    private String sourcePort;
    private String user;
    private String image;
    private String protocol;
    private String destinationPortName;
    private String sourceHostname;
    private String destinationPort;
    private String sourceIp;

    public WinSystemLog(String processGuid, String destinationIp, String utcTime
                        , String processId, String sourceIsIpv6, String initiated
                        , String destinationIsIpv6, String sourcePort, String user
                        , String image, String protocol, String destinationPortName
                        , String sourceHostname, String destinationPort, String sourceIp) {

        this.processGuid = processGuid;
        this.destinationIp = destinationIp;
        this.utcTime = utcTime;
        this.processId = processId;
        this.sourceIsIpv6 = sourceIsIpv6;
        this.initiated = initiated;
        this.destinationIsIpv6 = destinationIsIpv6;
        this.sourcePort = sourcePort;
        this.user = user;
        this.image = image;
        this.protocol = protocol;
        this.destinationPortName = destinationPortName;
        this.sourceHostname = sourceHostname;
        this.destinationPort = destinationPort;
        this.sourceIp = sourceIp;
    }

    public WinSystemLog() {
        this("", "", "", "", "", "", ""
        , "", "", "", "", "", "", "", "");
    }

    public String getProcessGuid() {
        return  processGuid;
    }

    public void setProcessGuid(String processGuid) {
        this.processGuid = processGuid;
    }

    public String getDestinationIp() {
        return destinationIp;
    }

    public void setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
    }

    public String getUtcTime() {
        return utcTime;
    }

    public void setUtcTime(String utcTime) {
        this.utcTime = utcTime;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getSourceIsIpv6() {
        return sourceIsIpv6;
    }

    public void setSourceIsIpv6(String sourceIsIpv6) {
        this.sourceIsIpv6 = sourceIsIpv6;
    }

    public String getInitiated() {
        return initiated;
    }

    public void setInitiated(String initiated) {
        this.initiated = initiated;
    }

    public String getDestinationIsIpv6() {
        return destinationIsIpv6;
    }

    public void setDestinationIsIpv6(String destinationIsIpv6) {
        this.destinationIsIpv6 = destinationIsIpv6;
    }

    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDestinationPortName() {
        return destinationPortName;
    }

    public void setDestinationPortName(String destinationPortName) {
        this.destinationPortName = destinationPortName;
    }

    public String getSourceHostname() {
        return sourceHostname;
    }

    public void setSourceHostname(String sourceHostname) {
        this.sourceHostname = sourceHostname;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    private boolean canEqual(Object obj) {
        return obj instanceof WinSystemLog;
    }

    public long getTimestamp()
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return format.parse(utcTime).getTime();
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        WinSystemLog other = (WinSystemLog) obj;
        return canEqual(obj) && processGuid.equals(other.getProcessGuid()) && destinationIp.equals(other.getDestinationIp())
                && utcTime.equals(other.getUtcTime()) && processId.equals(other.getProcessId())
                && sourceIsIpv6.equals(other.getSourceIsIpv6()) && initiated.equals(other.getInitiated())
                && destinationIsIpv6.equals(other.getDestinationIsIpv6()) && sourcePort.equals(other.getSourcePort())
                && user.equals(other.getUser()) && image.equals(other.getImage()) && protocol.equals(other.getProtocol())
                && destinationPortName.equals(other.getDestinationPortName()) && sourceHostname.equals(other.getSourceHostname())
                && destinationPort.equals(other.getDestinationPort()) && sourceIp.equals(other.getSourceIp());
    }

    @Override
    public int hashCode() {
        return processGuid.hashCode() + destinationIp.hashCode() + utcTime.hashCode() + processId.hashCode()
                + sourceIsIpv6.hashCode() + initiated.hashCode() + destinationIsIpv6.hashCode() + sourcePort.hashCode()
                + user.hashCode() + image.hashCode() + protocol.hashCode() + destinationPortName.hashCode()
                + sourceHostname.hashCode() + destinationPortName.hashCode() + sourceIp.hashCode();
    }

    @Override
    public String toString() {
        return "WinSysLog{" + "ProcessGuid:" + processGuid + ", DestinationIp:" + destinationIp + ", UtcTime:"
                + utcTime + ", ProcessId:" + processId + ", SourceIsIpv6:" + sourceIsIpv6 + ", Initiated:"
                + initiated + ", DestinationIsIpv6:" + destinationIsIpv6 + ", SourcePort:" + sourcePort
                + ", User:" + user + ", Image:" + image + ", Protocol:" + protocol + ", DestinationPortName:"
                + destinationPortName + ", SourceHostname:" + sourceHostname + ", DestinationPort:"
                + destinationPort + ", SourceIp:" + sourceIp +"}";
    }
}
