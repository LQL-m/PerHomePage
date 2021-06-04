package com.lql.service;

import com.lql.bean.User;
import org.junit.Test;

/**
 * @author 小来
 */
public class DBServiceTest {

    @Test
    public void userInsert() {
        User user = new User("1", 18, "1", "1", "1", "1", "1", "1", "1", "1", "1");
        DBService.insertUser(user);
    }
}