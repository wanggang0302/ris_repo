/**
 * SysActordeptmap.java
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
public class SysActordeptmap {

    /**
     * GUID
     */
    private Object id;

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
    private Object areacode;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
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

    public Object getAreacode() {
        return areacode;
    }

    public void setAreacode(Object areacode) {
        this.areacode = areacode;
    }

}
