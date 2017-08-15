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
    private String id;

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
    private String areacode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

}
