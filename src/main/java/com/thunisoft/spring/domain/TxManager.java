package com.thunisoft.spring.domain;

/**
 * 描述： 事务管理类.
 * 作者： Administrator
 * 时间： 2017年8月3日下午9:48:36
 * 版本： 1.0
 *
 */
public class TxManager {

    /**
     * 开始事务.
     */
    public void begin(){
        System.out.println("开始事务");
    }
    
    /**
     * 提交事务.
     */
    public void commit(){
        System.out.println("提交事务");
    }
    
    /**
     * 回滚事.
     */
    public void rollback(Exception e){
        System.out.println("回滚事务:"+e.getMessage());
        throw new RuntimeException("回滚事务:"+e.getMessage());
    }
}
