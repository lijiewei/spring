package com.thunisoft.spring.domain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * 描述： cglib代理类.
 * 作者： Administrator
 * 时间： 2017年8月3日下午9:48:07
 * 版本： 1.0
 * 只要有接口都能进行代理
 */
public class CGLIBProxy implements MethodInterceptor {

    /**事务管理器.*/
    private TxManager txManager;

    /**真实主题角色的引用.*/
    private Object targetObject;

    /**
     * 构造器.
     * @param txManager
     * @param targetObject
     */
    public CGLIBProxy(TxManager txManager, Object targetObject) {
        this.txManager = txManager;
        this.targetObject = targetObject;
    }


    /**
     * 创建代理对象.
     * @return 代理对象
     */
    public Object createProxy(){
        //实列化一个增强类
        Enhancer enhancer = new Enhancer();
        //添加目标对象的字节码
        enhancer.setSuperclass(targetObject.getClass());
        //添加一个回调方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /** 
     * 在代理实例上处理方法调用并返回结果.
     * @param proxy 经过jdk代理的对象
     * @param method 当前调用的方法对象
     * @param args 当前调用方法的参数
     * @param methodProxy 方法对象代理
     * @return Object 方法调用返回结果
     */
    public Object intercept(Object proxy, Method method,Object[] args,
            MethodProxy methodProxy) throws Throwable {
        Object result = null;
        try {
            if("get".equals(method.getName())){
                result = method.invoke(targetObject, args);
            }else{
                txManager.begin();
                result = method.invoke(targetObject, args);
                txManager.commit();
            }
        } catch (Exception e) {
            txManager.rollback(e);
        }
        return result;
    }
}
