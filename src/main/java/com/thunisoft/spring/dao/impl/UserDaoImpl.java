package com.thunisoft.spring.dao.impl;

import com.thunisoft.spring.dao.IUserDao;
import com.thunisoft.spring.domain.User;

/**
 * 描述： 用户数据操作类.
 * 作者： Administrator
 * 时间： 2017年7月19日下午11:40:43
 * 版本： 1.0
 *
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{

    /**
     * 无参构造器. 
     */
    public UserDaoImpl() {
        super(User.class);
    }

    /**
     * 获取用户.
     * @param id ID
     * @return user
     */
    public User get(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("admin");
        return user;
    }
}
