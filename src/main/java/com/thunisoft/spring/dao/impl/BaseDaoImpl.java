package com.thunisoft.spring.dao.impl;

import org.apache.log4j.Logger;

import com.thunisoft.spring.dao.IBaseDao;

/**
 * 描述： 数据操作层父类.
 * 作者： Administrator
 * 时间： 2017年7月19日下午11:29:15
 * 版本： 1.0
 *
 * @param <T>
 */
public class BaseDaoImpl<T> implements IBaseDao<T>{

    /**日志对象.*/
    private Logger logger = Logger.getLogger(BaseDaoImpl.class);

    /**泛型类.*/
    private Class<T> entityClass;

    /**
     * 带参构造方法.
     * @param clz 泛型类
     */
    public BaseDaoImpl(final Class<T> clz) {
        this.entityClass = clz;
    }

    /** 
     * 保存对象.
     * @param t 要保存的对象
     */
    public void save(T t) {
    }

    /**
     * 根据id查询对象.
     * @param id id
     * @return 查询到的对象
     */
    public T get(Long id) {
        T t = null;
        return t;
    }

   

}
