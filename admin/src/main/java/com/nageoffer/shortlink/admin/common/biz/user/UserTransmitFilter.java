package com.nageoffer.shortlink.admin.common.biz.user;

import com.alibaba.fastjson2.JSON;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.io.IOException;
import java.util.Objects;

@RequiredArgsConstructor
public class UserTransmitFilter implements Filter {

    private final StringRedisTemplate stringRedisTemplate;
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String requestURI = httpServletRequest.getRequestURI();
        //这样写并不规范，后期需要移动到网关
        if(Objects.equals(requestURI,"/api/short-link/admin/v1/user/login")){
            return;
        }
        String username = httpServletRequest.getHeader("username");
        String token = httpServletRequest.getHeader("token");
        Object userInfoJsonStr = stringRedisTemplate.opsForHash().get("login_"+username,token);
        if(userInfoJsonStr != null){
            UserInfoDTO userInfoDTO = JSON.parseObject(userInfoJsonStr.toString(),UserInfoDTO.class);
            UserContext.setUser(userInfoDTO);
        }
        try{
            filterChain.doFilter(servletRequest,servletResponse);
        }finally {
            UserContext.removeUser();
        }
    }
}
