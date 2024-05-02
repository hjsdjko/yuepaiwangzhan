package com.entity.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 摄影师
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class SheyingshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


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
     * 年龄
     */
    private Integer age;


    /**
     * 风格
     */
    private Integer fenggeTypes;


    /**
     * 星级
     */
    private Integer sheyingshiXingjiTypes;


    /**
     * 摄影师照片
     */
    private String sheyingshiPhoto;


    /**
     * 摄影师详情
     */
    private String sheyingshiContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：摄影师名称
	 */
    public String getSheyingshiName() {
        return sheyingshiName;
    }


    /**
	 * 设置：摄影师名称
	 */
    public void setSheyingshiName(String sheyingshiName) {
        this.sheyingshiName = sheyingshiName;
    }
    /**
	 * 获取：摄影师手机号
	 */
    public String getSheyingshiPhone() {
        return sheyingshiPhone;
    }


    /**
	 * 设置：摄影师手机号
	 */
    public void setSheyingshiPhone(String sheyingshiPhone) {
        this.sheyingshiPhone = sheyingshiPhone;
    }
    /**
	 * 获取：摄影师身份证号
	 */
    public String getSheyingshiIdNumber() {
        return sheyingshiIdNumber;
    }


    /**
	 * 设置：摄影师身份证号
	 */
    public void setSheyingshiIdNumber(String sheyingshiIdNumber) {
        this.sheyingshiIdNumber = sheyingshiIdNumber;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：年龄
	 */
    public Integer getAge() {
        return age;
    }


    /**
	 * 设置：年龄
	 */
    public void setAge(Integer age) {
        this.age = age;
    }
    /**
	 * 获取：风格
	 */
    public Integer getFenggeTypes() {
        return fenggeTypes;
    }


    /**
	 * 设置：风格
	 */
    public void setFenggeTypes(Integer fenggeTypes) {
        this.fenggeTypes = fenggeTypes;
    }
    /**
	 * 获取：星级
	 */
    public Integer getSheyingshiXingjiTypes() {
        return sheyingshiXingjiTypes;
    }


    /**
	 * 设置：星级
	 */
    public void setSheyingshiXingjiTypes(Integer sheyingshiXingjiTypes) {
        this.sheyingshiXingjiTypes = sheyingshiXingjiTypes;
    }
    /**
	 * 获取：摄影师照片
	 */
    public String getSheyingshiPhoto() {
        return sheyingshiPhoto;
    }


    /**
	 * 设置：摄影师照片
	 */
    public void setSheyingshiPhoto(String sheyingshiPhoto) {
        this.sheyingshiPhoto = sheyingshiPhoto;
    }
    /**
	 * 获取：摄影师详情
	 */
    public String getSheyingshiContent() {
        return sheyingshiContent;
    }


    /**
	 * 设置：摄影师详情
	 */
    public void setSheyingshiContent(String sheyingshiContent) {
        this.sheyingshiContent = sheyingshiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
