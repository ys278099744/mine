package cn.tongdun.kraken.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by libinsong on 2017/6/29.
 */
@ControllerAdvice
public class GlobalExceptionHandler implements ErrorViewResolver {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = AuthenticationServiceException.class)
    public ModelAndView authenticationErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("errorMsg", e.getMessage());
        mav.setViewName("403");
        return mav;
    }

    @ExceptionHandler(value = Throwable.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception ex) throws Exception {
        LOGGER.error(ex.getMessage(), ex);

        String ajaxRequest = request.getHeader("X-Requested-With");
        if(StringUtils.isBlank(ajaxRequest)) {
            final ModelAndView mav = new ModelAndView();
            mav.addObject("exceptionStackTrace", ExceptionUtils.getStackTrace(ex));
            mav.addObject("path", request.getRequestURL());
            mav.addObject("message", ex.getMessage());
            mav.addObject("timestamp", System.currentTimeMillis());
            mav.addObject("errorMsg", ex.getMessage());
            mav.setViewName("500");
            return mav;
        } else {
            throw ex;
        }
    }

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request,
                                         HttpStatus status, Map<String, Object> model) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("404");
        return mav;
    }
}
