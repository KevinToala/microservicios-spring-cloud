package com.sod.servidorperimetral;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class PreFilter extends ZuulFilter {
	private static Logger log = LoggerFactory.getLogger(PreFilter.class);
	
	@Override
	public String filterType(){
		return "pre";
	}
	
	@Override
	public int filterOrder(){
		return 1;
	}
	
	@Override
	public boolean shouldFilter(){
		return true;
	}
	
	@Override
	public Object run(){
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		log.info(String.format("PRE FILTER !!!! - Llamado al servicio %s con el metodo %s", request.getRequestURL().toString(), request.getMethod()));
		return null;
	}
}