package com.thunisoft.spring.service.impl;

import org.apache.log4j.Logger;

import com.thunisoft.spring.dao.IUserDao;
import com.thunisoft.spring.dao.impl.UserDaoImpl;
import com.thunisoft.spring.domain.User;
import com.thunisoft.spring.service.IUserService;

/**
 * 描述： 用户业务类.
 * 作者： Administrator
 * 时间： 2017年7月20日下午11:47:34
 * 版本： 1.0
 *
 */
public class UserServiceImpl implements IUserService{

    /**日志对象.*/
    private Logger logger = Logger.getLogger(UserServiceImpl.class);
    
    /**注入userDao.*/
    private IUserDao userDao;
    
    /**
     * 注入userDao.
     * @param userDao the userDao to set
     */
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
    
    /**
     * 根据id获取用户对象.
     * @param id
     * @return user
     */
    public User get(Long id){
        return userDao.get(id);
    }

    /** 
     * 保存用户对象.
     * @param user 用户对象
     */
    public void save(User user) {
        new UserDaoImpl().save(user);
        System.out.println("保存的对象:"+user);
        //userDao.save(user);
    }
}
