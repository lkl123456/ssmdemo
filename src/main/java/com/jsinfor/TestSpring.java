package com.jsinfor;

import org.springframework.context.ApplicationContext;

/**
* @author liuklm:
* @version 创建时间：2019年3月12日 下午4:12:35
* 类说明
*/
public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext();
		System.out.println(applicationContext.containsBean("11"));
	}
}
