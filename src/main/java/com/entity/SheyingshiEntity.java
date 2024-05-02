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
 * 摄影师
 *
 * @author 
 * @email
 */
@TableName("sheyingshi")
public class SheyingshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SheyingshiEntity() {

	}

	public SheyingshiEntity(T t) {
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
        return "Sheyingshi{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", sheyingshiName=" + sheyingshiName +
            ", sheyingshiPhone=" + sheyingshiPhone +
            ", sheyingshiIdNumber=" + sheyingshiIdNumber +
            ", sexTypes=" + sexTypes +
            ", age=" + age +
            ", fenggeTypes=" + fenggeTypes +
            ", sheyingshiXingjiTypes=" + sheyingshiXingjiTypes +
            ", sheyingshiPhoto=" + sheyingshiPhoto +
            ", sheyingshiContent=" + sheyingshiContent +
            ", createTime=" + createTime +
        "}";
    }
}
