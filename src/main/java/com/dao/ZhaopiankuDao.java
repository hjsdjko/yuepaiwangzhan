package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ZhaopiankuEntity;
import com.entity.view.ZhaopiankuView;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 照片库 Dao 接口
 *
 * @author 
 */
public interface ZhaopiankuDao extends BaseMapper<ZhaopiankuEntity> {

   List<ZhaopiankuView> selectListView(Pagination page, @Param("params") Map<String, Object> params);

}
