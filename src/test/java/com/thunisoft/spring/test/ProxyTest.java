package com.thunisoft.spring.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.thunisoft.spring.domain.CGLIBProxy;
import com.thunisoft.spring.domain.JDKProxy;
import com.thunisoft.spring.domain.TxManager;
import com.thunisoft.spring.domain.User;
import com.thunisoft.spring.service.IUserService;
import com.thunisoft.spring.service.impl.UserServiceImpl;

/**
 * 描述： 动态代理测试.
 * 作者： Administrator
 * 时间： 2017年8月3日下午10:21:29
 * 版本： 1.0
 *
 */
public class ProxyTest {

    /**事务管理器.*/
    private TxManager txManager = new TxManager();
    
    /**注入的userService.*/
    private UserServiceImpl userService = new UserServiceImpl();
    
    @Test
    public void testJdkProxy() throws Exception {
        User user = new User();
        user.setName("ljs");
        JDKProxy jdkproxy = new JDKProxy(txManager, userService);
        IUserService userService = (IUserService) jdkproxy.createProxy();
        userService.save(user);
    }
    
    @Test
    public void testCglibProxy() throws Exception {
        User user = new User();
        user.setName("ljs");
        CGLIBProxy cglibproxy = new CGLIBProxy(txManager, userService);
        IUserService userService = (IUserService) cglibproxy.createProxy();
        userService.save(user);
    }
}
