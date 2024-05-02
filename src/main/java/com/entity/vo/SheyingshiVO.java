package com.entity.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 摄影师
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("sheyingshi")
public class SheyingshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 摄影师名称
     */

    @TableField(value = "sheyingshi_name")
    private String sheyingshiName;


    /**
     * 摄影师手机号
     */

    @TableField(value = "sheyingshi_phone")
    private String sheyingshiPhone;


    /**
     * 摄影师身份证号
     */

    @TableField(value = "sheyingshi_id_number")
    private String sheyingshiIdNumber;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 年龄
     */

    @TableField(value = "age")
    private Integer age;


    /**
     * 风格
     */

    @TableField(value = "fengge_types")
    private Integer fenggeTypes;


    /**
     * 星级
     */

    @TableField(value = "sheyingshi_xingji_types")
    private Integer sheyingshiXingjiTypes;


    /**
     * 摄影师照片
     */

    @TableField(value = "sheyingshi_photo")
    private String sheyingshiPhoto;


    /**
     * 摄影师详情
     */

    @TableField(value = "sheyingshi_content")
    private String sheyingshiContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：摄影师名称
	 */
    public String getSheyingshiName() {
        return sheyingshiName;
    }


    /**
	 * 获取：摄影师名称
	 */

    public void setSheyingshiName(String sheyingshiName) {
        this.sheyingshiName = sheyingshiName;
    }
    /**
	 * 设置：摄影师手机号
	 */
    public String getSheyingshiPhone() {
        return sheyingshiPhone;
    }


    /**
	 * 获取：摄影师手机号
	 */

    public void setSheyingshiPhone(String sheyingshiPhone) {
        this.sheyingshiPhone = sheyingshiPhone;
    }
    /**
	 * 设置：摄影师身份证号
	 */
    public String getSheyingshiIdNumber() {
        return sheyingshiIdNumber;
    }


    /**
	 * 获取：摄影师身份证号
	 */

    public void setSheyingshiIdNumber(String sheyingshiIdNumber) {
        this.sheyingshiIdNumber = sheyingshiIdNumber;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：年龄
	 */
    public Integer getAge() {
        return age;
    }


    /**
	 * 获取：年龄
	 */

    public void setAge(Integer age) {
        this.age = age;
    }
    /**
	 * 设置：风格
	 */
    public Integer getFenggeTypes() {
        return fenggeTypes;
    }


    /**
	 * 获取：风格
	 */

    public void setFenggeTypes(Integer fenggeTypes) {
        this.fenggeTypes = fenggeTypes;
    }
    /**
	 * 设置：星级
	 */
    public Integer getSheyingshiXingjiTypes() {
        return sheyingshiXingjiTypes;
    }


    /**
	 * 获取：星级
	 */

    public void setSheyingshiXingjiTypes(Integer sheyingshiXingjiTypes) {
        this.sheyingshiXingjiTypes = sheyingshiXingjiTypes;
    }
    /**
	 * 设置：摄影师照片
	 */
    public String getSheyingshiPhoto() {
        return sheyingshiPhoto;
    }


    /**
	 * 获取：摄影师照片
	 */

    public void setSheyingshiPhoto(String sheyingshiPhoto) {
        this.sheyingshiPhoto = sheyingshiPhoto;
    }
    /**
	 * 设置：摄影师详情
	 */
    public String getSheyingshiContent() {
        return sheyingshiContent;
    }


    /**
	 * 获取：摄影师详情
	 */

    public void setSheyingshiContent(String sheyingshiContent) {
        this.sheyingshiContent = sheyingshiContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
