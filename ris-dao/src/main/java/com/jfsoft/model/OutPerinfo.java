/**
 * OutPerinfo.java
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
public class OutPerinfo {

    /**
     * GUID
     */
    private Object id;

    /**
     * 第三方数据的检查号体检号
     */
    private Object infoid;

    /**
     * 体检者姓名
     */
    private Object name;

    /**
     * 拼音码
     */
    private Object pycode;

    /**
     * 登记时间
     */
    private Date regtime;

    /**
     * 性别
     */
    private Object sex;

    /**
     * 年龄
     */
    private BigDecimal age;

    /**
     * 民族
     */
    private Object nation;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 身份证号
     */
    private Object ssid;

    /**
     * 本人电话
     */
    private Object tel;

    /**
     * 紧急联系人电话
     */
    private Object linktel;

    /**
     * 所在单位
     */
    private Object company;

    /**
     * 体重
     */
    private Object weight;

    /**
     * 邮政编码
     */
    private Object postcode;

    /**
     * 职业
     */
    private Object profession;

    /**
     * 禁忌症
     */
    private Object taboos;

    /**
     * 疾病史
     */
    private Object medicalhistory;

    /**
     * 医嘱
     */
    private String docadvice;

    /**
     * 临床诊断
     */
    private Object diagnosis;

    /**
     * 是否急诊（1是，0否）
     */
    private Short isemergency;

    /**
     * 收费项目编码（腹部彩超）
     */
    private BigDecimal groupcode;

    /**
     * 检验的状态（1:已登记，2:已诊断，3:已审核，4:已打印）
     */
    private Object statuscode;

    /**
     * 开单医生code
     */
    private BigDecimal applydoccode;

    /**
     * 开单医生姓名
     */
    private Object applydocname;

    /**
     * 开单科室
     */
    private Object applydept;

    /**
     * 开单时间
     */
    private Date applytime;

    /**
     * 患者类型（住院门诊体检）
     */
    private Object pertype;

    /**
     * 病区号
     */
    private Object ward;

    /**
     * 床号
     */
    private Object bednum;

    /**
     * 创建人code
     */
    private BigDecimal createcode;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 缴费状态(0:未缴费,1:已缴费)
     */
    private Object paystatus;

    /**
     * 缴费时间
     */
    private Date paytime;

    /**
     * 修改人code
     */
    private BigDecimal modifycode;

    /**
     * 修改时间
     */
    private Date modifytime;

    /**
     * 备注
     */
    private Object memo;

    /**
     * 所属区域号
     */
    private Object areacode;

    /**
     * 危急值
     */
    private Object ungentvalue;

    /**
     */
    private Object content1;

    /**
     */
    private Object content2;

    /**
     */
    private Object content3;

    /**
     */
    private Object content4;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getInfoid() {
        return infoid;
    }

    public void setInfoid(Object infoid) {
        this.infoid = infoid;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getPycode() {
        return pycode;
    }

    public void setPycode(Object pycode) {
        this.pycode = pycode;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public Object getNation() {
        return nation;
    }

    public void setNation(Object nation) {
        this.nation = nation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Object getSsid() {
        return ssid;
    }

    public void setSsid(Object ssid) {
        this.ssid = ssid;
    }

    public Object getTel() {
        return tel;
    }

    public void setTel(Object tel) {
        this.tel = tel;
    }

    public Object getLinktel() {
        return linktel;
    }

    public void setLinktel(Object linktel) {
        this.linktel = linktel;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

    public Object getPostcode() {
        return postcode;
    }

    public void setPostcode(Object postcode) {
        this.postcode = postcode;
    }

    public Object getProfession() {
        return profession;
    }

    public void setProfession(Object profession) {
        this.profession = profession;
    }

    public Object getTaboos() {
        return taboos;
    }

    public void setTaboos(Object taboos) {
        this.taboos = taboos;
    }

    public Object getMedicalhistory() {
        return medicalhistory;
    }

    public void setMedicalhistory(Object medicalhistory) {
        this.medicalhistory = medicalhistory;
    }

    public String getDocadvice() {
        return docadvice;
    }

    public void setDocadvice(String docadvice) {
        this.docadvice = docadvice == null ? null : docadvice.trim();
    }

    public Object getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Object diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Short getIsemergency() {
        return isemergency;
    }

    public void setIsemergency(Short isemergency) {
        this.isemergency = isemergency;
    }

    public BigDecimal getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(BigDecimal groupcode) {
        this.groupcode = groupcode;
    }

    public Object getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(Object statuscode) {
        this.statuscode = statuscode;
    }

    public BigDecimal getApplydoccode() {
        return applydoccode;
    }

    public void setApplydoccode(BigDecimal applydoccode) {
        this.applydoccode = applydoccode;
    }

    public Object getApplydocname() {
        return applydocname;
    }

    public void setApplydocname(Object applydocname) {
        this.applydocname = applydocname;
    }

    public Object getApplydept() {
        return applydept;
    }

    public void setApplydept(Object applydept) {
        this.applydept = applydept;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public Object getPertype() {
        return pertype;
    }

    public void setPertype(Object pertype) {
        this.pertype = pertype;
    }

    public Object getWard() {
        return ward;
    }

    public void setWard(Object ward) {
        this.ward = ward;
    }

    public Object getBednum() {
        return bednum;
    }

    public void setBednum(Object bednum) {
        this.bednum = bednum;
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

    public Object getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Object paystatus) {
        this.paystatus = paystatus;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
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

    public Object getUngentvalue() {
        return ungentvalue;
    }

    public void setUngentvalue(Object ungentvalue) {
        this.ungentvalue = ungentvalue;
    }

    public Object getContent1() {
        return content1;
    }

    public void setContent1(Object content1) {
        this.content1 = content1;
    }

    public Object getContent2() {
        return content2;
    }

    public void setContent2(Object content2) {
        this.content2 = content2;
    }

    public Object getContent3() {
        return content3;
    }

    public void setContent3(Object content3) {
        this.content3 = content3;
    }

    public Object getContent4() {
        return content4;
    }

    public void setContent4(Object content4) {
        this.content4 = content4;
    }

}
