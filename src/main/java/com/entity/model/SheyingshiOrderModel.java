package com.entity.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 摄影师订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class SheyingshiOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 摄影师
     */
    private Integer sheyingshiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 订单类型
     */
    private Integer sheyingshiOrderTypes;


    /**
     * 预定开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date sheyingshiOrderStartTime;


    /**
     * 预定结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date sheyingshiOrderEndTime;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：摄影师
	 */
    public Integer getSheyingshiId() {
        return sheyingshiId;
    }


    /**
	 * 设置：摄影师
	 */
    public void setSheyingshiId(Integer sheyingshiId) {
        this.sheyingshiId = sheyingshiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getSheyingshiOrderTypes() {
        return sheyingshiOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setSheyingshiOrderTypes(Integer sheyingshiOrderTypes) {
        this.sheyingshiOrderTypes = sheyingshiOrderTypes;
    }
    /**
	 * 获取：预定开始时间
	 */
    public Date getSheyingshiOrderStartTime() {
        return sheyingshiOrderStartTime;
    }


    /**
	 * 设置：预定开始时间
	 */
    public void setSheyingshiOrderStartTime(Date sheyingshiOrderStartTime) {
        this.sheyingshiOrderStartTime = sheyingshiOrderStartTime;
    }
    /**
	 * 获取：预定结束时间
	 */
    public Date getSheyingshiOrderEndTime() {
        return sheyingshiOrderEndTime;
    }


    /**
	 * 设置：预定结束时间
	 */
    public void setSheyingshiOrderEndTime(Date sheyingshiOrderEndTime) {
        this.sheyingshiOrderEndTime = sheyingshiOrderEndTime;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
