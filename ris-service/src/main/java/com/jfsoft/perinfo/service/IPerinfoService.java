package com.jfsoft.perinfo.service;

import com.jfsoft.model.InspectPerinfo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by matq on 2017/8/15.
 */
public interface IPerinfoService {

    /**查询人员信息*/
    List<InspectPerinfo> getPerinfoList()throws Exception;

    /**按条件查询人员信息*/
    List<InspectPerinfo> getPerinfoDetail(BigDecimal checkno, String statuscode, String company, String timeBegin, String timeEnd)throws Exception;

    /**插入人员信息*/
    Map<String, Object> insert(InspectPerinfo inspectPerinfo) throws Exception;
}
