package com.jsinfor.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 链接过滤器
 * 解决跨域问题
 * 返回中文乱码问题
 * @author ZWJ
 * 
 */
public class UrlFilter implements Filter {
	@Override
	public void init(FilterConfig config) throws ServletException {
		ServletContext context = config.getServletContext();
		WebApplicationContextUtils.getWebApplicationContext(context);
	
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletResponse res = (HttpServletResponse) response;
        HttpServletRequest req=(HttpServletRequest)request;
        res.setContentType("text/html;charset=UTF-8");
        String header = req.getHeader("Origin");
        res.setHeader("Access-Control-Allow-Origin",header );
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        res.setHeader("Access-Control-Max-Age", "0");
        res.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
        res.setHeader("Access-Control-Allow-Credentials", "true");
        res.setHeader("XDomainRequestAllowed","1");
		chain.doFilter(req, response);
	}

	@Override
	public void destroy() {

	}
	
	
}
