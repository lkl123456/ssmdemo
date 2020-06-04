package com.jsinfor.swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
* @author liuklm:
* @version 创建时间：2018年11月20日 上午9:52:42
* 类说明
*/
@Controller
@RequestMapping("test")
@Api(tags="test",description="人员文档说明",hidden=true)
public class TestController {
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="获取list",httpMethod="GET",response=TestController.class,notes="获取list")
	public void list(@RequestParam int userId){
		System.out.println("==============");
	}
}
