package com.ctbu.srm.base;


import com.ctbu.srm.entity.CommResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Meiziyu
 * @Date: 2019/3/13 10:35
 * @Email 308348194@qq.com
 */
@Controller
public class BaseController implements InitializingBean {

    public static Gson gsonBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").disableHtmlEscaping()
            .create();
    final static Logger logger = LoggerFactory.getLogger(BaseController.class);



    @ExceptionHandler({ Exception.class })
    public @ResponseBody
    String exception(Exception e, HttpServletRequest request, HttpServletResponse response) {
        e.printStackTrace();
        logger.error("#######ERROR#######", e);
        CommResponse<Object> commResponse = new CommResponse<>();
        commResponse.setStatus(CommResponse.STATUS_ERROR);
        Object sn = request.getAttribute("serialno");
        commResponse.setSerialno(sn == null ? "" : sn.toString());
        String message = e.getMessage();
        commResponse.setErrorMessage((message == null || message.trim().equals("")) ? "系统出现错误，请稍后再试" : message);
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "OPTIONS,GET,POST");
        return gsonBuilder.toJson(commResponse);
    }


    /**
     * 返回json数据格式
     *
     * @param content
     * @return
     */
    public <T> String toJson(T content, HttpServletRequest request, HttpServletResponse response) {
        CommResponse<T> commResponse = new CommResponse<>();
        commResponse.setStatus(CommResponse.STATUS_SUCCESS);
        commResponse.setErrorMessage("");
        commResponse.setSuccessMessage("执行成功");
        commResponse.setBody(content);
        Object sn = request.getAttribute("serialno");
        commResponse.setSerialno(sn == null ? "" : sn.toString());
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "OPTIONS,GET,POST");
        return gsonBuilder.toJson(commResponse, CommResponse.class);
    }






    public void afterPropertiesSet() throws Exception {

    }
}
