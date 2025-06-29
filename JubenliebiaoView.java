package com.entity.view;

import com.entity.JubenliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 剧本列表
 * 后端返回视图实体辅助类
 */
@TableName("jubenliebiao")
public class JubenliebiaoView  extends JubenliebiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JubenliebiaoView(){
	}
 
 	public JubenliebiaoView(JubenliebiaoEntity jubenliebiaoEntity){
 	try {
			BeanUtils.copyProperties(this, jubenliebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
