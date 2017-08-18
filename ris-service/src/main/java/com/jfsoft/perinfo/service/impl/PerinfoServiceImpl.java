package com.jfsoft.perinfo.service.impl;

import com.jfsoft.mapper.InspectPerinfoMapper;
import com.jfsoft.model.InspectPerinfo;
import com.jfsoft.perinfo.service.IPerinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by matq on 2017/8/15.
 */
@Service("perinfoService")
public class PerinfoServiceImpl implements IPerinfoService {

    @Autowired
    private InspectPerinfoMapper inspectPerinfoMapper;

    @Override
    public List<InspectPerinfo> getPerinfoList() throws Exception{

        List<InspectPerinfo> inspectPerinfoList =inspectPerinfoMapper.getPerinfoList();

        return inspectPerinfoList;
    }

    @Override
    public List<InspectPerinfo> getPerinfoDetail(String checkno, String statuscode, String company, String timeBegin, String timeEnd) throws Exception {
        Map<String,Object> params = new HashMap<String,Object>();
        if(!StringUtils.isEmpty(checkno)){
            params.put("checkno",checkno);
        }
        if(!StringUtils.isEmpty(statuscode)){
            params.put("statuscode",statuscode);
        }
        if(!StringUtils.isEmpty(company)){
            params.put("company",company);
        }
        if(!StringUtils.isEmpty(timeBegin)){
            params.put("timeBegin",timeBegin);
        }
        if(!StringUtils.isEmpty(timeEnd)){
            params.put("timeEnd",timeEnd);
        }
        List<InspectPerinfo> inspectPerinfoList = inspectPerinfoMapper.getPerinfoDetail(params);
        return inspectPerinfoList;

    }

    @Override
    public Map<String, Object> insert(InspectPerinfo inspectPerinfo) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        UUID uuid = UUID.randomUUID();
        inspectPerinfo.setId(uuid.toString());
        inspectPerinfo.setAreacode("001");
        inspectPerinfo.setAge(new BigDecimal(14));
        inspectPerinfo.setCheckno("123");
        inspectPerinfo.setApplydept("男");
        inspectPerinfo.setLinktel("12654284564");
        int count = inspectPerinfoMapper.insert(inspectPerinfo);
        if(count>0){
            map.put("status","success");
        }
        else {
            map.put("status","failure");
        }
        return map;
    }
}
