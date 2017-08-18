package com.jfsoft.checkpart.service.impl;

import com.jfsoft.checkpart.service.ICheckpartService;
import com.jfsoft.mapper.BaseCheckpartMapper;
import com.jfsoft.model.BaseCheckpart;
import com.jfsoft.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by matq on 2017/8/16.
 */
@Service("checkpartService")
public class CheckpartServiceImpl implements ICheckpartService {
    @Autowired
    private BaseCheckpartMapper baseCheckpartMapper;
    @Override
    public BaseCheckpart checkpartDetail(String id) throws Exception{
        BaseCheckpart baseCheckpart =baseCheckpartMapper.selectByPrimaryKey(id);
        return baseCheckpart;
    }

    @Override
    public List<BaseCheckpart> getCheckpartList() throws Exception {
        List<BaseCheckpart> baseCheckpartList =baseCheckpartMapper.getCheckpartList();
        return  baseCheckpartList;
    }

    @Override
    public Map<String, Object> insert(BaseCheckpart baseCheckpart) throws Exception {

        Map<String, Object> map = new HashMap<String, Object>();
        UUID uuid = UUID.randomUUID();
        baseCheckpart.setId(uuid.toString());
        BigDecimal maxcode = baseCheckpartMapper.getMaxCode();
        baseCheckpart.setCode(maxcode.add(new BigDecimal(1)));
        baseCheckpart.setAreacode("001");

        int count = baseCheckpartMapper.insert(baseCheckpart);
        if(count>0){
            map.put("status",Constants.RETURN_STATUS_SUCCESS);
        }
        else {
            map.put("status",Constants.RETURN_STATUS_FAILURE);
        }
        return map;
    }

    @Override
    public Map<String, Object> update(BaseCheckpart baseCheckpart) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();;
        baseCheckpart.setAreacode("001");
        baseCheckpart.setCode(new BigDecimal(3));
        int count = baseCheckpartMapper.updateByPrimaryKey(baseCheckpart);
        if(count>0){
            map.put("status",Constants.RETURN_STATUS_SUCCESS);
        }
        else {
            map.put("status",Constants.RETURN_STATUS_FAILURE);
        }
        return map;
    }

    @Override
    public Map<String, Object> delete(String id) throws Exception {
        Map<String,Object> map =new HashMap<String,Object>();
        int count =baseCheckpartMapper.deleteByPrimaryKey(id);
        if(count>0){
            map.put("status",Constants.RETURN_STATUS_SUCCESS);
        }
        else {
            map.put("status",Constants.RETURN_STATUS_FAILURE);
        }
        return map;
    }
}
