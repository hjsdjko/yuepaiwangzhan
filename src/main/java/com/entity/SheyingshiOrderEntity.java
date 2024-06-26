package com.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * 摄影师订单
 *
 * @author 
 * @email
 */
@TableName("sheyingshi_order")
public class SheyingshiOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SheyingshiOrderEntity() {

	}

	public SheyingshiOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 摄影师
     */
    @TableField(value = "sheyingshi_id")

    private Integer sheyingshiId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 订单类型
     */
    @TableField(value = "sheyingshi_order_types")

    private Integer sheyingshiOrderTypes;


    /**
     * 预定开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "sheyingshi_order_start_time",fill = FieldFill.UPDATE)

    private Date sheyingshiOrderStartTime;


    /**
     * 预定结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "sheyingshi_order_end_time",fill = FieldFill.UPDATE)

    private Date sheyingshiOrderEndTime;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：摄影师
	 */
    public Integer getSheyingshiId() {
        return sheyingshiId;
    }


    /**
	 * 获取：摄影师
	 */

    public void setSheyingshiId(Integer sheyingshiId) {
        this.sheyingshiId = sheyingshiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getSheyingshiOrderTypes() {
        return sheyingshiOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setSheyingshiOrderTypes(Integer sheyingshiOrderTypes) {
        this.sheyingshiOrderTypes = sheyingshiOrderTypes;
    }
    /**
	 * 设置：预定开始时间
	 */
    public Date getSheyingshiOrderStartTime() {
        return sheyingshiOrderStartTime;
    }


    /**
	 * 获取：预定开始时间
	 */

    public void setSheyingshiOrderStartTime(Date sheyingshiOrderStartTime) {
        this.sheyingshiOrderStartTime = sheyingshiOrderStartTime;
    }
    /**
	 * 设置：预定结束时间
	 */
    public Date getSheyingshiOrderEndTime() {
        return sheyingshiOrderEndTime;
    }


    /**
	 * 获取：预定结束时间
	 */

    public void setSheyingshiOrderEndTime(Date sheyingshiOrderEndTime) {
        this.sheyingshiOrderEndTime = sheyingshiOrderEndTime;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SheyingshiOrder{" +
            "id=" + id +
            ", sheyingshiId=" + sheyingshiId +
            ", yonghuId=" + yonghuId +
            ", sheyingshiOrderTypes=" + sheyingshiOrderTypes +
            ", sheyingshiOrderStartTime=" + sheyingshiOrderStartTime +
            ", sheyingshiOrderEndTime=" + sheyingshiOrderEndTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
