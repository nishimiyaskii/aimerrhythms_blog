package com.aimerrhythms.blog.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * controller异常处理器
 *
 * @author aimerrhythms
 * @data 2020/7/26 17:34
 */
@Slf4j
@ControllerAdvice   //拦截所有标有@Controller注解的控制器
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView excetpionHandler(HttpServletRequest req, Exception e) throws Exception {
        log.error("Request URL : {},  Exception : {}", req.getRequestURL(), e.toString());
        //特殊判断，标有@ResponseStatus注解的异常不需要捕获，交给SpringBoot处理
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) throw e;
        ModelAndView mv = new ModelAndView();
        mv.addObject("url", req.getRequestURL());
        mv.addObject("exception", e);
        mv.setViewName("error/error");
        return mv;
    }

}
