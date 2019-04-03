package com.ctbu.srm.validator;


import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Meiziyu
 * @Date: 2019/3/13 10:41
 * @Email 308348194@qq.com
 */
public class ValidationResult {

    private boolean hasError=false;

    private Map<String,String> errorMsgMap =new HashMap<>();

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public Map<String, String> getErrorMsgMap() {
        return errorMsgMap;
    }

    public void setErrorMsgMap(Map<String, String> errorMsgMap) {
        this.errorMsgMap = errorMsgMap;
    }

    public String getErrMsg()
    {
       return StringUtils.join( errorMsgMap.values().toArray(),",");
    }

}
