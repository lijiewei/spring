package com.thunisoft.spring;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thunisoft.spring.dao.IUserDao;
import com.thunisoft.spring.utils.SpringUtil;

/**
 * 描述： 登录控制成.
 * 作者： Administrator
 * 时间： 2017年7月24日下午10:47:58
 * 版本： 1.0
 *
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    /**
     * uid.
     */
    private static final long serialVersionUID = -8323579586796553649L;

    /** (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void service(HttpServletRequest req,
            HttpServletResponse resp) throws ServletException, IOException {
        IUserDao userDao = (IUserDao) SpringUtil.getBean("userDao");
        System.out.println(userDao);
    }
    
    
}
