package com.entity.view;

import com.entity.ForumEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 剧本讨论
 * 后端返回视图实体辅助类
 */
@TableName("forum")
public class ForumView  extends ForumEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ForumView(){
	}
 
 	public ForumView(ForumEntity forumEntity){
 	try {
			BeanUtils.copyProperties(this, forumEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
