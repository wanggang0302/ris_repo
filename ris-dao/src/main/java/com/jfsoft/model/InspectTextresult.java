/**
 * InspectTextresult.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-18 Created
 */
package com.jfsoft.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * null
 * 
 * @author wanggang
 * @version 1.0 2017-08-18
 */
public class InspectTextresult {

    /**
     * GUID
     */
    private String id;

    /**
     * 检查号(业务唯一)
     */
    private String inspectno;

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
    private String checkdocname;

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
    private String auditdocname;

    /**
     * 审核时间
     */
    private Date audittime;

    /**
     * 审核状态
     */
    private String auditstatus;
    /**
     * 是否阳性报告（正常：阴性   异常 ：阳性）
     */
    private String reportnature;

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
    private String memo;

    /**
     * 所属区域号
     */
    private String areacode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInspectno() {
        return inspectno;
    }

    public void setInspectno(String inspectno) {
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

    public String getCheckdocname() {
        return checkdocname;
    }

    public void setCheckdocname(String checkdocname) {
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

    public String getAuditdocname() {
        return auditdocname;
    }

    public String getReportnature() {
        return reportnature;
    }

    public void setAuditdocname(String auditdocname) {
        this.auditdocname = auditdocname;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public String getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus;
    }

    public void setReportnature(String reportnature) {
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

}
