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
 * 照片库
 *
 * @author 
 * @email
 */
@TableName("zhaopianku")
public class ZhaopiankuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhaopiankuEntity() {

	}

	public ZhaopiankuEntity(T t) {
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
     * 照片名字
     */
    @TableField(value = "zhaopianku_name")

    private String zhaopiankuName;


    /**
     * 照片类型
     */
    @TableField(value = "zhaopianku_types")

    private Integer zhaopiankuTypes;


    /**
     * 照片
     */
    @TableField(value = "zhaopianku_photo")

    private String zhaopiankuPhoto;


    /**
     * 照片详情
     */
    @TableField(value = "zhaopianku_content")

    private String zhaopiankuContent;


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
	 * 设置：照片名字
	 */
    public String getZhaopiankuName() {
        return zhaopiankuName;
    }


    /**
	 * 获取：照片名字
	 */

    public void setZhaopiankuName(String zhaopiankuName) {
        this.zhaopiankuName = zhaopiankuName;
    }
    /**
	 * 设置：照片类型
	 */
    public Integer getZhaopiankuTypes() {
        return zhaopiankuTypes;
    }


    /**
	 * 获取：照片类型
	 */

    public void setZhaopiankuTypes(Integer zhaopiankuTypes) {
        this.zhaopiankuTypes = zhaopiankuTypes;
    }
    /**
	 * 设置：照片
	 */
    public String getZhaopiankuPhoto() {
        return zhaopiankuPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setZhaopiankuPhoto(String zhaopiankuPhoto) {
        this.zhaopiankuPhoto = zhaopiankuPhoto;
    }
    /**
	 * 设置：照片详情
	 */
    public String getZhaopiankuContent() {
        return zhaopiankuContent;
    }


    /**
	 * 获取：照片详情
	 */

    public void setZhaopiankuContent(String zhaopiankuContent) {
        this.zhaopiankuContent = zhaopiankuContent;
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
        return "Zhaopianku{" +
            "id=" + id +
            ", zhaopiankuName=" + zhaopiankuName +
            ", zhaopiankuTypes=" + zhaopiankuTypes +
            ", zhaopiankuPhoto=" + zhaopiankuPhoto +
            ", zhaopiankuContent=" + zhaopiankuContent +
            ", createTime=" + createTime +
        "}";
    }
}
