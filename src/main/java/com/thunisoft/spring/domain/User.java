package com.thunisoft.spring.domain;

/**
 * 描述： 用户实体类.
 * 作者： Administrator
 * 时间： 2017年7月19日下午11:43:47
 * 版本： 1.0
 *
 */
public class User {

    /**ID.*/
    private Long id;
    
    /**名字.*/
    private String name;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    
}
