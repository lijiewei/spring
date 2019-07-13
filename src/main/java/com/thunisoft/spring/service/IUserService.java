package com.thunisoft.spring.service;

import com.thunisoft.spring.domain.User;

/**
 * 描述： 
 * 作者： Administrator
 * 时间： 2017年7月27日下午9:57:53
 * 版本： 1.0
 *
 */
public interface IUserService {

    /**
     * 保存对象.
     * @param user 要保存的对象
     */
    void save(User user);
    
    /**
     * 根据id查询对象.
     * @param id id
     * @return User 查询到的对象
     */
    User get(Long id);
}
