package com.thunisoft.spring.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.thunisoft.spring.dao.IUserDao;
import com.thunisoft.spring.dao.impl.UserDaoImpl;

/**
 * UserTest
 * @author Administrator
 * @version 1.0
 */
public class UserTest {

    /**日志对象*/
    Logger logger = Logger.getLogger(UserTest.class);
    
    /**
     * 通过BeanFactory获取bean.
     * @throws Exception
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testGetBean1() throws Exception {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        IUserDao userDao = (IUserDao) beanFactory.getBean("userDao");
        logger.info("获取到bean对象"+userDao);
    }

    /**
     * 通过ApplicationContext获取bean.
     * @throws Exception
     */
    @Test
    @SuppressWarnings("resource")
    public void testGetBean2() throws Exception {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        IUserDao userDao = (IUserDao) beanFactory.getBean("userDao", UserDaoImpl.class);
        logger.info("获取到bean对象"+userDao);
    }
    
}
