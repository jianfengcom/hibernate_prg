package cn.wolfcode.crud.dao.impl;

import cn.wolfcode.crud.dao.IUserDao;
import cn.wolfcode.crud.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    @Override
    public void save(User user) {
        // 贾琏欲执事
        // 连接池 sessionFactory
        // connection session

        Configuration cfg = new Configuration().configure("");
        SessionFactory factory = cfg.buildSessionFactory();

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long userId) {

    }

    @Override
    public User get(Long userId) {
        // 贾琏欲执事
        // 连接池 sessionFactory
        // connection session

        Configuration cfg = new Configuration().configure("/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        User user = session.get(User.class, userId);
        session.close();
        factory.close();
        return user;
    }

    @Override
    public List<User> list() {
        return null;
    }
}
