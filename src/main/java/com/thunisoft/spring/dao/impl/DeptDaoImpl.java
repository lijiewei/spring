package com.thunisoft.spring.dao.impl;

import com.thunisoft.spring.dao.IDeptDao;
import com.thunisoft.spring.domain.Dept;

/**
 * 描述： 部门数据操作层.
 * 作者： Administrator
 * 时间： 2017年7月19日下午11:44:42
 * 版本： 1.0
 *
 */
public class DeptDaoImpl extends BaseDaoImpl<Dept> implements IDeptDao{

    /**
     * 无参构造器.
     */
    public DeptDaoImpl() {
        super(Dept.class);
    }

}
 