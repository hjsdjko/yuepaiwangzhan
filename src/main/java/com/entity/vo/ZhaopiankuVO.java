package com.entity.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 照片库
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhaopianku")
public class ZhaopiankuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
