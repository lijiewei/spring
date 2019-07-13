package com.thunisoft.spring.dao;

/**
 * 描述： 持久层接口父类.
 * 作者： Administrator
 * 时间： 2017年7月27日下午9:15:30
 * 版本： 1.0
 *
 */
public interface IBaseDao<T> {

    /**
     * 保存对象.
     * @param t 要保存的对象
     */
    void save(T t);
    
    /**
     * 根据id查询对象.
     * @param id id
     * @return 查询到的对象
     */
    T get(Long id);
}
