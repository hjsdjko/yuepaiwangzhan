package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.SheyingshiEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 摄影师
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("sheyingshi")
public class SheyingshiView extends SheyingshiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 风格的值
		*/
		private String fenggeValue;
		/**
		* 星级的值
		*/
		private String sheyingshiXingjiValue;



	public SheyingshiView() {

	}

	public SheyingshiView(SheyingshiEntity sheyingshiEntity) {
		try {
			BeanUtils.copyProperties(this, sheyingshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 风格的值
			*/
			public String getFenggeValue() {
				return fenggeValue;
			}
			/**
			* 设置： 风格的值
			*/
			public void setFenggeValue(String fenggeValue) {
				this.fenggeValue = fenggeValue;
			}
			/**
			* 获取： 星级的值
			*/
			public String getSheyingshiXingjiValue() {
				return sheyingshiXingjiValue;
			}
			/**
			* 设置： 星级的值
			*/
			public void setSheyingshiXingjiValue(String sheyingshiXingjiValue) {
				this.sheyingshiXingjiValue = sheyingshiXingjiValue;
			}











}
