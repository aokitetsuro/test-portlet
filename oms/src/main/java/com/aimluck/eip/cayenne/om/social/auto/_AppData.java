package com.aimluck.eip.cayenne.om.social.auto;

/** Class _AppData was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _AppData extends org.apache.cayenne.CayenneDataObject {

    public static final String APP_ID_PROPERTY = "appId";
    public static final String LOGIN_NAME_PROPERTY = "loginName";
    public static final String NAME_PROPERTY = "name";
    public static final String VALUE_PROPERTY = "value";

    public static final String ID_PK_COLUMN = "ID";

    public void setAppId(String appId) {
        writeProperty("appId", appId);
    }
    public String getAppId() {
        return (String)readProperty("appId");
    }
    
    
    public void setLoginName(String loginName) {
        writeProperty("loginName", loginName);
    }
    public String getLoginName() {
        return (String)readProperty("loginName");
    }
    
    
    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }
    
    
    public void setValue(String value) {
        writeProperty("value", value);
    }
    public String getValue() {
        return (String)readProperty("value");
    }
    
    
}