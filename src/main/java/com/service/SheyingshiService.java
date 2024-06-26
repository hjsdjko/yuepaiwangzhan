package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheyingshiEntity;
import java.util.Map;

/**
 * 摄影师 服务类
 */
public interface SheyingshiService extends IService<SheyingshiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}