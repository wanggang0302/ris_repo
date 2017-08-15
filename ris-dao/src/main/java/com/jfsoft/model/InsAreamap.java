/**
 * InsAreamap.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.model;

import java.math.BigDecimal;

/**
 * null
 * 
 * @author wanggang
 * @version 1.0 2017-08-15
 */
public class InsAreamap {

    /**
     * GUID
     */
    private String id;

    /**
     * 检查号
     */
    private BigDecimal checkno;

    /**
     * 推送区域号
     */
    private BigDecimal pushcode;

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

    public BigDecimal getCheckno() {
        return checkno;
    }

    public void setCheckno(BigDecimal checkno) {
        this.checkno = checkno;
    }

    public BigDecimal getPushcode() {
        return pushcode;
    }

    public void setPushcode(BigDecimal pushcode) {
        this.pushcode = pushcode;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

}
