package com.sansan.jdbctemplate.dbcp_demo;

import com.sansan.jdbctemplate.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by xiapf on 2018/4/1.
 */
public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void update(User user){
        String sql = "update t_user set username=?,password=? where id =?";
        Object[] args = {user.getUsername(),user.getPassword(),user.getId()};
        jdbcTemplate.update(sql, args);
    }
}
