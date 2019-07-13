package com.thunisoft.spring.test;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thunisoft.spring.domain.User;
import com.thunisoft.spring.service.IUserService;


/**
 * 描述： spring注解方式测试类.
 * 作者： Administrator
 * 时间： 2017年7月22日下午4:58:13
 * 版本： 1.0
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml") //相对路径，从classpath开始找
//@ContextConfiguration("applicationContext.xml") //相对路径，从当前包开始找（变成：/com/thunisoft/spring/test/applicationContext.xml）
//@ContextConfiguration("/applicationContext.xml") //绝对路径，从classpath开始找
public class UserTestAnno {

    /**日志对象.*/
   private Logger logger = Logger.getLogger(UserTest.class);
   /**数字100.*/
   private final Long ten = 100L;

    /**用户对象注入.*/
    @Autowired
    private IUserService userService; //使用了spring的测试，bean的获取必须是使用注解方式注入
    
    /**
     * 测试类.
     * @throws Exception 异常
     */
    @Test
    public void testName() throws Exception {
        User user = userService.get(ten);
        System.out.println(StringUtils.center(" start ", 40, "="));
        System.out.println(user);
        System.out.println(StringUtils.repeat("=", 40));
    }
}
