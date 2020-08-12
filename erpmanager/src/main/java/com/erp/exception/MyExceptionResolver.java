package com.erp.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        /*MyException myException = null;
         ModelAndView mv = new ModelAndView();
        if (e instanceof MyException) {
            myException = (MyException) e;
        } else {
            myException = new MyException("系统异常");
        }
        mv.addObject("msg", myException.getMessage());
        mv.setViewName("error");
        return mv;*/
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "系统异常");
        if (e instanceof MyException) {
            mv.setViewName("error");
        } else if(e instanceof RuntimeException){
            mv.setViewName("redirect:/404.jsp");//写redirect也可以 404 没有机会进到这个controller
        }
        return mv;
    }
}
