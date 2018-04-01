package com.sansan.jdbctemplate.c3p0_demo;

import com.sansan.jdbctemplate.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by xiapf on 2018/4/1.
 */
public class UserDao extends JdbcDaoSupport {

    public void update(User user){
        String sql = "update t_user set username=?,password=? where id =?";
        Object[] args = {user.getUsername(),user.getPassword(),user.getId()};
        this.getJdbcTemplate().update(sql, args);
    }
}
