package com.jfsoft.template.service;

import com.jfsoft.model.BaseTemplate;

import java.util.List;
import java.util.Map;

/**
 * Created by matq on 2017/8/16.
 */
public interface ITemplateService {
    /**查询模板列表*/
    List<BaseTemplate> getTemplateList() throws Exception;
    /**根据id查询模板详细信息*/
    BaseTemplate getTemplatedetail(String id) throws Exception;
    /**添加模板*/
    Map<String, Object> insert(BaseTemplate baseTemplate) throws  Exception;
    /**删除模板*/
    Map<String,Object> delete(String id) throws Exception;
    /**更改模板*/
    Map<String,Object> update(BaseTemplate baseTemplate)throws Exception;
    /***根据模板类型查找*/
    List<BaseTemplate>  getTemplateByType(String type)throws Exception;
}
