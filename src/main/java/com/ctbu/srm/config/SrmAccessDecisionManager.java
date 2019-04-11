package com.ctbu.srm.config;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/9 10:45
 * @Email 308348194@qq.com
 */
public class SrmAccessDecisionManager implements AccessDecisionManager {

    /**
     * decide 方法是判定是否拥有权限的决策方法，authentication是CustomUserService
     * 中循环添加到 GrantedAuthority 对象中的权限信息集合,object 包含客户端发起的请求的requset信息，
     * 可转换为 HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
     * configAttributes为MyFilterInvocationSecurityMetadataSource的getAttributes(Object object)
     * 这个方法返回的结果.
     *
     */
    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {

        if(null== collection || collection.size() <=0) {
            return;
        }
        ConfigAttribute c;
        String needRole;
        for(Iterator<ConfigAttribute> iter = collection.iterator(); iter.hasNext(); ) {
            c = iter.next();
            needRole = c.getAttribute();
            for(GrantedAuthority ga : authentication.getAuthorities()) {//authentication 为在注释1 中循环添加到 GrantedAuthority 对象中的权限信息集合
                if(needRole.trim().equals(ga.getAuthority())) {
                    return;
                }
            }
        }
        throw new AccessDeniedException("no right");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return false;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
