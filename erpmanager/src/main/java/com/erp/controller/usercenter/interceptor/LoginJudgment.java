package com.erp.controller.usercenter.interceptor;


import com.alibaba.druid.util.StringUtils;
import com.erp.utils.CookieUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginJudgment implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();

        boolean loginPathflag = uri.endsWith("login.jsp")||uri.endsWith("login");
		boolean registerPathflag = uri.endsWith("register.jsp")||uri.endsWith("register");
		boolean flag = /*uri.endsWith(".jpg")||*/uri.endsWith(".png")||uri.endsWith(".css")||uri.endsWith(".js");
		if (loginPathflag || registerPathflag || flag){
			filterChain.doFilter(request,response);
        }else {
            String token = CookieUtils.getCookieValue(request, "token");
            if(token == null || "".equals(token) || StringUtils.isEmpty(token)){
                request.getSession().setAttribute("tip","您还没有登录");
                response.sendRedirect(request.getContextPath()+"/pages/usercenter/login.jsp");
            }else{
                filterChain.doFilter(request,response);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
