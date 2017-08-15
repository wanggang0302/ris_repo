/**
 * InspectTextresult.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * null
 * 
 * @author wanggang
 * @version 1.0 2017-08-15
 */
public class InspectTextresult {

    /**
     * GUID
     */
    private Object id;

    /**
     * 检查号(业务唯一)
     */
    private BigDecimal inspectno;

    /**
     * 检查结论(富文本)
     */
    private String inspectresult;

    /**
     * 检查描述(富文本)
     */
    private String inspectdesc;

    /**
     * 检查医生code
     */
    private BigDecimal checkdoccode;

    /**
     * 检查医生姓名
     */
    private Object checkdocname;

    /**
     * 检查时间
     */
    private Date checktime;

    /**
     * 审核医生code
     */
    private BigDecimal auditdoccode;

    /**
     * 审核医生姓名
     */
    private Object auditdocname;

    /**
     * 审核时间
     */
    private Date audittime;

    /**
     * 是否阳性报告（正常：阴性   异常 ：阳性）
     */
    private Object reportnature;

    /**
     * 创建人code
     */
    private BigDecimal createcode;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改人code
     */
    private BigDecimal modifycode;

    /**
     * 修改时间
     */
    private Date modifytime;

    /**
     * 排序号
     */
    private BigDecimal sortnum;

    /**
     * 备注
     */
    private Object memo;

    /**
     * 所属区域号
     */
    private Object areacode;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public BigDecimal getInspectno() {
        return inspectno;
    }

    public void setInspectno(BigDecimal inspectno) {
        this.inspectno = inspectno;
    }

    public String getInspectresult() {
        return inspectresult;
    }

    public void setInspectresult(String inspectresult) {
        this.inspectresult = inspectresult == null ? null : inspectresult.trim();
    }

    public String getInspectdesc() {
        return inspectdesc;
    }

    public void setInspectdesc(String inspectdesc) {
        this.inspectdesc = inspectdesc == null ? null : inspectdesc.trim();
    }

    public BigDecimal getCheckdoccode() {
        return checkdoccode;
    }

    public void setCheckdoccode(BigDecimal checkdoccode) {
        this.checkdoccode = checkdoccode;
    }

    public Object getCheckdocname() {
        return checkdocname;
    }

    public void setCheckdocname(Object checkdocname) {
        this.checkdocname = checkdocname;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public BigDecimal getAuditdoccode() {
        return auditdoccode;
    }

    public void setAuditdoccode(BigDecimal auditdoccode) {
        this.auditdoccode = auditdoccode;
    }

    public Object getAuditdocname() {
        return auditdocname;
    }

    public void setAuditdocname(Object auditdocname) {
        this.auditdocname = auditdocname;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Object getReportnature() {
        return reportnature;
    }

    public void setReportnature(Object reportnature) {
        this.reportnature = reportnature;
    }

    public BigDecimal getCreatecode() {
        return createcode;
    }

    public void setCreatecode(BigDecimal createcode) {
        this.createcode = createcode;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getModifycode() {
        return modifycode;
    }

    public void setModifycode(BigDecimal modifycode) {
        this.modifycode = modifycode;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public BigDecimal getSortnum() {
        return sortnum;
    }

    public void setSortnum(BigDecimal sortnum) {
        this.sortnum = sortnum;
    }

    public Object getMemo() {
        return memo;
    }

    public void setMemo(Object memo) {
        this.memo = memo;
    }

    public Object getAreacode() {
        return areacode;
    }

    public void setAreacode(Object areacode) {
        this.areacode = areacode;
    }

}
