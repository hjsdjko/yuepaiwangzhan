package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.SheyingshiOrderEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 摄影师订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("sheyingshi_order")
public class SheyingshiOrderView extends SheyingshiOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 订单类型的值
		*/
		private String sheyingshiOrderValue;



		//级联表 sheyingshi
			/**
			* 摄影师名称
			*/
			private String sheyingshiName;
			/**
			* 摄影师手机号
			*/
			private String sheyingshiPhone;
			/**
			* 摄影师身份证号
			*/
			private String sheyingshiIdNumber;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 年龄
			*/
			private Integer age;
			/**
			* 风格
			*/
			private Integer fenggeTypes;
				/**
				* 风格的值
				*/
				private String fenggeValue;
			/**
			* 星级
			*/
			private Integer sheyingshiXingjiTypes;
				/**
				* 星级的值
				*/
				private String sheyingshiXingjiValue;
			/**
			* 摄影师照片
			*/
			private String sheyingshiPhoto;
			/**
			* 摄影师详情
			*/
			private String sheyingshiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户照片
			*/
			private String yonghuPhoto;
//			/**
//			* 性别
//			*/
//			private Integer sexTypes;
//				/**
//				* 性别的值
//				*/
//				private String sexValue;

	public SheyingshiOrderView() {

	}

	public SheyingshiOrderView(SheyingshiOrderEntity sheyingshiOrderEntity) {
		try {
			BeanUtils.copyProperties(this, sheyingshiOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getSheyingshiOrderValue() {
				return sheyingshiOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setSheyingshiOrderValue(String sheyingshiOrderValue) {
				this.sheyingshiOrderValue = sheyingshiOrderValue;
			}













				//级联表的get和set sheyingshi
					/**
					* 获取： 摄影师名称
					*/
					public String getSheyingshiName() {
						return sheyingshiName;
					}
					/**
					* 设置： 摄影师名称
					*/
					public void setSheyingshiName(String sheyingshiName) {
						this.sheyingshiName = sheyingshiName;
					}
					/**
					* 获取： 摄影师手机号
					*/
					public String getSheyingshiPhone() {
						return sheyingshiPhone;
					}
					/**
					* 设置： 摄影师手机号
					*/
					public void setSheyingshiPhone(String sheyingshiPhone) {
						this.sheyingshiPhone = sheyingshiPhone;
					}
					/**
					* 获取： 摄影师身份证号
					*/
					public String getSheyingshiIdNumber() {
						return sheyingshiIdNumber;
					}
					/**
					* 设置： 摄影师身份证号
					*/
					public void setSheyingshiIdNumber(String sheyingshiIdNumber) {
						this.sheyingshiIdNumber = sheyingshiIdNumber;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
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
					* 获取： 年龄
					*/
					public Integer getAge() {
						return age;
					}
					/**
					* 设置： 年龄
					*/
					public void setAge(Integer age) {
						this.age = age;
					}
					/**
					* 获取： 风格
					*/
					public Integer getFenggeTypes() {
						return fenggeTypes;
					}
					/**
					* 设置： 风格
					*/
					public void setFenggeTypes(Integer fenggeTypes) {
						this.fenggeTypes = fenggeTypes;
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
					* 获取： 星级
					*/
					public Integer getSheyingshiXingjiTypes() {
						return sheyingshiXingjiTypes;
					}
					/**
					* 设置： 星级
					*/
					public void setSheyingshiXingjiTypes(Integer sheyingshiXingjiTypes) {
						this.sheyingshiXingjiTypes = sheyingshiXingjiTypes;
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
					/**
					* 获取： 摄影师照片
					*/
					public String getSheyingshiPhoto() {
						return sheyingshiPhoto;
					}
					/**
					* 设置： 摄影师照片
					*/
					public void setSheyingshiPhoto(String sheyingshiPhoto) {
						this.sheyingshiPhoto = sheyingshiPhoto;
					}
					/**
					* 获取： 摄影师详情
					*/
					public String getSheyingshiContent() {
						return sheyingshiContent;
					}
					/**
					* 设置： 摄影师详情
					*/
					public void setSheyingshiContent(String sheyingshiContent) {
						this.sheyingshiContent = sheyingshiContent;
					}













				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
//					/**
//					* 获取： 性别
//					*/
//					public Integer getSexTypes() {
//						return sexTypes;
//					}
//					/**
//					* 设置： 性别
//					*/
//					public void setSexTypes(Integer sexTypes) {
//						this.sexTypes = sexTypes;
//					}
//
//
//						/**
//						* 获取： 性别的值
//						*/
//						public String getSexValue() {
//							return sexValue;
//						}
//						/**
//						* 设置： 性别的值
//						*/
//						public void setSexValue(String sexValue) {
//							this.sexValue = sexValue;
//						}



}
