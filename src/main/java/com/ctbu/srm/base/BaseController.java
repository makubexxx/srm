package com.ctbu.srm.base;


import com.alibaba.fastjson.JSON;
import com.ctbu.srm.entity.CommResponse;
import com.ctbu.srm.util.ResponseUtil;
import com.ctbu.srm.util.ResultUtil;
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

    final static Logger logger = LoggerFactory.getLogger(BaseController.class);


    @ExceptionHandler({ Exception.class })
    public @ResponseBody
    void exception(Exception e, HttpServletRequest request, HttpServletResponse response) {
        e.printStackTrace();
        logger.error("#######ERROR#######", e);
        //TODO 异常入库
        Object sn = request.getAttribute("serialno");
        String message = e.getMessage();
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "OPTIONS,GET,POST");
        ResponseUtil.write(response,ResultUtil.error(message));

    }


    public void afterPropertiesSet() throws Exception {

    }
}
