package com.ctbu.srm.config;

import com.ctbu.srm.entity.domian.Permission;
import com.ctbu.srm.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/9 10:31
 * @Email 308348194@qq.com
 */
public class SrmFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    @Autowired
    private PermissionRepository permissionRepository;

    private HashMap<String, Collection<ConfigAttribute>> map = null;

    /**
     * 加载权限表中所有权限
     */
    public void loadResourceDefine() {
        map = new HashMap<String, Collection<ConfigAttribute>>();

        List<Permission> permissions = permissionRepository.findAll();
        for (Permission permission : permissions) {
            ConfigAttribute cfg = new SecurityConfig(permission.getPermissionname());
            List<ConfigAttribute> list = new ArrayList<>();
            list.add(cfg);
            map.put(permission.getUrl(), list);
        }

    }

    /**
     * 此方法是为了判定用户请求的url 是否在权限表中，如果在权限表中，则返回给 decide 方法， 用来判定用户
     * 是否有此权限。如果不在权限表中则放行。
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        if (map == null) {
            loadResourceDefine();
        }
        // object 中包含用户请求的request的信息
        HttpServletRequest request = ((FilterInvocation) o).getHttpRequest();
        for (Map.Entry<String, Collection<ConfigAttribute>> entry : map.entrySet()) {
            String url = entry.getKey();
            if (new AntPathRequestMatcher(url).matches(request)) {
                return map.get(url);
            }
        }
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
