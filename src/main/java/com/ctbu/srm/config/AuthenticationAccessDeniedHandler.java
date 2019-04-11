package com.ctbu.srm.config;

import com.ctbu.srm.base.BaseController;
import com.ctbu.srm.entity.CommResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/9 10:58
 * @Email 308348194@qq.com
 */
public class AuthenticationAccessDeniedHandler implements AccessDeniedHandler {


    public static Gson gsonBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").disableHtmlEscaping()
            .create();
    final static Logger logger = LoggerFactory.getLogger(BaseController.class);


    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {

        logger.error("#######ERROR#######", e);
        CommResponse<Object> commResponse = new CommResponse<>();
        commResponse.setStatus(CommResponse.STATUS_ERROR);
        Object sn = request.getAttribute("serialno");
        commResponse.setSerialno(sn == null ? "" : sn.toString());
        String message = e.getMessage();
        commResponse.setErrorMessage((message == null || message.trim().equals("")) ? "系统出现错误，请稍后再试" : message);
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "OPTIONS,GET,POST");
        PrintWriter out = response.getWriter();
        out.write(gsonBuilder.toJson(commResponse));
        out.flush();
        out.close();
    }
}
