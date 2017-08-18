package com.jfsoft.template.service.impl;

import com.jfsoft.mapper.BaseTemplateMapper;
import com.jfsoft.model.BaseTemplate;
import com.jfsoft.template.service.ITemplateService;
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
@Service("templateService")
public class TemplateServiceImpl implements ITemplateService{

    @Autowired
    private BaseTemplateMapper baseTemplateMapper;

    @Override
    public List<BaseTemplate> getTemplateList() throws  Exception{
        List<BaseTemplate> templateList =baseTemplateMapper.getTemplateList();
        return  templateList;
    }

    @Override
    public BaseTemplate getTemplatedetail(String id) throws Exception {
        BaseTemplate baseTemplate =baseTemplateMapper.selectByPrimaryKey(id);
        return baseTemplate;
    }

    @Override
    public Map<String, Object> insert(BaseTemplate baseTemplate) throws Exception {
        Map<String,Object> map = new HashMap<String,Object>();
        UUID uuid = UUID.randomUUID();
        baseTemplate.setId(uuid.toString());
        BigDecimal maxcode =baseTemplateMapper.getMaxCode();
        baseTemplate.setCode(maxcode.add(new BigDecimal(1)));
        baseTemplate.setAreacode("001");
        int count =baseTemplateMapper.insert(baseTemplate);
        if(count>0){
            map.put("status", Constants.RETURN_STATUS_SUCCESS);
        }
        else {
            map.put("status",Constants.RETURN_STATUS_FAILURE);
        }
        return map;
    }

    @Override
    public Map<String, Object> delete(String id) throws Exception {
        Map<String,Object> map =new HashMap<String,Object>();
        int count = baseTemplateMapper.deleteByPrimaryKey(id);
        if(count>0){
            map.put("status",Constants.RETURN_STATUS_SUCCESS);
        }
        else {
            map.put("status",Constants.RETURN_STATUS_FAILURE);
        }
        return map;
    }

    @Override
    public Map<String, Object> update(BaseTemplate baseTemplate) throws Exception {
        Map<String,Object> map =new HashMap<String,Object>();
        int count =baseTemplateMapper.updateByPrimaryKey(baseTemplate);
        if(count>0){
            map.put("status",Constants.RETURN_STATUS_SUCCESS);
        }
        else {
            map.put("status",Constants.RETURN_STATUS_FAILURE);
        }
        return map;
    }

    @Override
    public  List<BaseTemplate> getTemplateByType(String type) throws Exception {
        List<BaseTemplate> templateList =baseTemplateMapper.getTemplateByType(type);
        return  templateList;
    }
}
