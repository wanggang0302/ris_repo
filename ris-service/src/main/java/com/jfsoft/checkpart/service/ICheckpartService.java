package com.jfsoft.checkpart.service;

import com.jfsoft.model.BaseCheckpart;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by matq on 2017/8/16.
 */
public interface ICheckpartService {

    /**查询详细部位*/
    BaseCheckpart checkpartDetail(String id)throws Exception;

    /**查询列表*/
    List<BaseCheckpart> getCheckpartList() throws Exception;

    /**插入部位*/
    Map<String,Object> insert(BaseCheckpart baseCheckpart) throws Exception;

    /**更改部位信息*/
    Map<String,Object> update(BaseCheckpart baseCheckpart) throws Exception;

    /**删除部位信息*/
    Map<String,Object> delete(String id) throws Exception;
}
