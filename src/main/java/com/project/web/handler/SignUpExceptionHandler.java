package com.project.web.handler;

import com.project.web.exception.SignUpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class SignUpExceptionHandler {
    @ExceptionHandler(SignUpException.class)
    public ModelAndView handleSignUpException(HttpServletResponse response, SignUpException exception){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("code", 409);
        modelAndView.addObject("error", exception.getMessage());
        modelAndView.setViewName("redirect:/signup-page");
        response.setStatus(HttpServletResponse.SC_CONFLICT);
        return modelAndView;
    }
}
