package com.jfsoft.groupitem.service;

import com.jfsoft.model.BaseGroupitem;

import java.util.List;
import java.util.Map;

/**
 * Created by matq on 2017/8/15.
 */
public interface IGroupitemService  {
    /**查询全部收费项目*/
    List<BaseGroupitem> getGroupitemList() throws Exception;

    /**插入收费项目*/
    Map<String, Object> insert(BaseGroupitem baseGroupitem) throws Exception;

    /**删除指定收费项目*/
    Map<String, Object> delete(String id) throws Exception;

    /**更改收费项目*/
    Map<String, Object> update(BaseGroupitem baseGroupitem) throws Exception;
}
