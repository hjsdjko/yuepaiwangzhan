package com.entity.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 照片库
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhaopiankuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 照片名字
     */
    private String zhaopiankuName;


    /**
     * 照片类型
     */
    private Integer zhaopiankuTypes;


    /**
     * 照片
     */
    private String zhaopiankuPhoto;


    /**
     * 照片详情
     */
    private String zhaopiankuContent;


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
	 * 获取：照片名字
	 */
    public String getZhaopiankuName() {
        return zhaopiankuName;
    }


    /**
	 * 设置：照片名字
	 */
    public void setZhaopiankuName(String zhaopiankuName) {
        this.zhaopiankuName = zhaopiankuName;
    }
    /**
	 * 获取：照片类型
	 */
    public Integer getZhaopiankuTypes() {
        return zhaopiankuTypes;
    }


    /**
	 * 设置：照片类型
	 */
    public void setZhaopiankuTypes(Integer zhaopiankuTypes) {
        this.zhaopiankuTypes = zhaopiankuTypes;
    }
    /**
	 * 获取：照片
	 */
    public String getZhaopiankuPhoto() {
        return zhaopiankuPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setZhaopiankuPhoto(String zhaopiankuPhoto) {
        this.zhaopiankuPhoto = zhaopiankuPhoto;
    }
    /**
	 * 获取：照片详情
	 */
    public String getZhaopiankuContent() {
        return zhaopiankuContent;
    }


    /**
	 * 设置：照片详情
	 */
    public void setZhaopiankuContent(String zhaopiankuContent) {
        this.zhaopiankuContent = zhaopiankuContent;
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
