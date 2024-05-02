package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.ZhaopiankuEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 照片库
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhaopianku")
public class ZhaopiankuView extends ZhaopiankuEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 照片类型的值
		*/
		private String zhaopiankuValue;



	public ZhaopiankuView() {

	}

	public ZhaopiankuView(ZhaopiankuEntity zhaopiankuEntity) {
		try {
			BeanUtils.copyProperties(this, zhaopiankuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 照片类型的值
			*/
			public String getZhaopiankuValue() {
				return zhaopiankuValue;
			}
			/**
			* 设置： 照片类型的值
			*/
			public void setZhaopiankuValue(String zhaopiankuValue) {
				this.zhaopiankuValue = zhaopiankuValue;
			}












}
