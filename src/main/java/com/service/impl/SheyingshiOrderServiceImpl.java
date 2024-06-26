package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.SheyingshiOrderDao;
import com.entity.SheyingshiOrderEntity;
import com.service.SheyingshiOrderService;
import com.entity.view.SheyingshiOrderView;

/**
 * 摄影师订单 服务实现类
 */
@Service("sheyingshiOrderService")
@Transactional
public class SheyingshiOrderServiceImpl extends ServiceImpl<SheyingshiOrderDao, SheyingshiOrderEntity> implements SheyingshiOrderService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<SheyingshiOrderView> page =new Query<SheyingshiOrderView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
