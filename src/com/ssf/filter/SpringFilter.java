package com.ssf.filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
@SuppressWarnings("serial")
public class SpringFilter extends HttpServlet implements Filter {
    //设置字符编码级,value是web.xml赋值的
	private String encoding=null;
	//是否启动该配置字符集的参数
	private boolean enable=true;
	//Filter接口实现类    优先于Httpservlet调用
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
        if(enable&&encoding!=null){
        	arg0.setCharacterEncoding(encoding);
        	arg1.setCharacterEncoding(encoding);
        	arg2.doFilter(arg0, arg1);        	
        }
	}
//	<filter>
//    <filter-name>filter</filter-name>
//    <filter-class>com.ssm.filter.SpringFilter</filter-class>
//    <init-param>
//       <param-name>Encoding</param-name>
//       <param-value>UTF-8</param-value>
//    </init-param>
//    <init-param>
//       <param-name>enable</param-name>
//       <param-value>true</param-value>
//    </init-param>
//  </filter>
//  <filter-mapping>
//    <filter-name>filter</filter-name>
//    <url-pattern>/*</url-pattern>
//  </filter-mapping> 
	//HttpServlet重写父类的方法
	@Override
	public void init(FilterConfig config) throws ServletException {
		//利用web.xml配置文件来赋值两个参数初始化的值
        this.encoding=config.getInitParameter("Encoding");
        //true "true"
        enable="true".equalsIgnoreCase(config
        		.getInitParameter("enable").trim());
	}
	//HttpServlet重写父类的方法
    @Override
    public void destroy() {
    	this.encoding=null;
    	this.enable=false;
    }
}
