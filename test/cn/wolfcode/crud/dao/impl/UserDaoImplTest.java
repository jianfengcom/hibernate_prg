package cn.wolfcode.crud.dao.impl;

import cn.wolfcode.crud.dao.IUserDao;
import cn.wolfcode.crud.domain.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    private IUserDao dao = new UserDaoImpl();

    @Test
    public void save() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void get() {
        User user = dao.get(1L);
        System.out.println(user);
    }

    @Test
    public void list() {
    }
}