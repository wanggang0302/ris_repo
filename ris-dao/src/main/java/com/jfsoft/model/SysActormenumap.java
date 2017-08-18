/**
 * SysActormenumap.java
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
public class SysActormenumap {

    /**
     * GUID
     */
    private String id;

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
    private String areacode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

}
