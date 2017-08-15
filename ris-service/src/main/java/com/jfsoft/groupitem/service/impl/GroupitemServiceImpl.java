package com.jfsoft.groupitem.service.impl;

import com.jfsoft.groupitem.service.IGroupitemService;
import com.jfsoft.mapper.BaseGroupitemMapper;
import com.jfsoft.model.BaseGroupitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by JFYT002 on 2017/8/15.
 */
@Service("groupitemService")
public class GroupitemServiceImpl implements IGroupitemService{
    @Autowired
    private BaseGroupitemMapper baseGroupitemMapper;
    @Override
    public List<BaseGroupitem> getGroupitemList()  throws Exception{
        List<BaseGroupitem> groupitemList = baseGroupitemMapper.getGroupList();
        return groupitemList;
    }

    @Override
    public Map<String, Object> insert(BaseGroupitem baseGroupitem) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        UUID uuid = UUID.randomUUID();
        baseGroupitem.setId(uuid.toString());
        baseGroupitem.setAreacode(001);
        baseGroupitem.setCode(new BigDecimal(3));
        int count = baseGroupitemMapper.insert(baseGroupitem);
        if(count>0){
            map.put("status","success");
        }
        else {
            map.put("status","failure");
        }
            return map;
    }

    @Override
    public Map<String, Object> delete(String id) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        int count =baseGroupitemMapper.deleteByPrimaryKey(id);
        if(count>0){
            map.put("status","success");
        }
        else {
            map.put("status","failure");
        }
        return map;
    }

    @Override
    public Map<String, Object> update(BaseGroupitem baseGroupitem) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();;
        baseGroupitem.setAreacode(001);
        baseGroupitem.setCode(new BigDecimal(3));
        int count = baseGroupitemMapper.updateByPrimaryKey(baseGroupitem);
        if(count>0){
            map.put("status","success");
        }
        else {
            map.put("status","failure");
        }
        return map;
    }
}
