/**
 * BaseItempartmap.java
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
public class BaseItempartmap {

    /**
     * GUID
     */
    private Object id;

    /**
     * 收费组合code
     */
    private BigDecimal itemcode;

    /**
     * 部位code
     */
    private BigDecimal partcode;

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

    public BigDecimal getItemcode() {
        return itemcode;
    }

    public void setItemcode(BigDecimal itemcode) {
        this.itemcode = itemcode;
    }

    public BigDecimal getPartcode() {
        return partcode;
    }

    public void setPartcode(BigDecimal partcode) {
        this.partcode = partcode;
    }

    public Object getAreacode() {
        return areacode;
    }

    public void setAreacode(Object areacode) {
        this.areacode = areacode;
    }

}
