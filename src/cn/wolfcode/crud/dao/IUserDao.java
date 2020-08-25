package cn.wolfcode.crud.dao;

import cn.wolfcode.crud.domain.User;

import java.util.List;

public interface IUserDao {
    void save(User user);
    void update(User user);
    void delete(Long userId);

    User get(Long userId);
    List<User> list();
}
