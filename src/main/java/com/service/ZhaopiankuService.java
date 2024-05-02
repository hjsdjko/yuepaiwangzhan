package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.entity.ZhaopiankuEntity;
import com.utils.PageUtils;

import java.util.Map;

/**
 * 照片库 服务类
 */
public interface ZhaopiankuService extends IService<ZhaopiankuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}