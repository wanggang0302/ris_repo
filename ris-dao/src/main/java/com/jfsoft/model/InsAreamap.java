/**
 * InsAreamap.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-18 Created
 */
package com.jfsoft.model;

/**
 * null
 * 
 * @author wanggang
 * @version 1.0 2017-08-18
 */
public class InsAreamap {

    /**
     * GUID
     */
    private String id;

    /**
     * 检查号
     */
    private String checkno;

    /**
     * 推送区域号
     */
    private String pushcode;

    /**
     * 区域编码
     */
    private String areacode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCheckno() {
        return checkno;
    }

    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    public String getPushcode() {
        return pushcode;
    }

    public void setPushcode(String pushcode) {
        this.pushcode = pushcode;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

}
