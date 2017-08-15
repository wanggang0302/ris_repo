/**
 * SysActormenumap.java
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
public class SysActormenumap {

    /**
     * GUID
     */
    private Object id;

    /**
     * 角色code
     */
    private BigDecimal rolecode;

    /**
     * 菜单code
     */
    private BigDecimal menucode;

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

    public BigDecimal getRolecode() {
        return rolecode;
    }

    public void setRolecode(BigDecimal rolecode) {
        this.rolecode = rolecode;
    }

    public BigDecimal getMenucode() {
        return menucode;
    }

    public void setMenucode(BigDecimal menucode) {
        this.menucode = menucode;
    }

    public Object getAreacode() {
        return areacode;
    }

    public void setAreacode(Object areacode) {
        this.areacode = areacode;
    }

}
