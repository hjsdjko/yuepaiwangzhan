package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheyingshiOrderEntity;
import java.util.Map;

/**
 * 摄影师订单 服务类
 */
public interface SheyingshiOrderService extends IService<SheyingshiOrderEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}