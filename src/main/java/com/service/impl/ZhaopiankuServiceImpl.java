package com.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.ZhaopiankuDao;
import com.entity.ZhaopiankuEntity;
import com.entity.view.ZhaopiankuView;
import com.service.ZhaopiankuService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * 照片库 服务实现类
 */
@Service("zhaopiankuService")
@Transactional
public class ZhaopiankuServiceImpl extends ServiceImpl<ZhaopiankuDao, ZhaopiankuEntity> implements ZhaopiankuService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ZhaopiankuView> page =new Query<ZhaopiankuView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
