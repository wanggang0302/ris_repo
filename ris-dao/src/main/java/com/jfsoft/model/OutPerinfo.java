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
    private String id;

    /**
     * 第三方数据的检查号体检号
     */
    private String infoid;

    /**
     * 体检者姓名
     */
    private String name;

    /**
     * 拼音码
     */
    private String pycode;

    /**
     * 登记时间
     */
    private Date regtime;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private BigDecimal age;

    /**
     * 民族
     */
    private String nation;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 身份证号
     */
    private String ssid;

    /**
     * 本人电话
     */
    private String tel;

    /**
     * 紧急联系人电话
     */
    private String linktel;

    /**
     * 所在单位
     */
    private String company;

    /**
     * 体重
     */
    private String weight;

    /**
     * 邮政编码
     */
    private String postcode;

    /**
     * 职业
     */
    private String profession;

    /**
     * 禁忌症
     */
    private String taboos;

    /**
     * 疾病史
     */
    private String medicalhistory;

    /**
     * 医嘱
     */
    private String docadvice;

    /**
     * 临床诊断
     */
    private String diagnosis;

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
    private String statuscode;

    /**
     * 开单医生code
     */
    private BigDecimal applydoccode;

    /**
     * 开单医生姓名
     */
    private String applydocname;

    /**
     * 开单科室
     */
    private String applydept;

    /**
     * 开单时间
     */
    private Date applytime;

    /**
     * 患者类型（住院门诊体检）
     */
    private String pertype;

    /**
     * 病区号
     */
    private String ward;

    /**
     * 床号
     */
    private String bednum;

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
    private String paystatus;

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
    private String memo;

    /**
     * 所属区域号
     */
    private String areacode;

    /**
     * 危急值
     */
    private String ungentvalue;

    /**
     */
    private String content1;

    /**
     */
    private String content2;

    /**
     */
    private String content3;

    /**
     */
    private String content4;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfoid() {
        return infoid;
    }

    public void setInfoid(String infoid) {
        this.infoid = infoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPycode() {
        return pycode;
    }

    public void setPycode(String pycode) {
        this.pycode = pycode;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLinktel() {
        return linktel;
    }

    public void setLinktel(String linktel) {
        this.linktel = linktel;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTaboos() {
        return taboos;
    }

    public void setTaboos(String taboos) {
        this.taboos = taboos;
    }

    public String getMedicalhistory() {
        return medicalhistory;
    }

    public void setMedicalhistory(String medicalhistory) {
        this.medicalhistory = medicalhistory;
    }

    public String getDocadvice() {
        return docadvice;
    }

    public void setDocadvice(String docadvice) {
        this.docadvice = docadvice == null ? null : docadvice.trim();
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
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

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public BigDecimal getApplydoccode() {
        return applydoccode;
    }

    public void setApplydoccode(BigDecimal applydoccode) {
        this.applydoccode = applydoccode;
    }

    public String getApplydocname() {
        return applydocname;
    }

    public void setApplydocname(String applydocname) {
        this.applydocname = applydocname;
    }

    public String getApplydept() {
        return applydept;
    }

    public void setApplydept(String applydept) {
        this.applydept = applydept;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public String getPertype() {
        return pertype;
    }

    public void setPertype(String pertype) {
        this.pertype = pertype;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getBednum() {
        return bednum;
    }

    public void setBednum(String bednum) {
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

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
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

    public String getUngentvalue() {
        return ungentvalue;
    }

    public void setUngentvalue(String ungentvalue) {
        this.ungentvalue = ungentvalue;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public String getContent3() {
        return content3;
    }

    public void setContent3(String content3) {
        this.content3 = content3;
    }

    public String getContent4() {
        return content4;
    }

    public void setContent4(String content4) {
        this.content4 = content4;
    }

}
