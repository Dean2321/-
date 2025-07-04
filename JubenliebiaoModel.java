package com.entity.model;

import com.entity.JubenliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 剧本列表
 * 接收传参的实体类
 */
public class JubenliebiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 剧本名
	 */
	
	private String jubenming;
		
	/**
	 * 剧本类型
	 */
	
	private String jubenleixing;
		
	/**
	 * 作者
	 */
	
	private String zuozhe;
		
	/**
	 * 介绍
	 */
	
	private String jieshao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 参与人数
	 */
	
	private Integer canyurenshu;
		
	/**
	 * 游戏时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date youxishijian;
		
	/**
	 * 经度
	 */
	
	private Float longitude;
		
	/**
	 * 纬度
	 */
	
	private Float latitude;
		
	/**
	 * 地址
	 */
	
	private String fulladdress;
				
	
	/**
	 * 设置：剧本名
	 */
	 
	public void setJubenming(String jubenming) {
		this.jubenming = jubenming;
	}
	
	/**
	 * 获取：剧本名
	 */
	public String getJubenming() {
		return jubenming;
	}
				
	
	/**
	 * 设置：剧本类型
	 */
	 
	public void setJubenleixing(String jubenleixing) {
		this.jubenleixing = jubenleixing;
	}
	
	/**
	 * 获取：剧本类型
	 */
	public String getJubenleixing() {
		return jubenleixing;
	}
				
	
	/**
	 * 设置：作者
	 */
	 
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	
	/**
	 * 获取：作者
	 */
	public String getZuozhe() {
		return zuozhe;
	}
				
	
	/**
	 * 设置：介绍
	 */
	 
	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}
	
	/**
	 * 获取：介绍
	 */
	public String getJieshao() {
		return jieshao;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：参与人数
	 */
	 
	public void setCanyurenshu(Integer canyurenshu) {
		this.canyurenshu = canyurenshu;
	}
	
	/**
	 * 获取：参与人数
	 */
	public Integer getCanyurenshu() {
		return canyurenshu;
	}
				
	
	/**
	 * 设置：游戏时间
	 */
	 
	public void setYouxishijian(Date youxishijian) {
		this.youxishijian = youxishijian;
	}
	
	/**
	 * 获取：游戏时间
	 */
	public Date getYouxishijian() {
		return youxishijian;
	}
				
	
	/**
	 * 设置：经度
	 */
	 
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * 获取：经度
	 */
	public Float getLongitude() {
		return longitude;
	}
				
	
	/**
	 * 设置：纬度
	 */
	 
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * 获取：纬度
	 */
	public Float getLatitude() {
		return latitude;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}
			
}
