/**
 * SysActordeptmap.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-18 Created
 */
package com.jfsoft.model;

import java.math.BigDecimal;

/**
 * null
 * 
 * @author wanggang
 * @version 1.0 2017-08-18
 */
public class SysActordeptmap {

    /**
     * GUID
     */
    private String id;

    /**
     * 角色code
     */
    private BigDecimal actorcode;

    /**
     * 科室code
     */
    private BigDecimal deptcode;

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

    public BigDecimal getActorcode() {
        return actorcode;
    }

    public void setActorcode(BigDecimal actorcode) {
        this.actorcode = actorcode;
    }

    public BigDecimal getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(BigDecimal deptcode) {
        this.deptcode = deptcode;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

}
