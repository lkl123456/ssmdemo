package com.jsinfor;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author liuklm:
 * @version 创建时间：2019年3月12日 下午4:11:14 类说明
 */
public class ApplicationContextUtil implements ApplicationContextAware {

	private static ApplicationContext context = null;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	public static Object getBean(String name) {
		return context.getBean(name);
	}
	
	
	public static ApplicationContext getApplicationContext()  {
		return context;
	}
}
