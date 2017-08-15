/**
 * InsIllnessmap.java
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
public class InsIllnessmap {

    /**
     * GUID
     */
    private Object id;

    /**
     * 体检号
     */
    private BigDecimal checkno;

    /**
     * 疾病code
     */
    private BigDecimal illnesscode;

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

    public BigDecimal getCheckno() {
        return checkno;
    }

    public void setCheckno(BigDecimal checkno) {
        this.checkno = checkno;
    }

    public BigDecimal getIllnesscode() {
        return illnesscode;
    }

    public void setIllnesscode(BigDecimal illnesscode) {
        this.illnesscode = illnesscode;
    }

    public Object getAreacode() {
        return areacode;
    }

    public void setAreacode(Object areacode) {
        this.areacode = areacode;
    }

}
