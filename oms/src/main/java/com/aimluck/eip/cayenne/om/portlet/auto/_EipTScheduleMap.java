package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipTScheduleMap was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTScheduleMap extends org.apache.cayenne.CayenneDataObject {

    public static final String COMMON_CATEGORY_ID_PROPERTY = "commonCategoryId";
    public static final String SCHEDULE_ID_PROPERTY = "scheduleId";
    public static final String STATUS_PROPERTY = "status";
    public static final String TYPE_PROPERTY = "type";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String EIP_TCOMMON_CATEGORY_PROPERTY = "eipTCommonCategory";
    public static final String EIP_TSCHEDULE_PROPERTY = "eipTSchedule";
    public static final String TURBINE_USER_GROUP_ROLE_PROPERTY = "turbineUserGroupRole";

    public static final String ID_PK_COLUMN = "ID";

    public void setCommonCategoryId(Integer commonCategoryId) {
        writeProperty("commonCategoryId", commonCategoryId);
    }
    public Integer getCommonCategoryId() {
        return (Integer)readProperty("commonCategoryId");
    }
    
    
    public void setScheduleId(Integer scheduleId) {
        writeProperty("scheduleId", scheduleId);
    }
    public Integer getScheduleId() {
        return (Integer)readProperty("scheduleId");
    }
    
    
    public void setStatus(String status) {
        writeProperty("status", status);
    }
    public String getStatus() {
        return (String)readProperty("status");
    }
    
    
    public void setType(String type) {
        writeProperty("type", type);
    }
    public String getType() {
        return (String)readProperty("type");
    }
    
    
    public void setUserId(Integer userId) {
        writeProperty("userId", userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty("userId");
    }
    
    
    public void setEipTCommonCategory(com.aimluck.eip.cayenne.om.portlet.EipTCommonCategory eipTCommonCategory) {
        setToOneTarget("eipTCommonCategory", eipTCommonCategory, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipTCommonCategory getEipTCommonCategory() {
        return (com.aimluck.eip.cayenne.om.portlet.EipTCommonCategory)readProperty("eipTCommonCategory");
    } 
    
    
    public void setEipTSchedule(com.aimluck.eip.cayenne.om.portlet.EipTSchedule eipTSchedule) {
        setToOneTarget("eipTSchedule", eipTSchedule, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipTSchedule getEipTSchedule() {
        return (com.aimluck.eip.cayenne.om.portlet.EipTSchedule)readProperty("eipTSchedule");
    } 
    
    
    public void setTurbineUserGroupRole(com.aimluck.eip.cayenne.om.security.TurbineUserGroupRole turbineUserGroupRole) {
        setToOneTarget("turbineUserGroupRole", turbineUserGroupRole, true);
    }

    public com.aimluck.eip.cayenne.om.security.TurbineUserGroupRole getTurbineUserGroupRole() {
        return (com.aimluck.eip.cayenne.om.security.TurbineUserGroupRole)readProperty("turbineUserGroupRole");
    } 
    
    
}