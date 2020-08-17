package com.erp.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.file.AccessDeniedException;

public class MyExceptionResolver implements HandlerExceptionResolver {
    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "系统异常");
        if (e instanceof MyException) {
            SimpleMailMessage message = new SimpleMailMessage();
            //发件人的邮箱地址
            message.setFrom("569375286@qq.com");
            //收件人的邮箱地址
            message.setTo("1063120961@qq.com");
            //邮件主题
            message.setSubject("spring email test!!!!");
            //邮件内容
            message.setText(e.getMessage());
            //发送邮件
            javaMailSender.send(message);
            mv.setViewName("forward:/404.jsp");
        } else if (e instanceof AccessDeniedException) {
            mv.setViewName("forward:/403.jsp");//写redirect也可以
        } else if(e instanceof RuntimeException){
            mv.setViewName("redirect:/404.jsp");//写redirect也可以 404 没有机会进到这个controller
        }
        return mv;
    }
}
