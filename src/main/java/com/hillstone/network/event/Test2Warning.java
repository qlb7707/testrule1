package com.hillstone.network.event;

/**
 * @author lbqin
 * @ClassName: null.java
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @Date 2018/11/12 10:04
 */
public class Test2Warning {
   private long threat_id;
   private String processGuid;
   private String threat_name;
   private String image;

   public Test2Warning(long threat_id, String processGuid, String threat_name, String image) {
       this.threat_id = threat_id;
       this.processGuid = processGuid;
       this.threat_name = threat_name;
       this.image = image;
   }

   @Override
    public String toString() {
       return "Test2Warning{" + "threat_id:" + threat_id + ",processGuid:" + processGuid
               + ",threat_name:" + threat_name + ",image:" + image + "}";

   }
}
