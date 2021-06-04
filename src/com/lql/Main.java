package com.lql;

import com.lql.bean.User;
import com.lql.service.DBService;

/**
 * @author 小来
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("1", 18, "1", "1", "1", "1", "1", "1", "1", "1", "1");
        DBService.insertUser(user);
    }
}
