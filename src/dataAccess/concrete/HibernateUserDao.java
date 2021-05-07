package dataAccess.concrete;

import dataAccess.abstracts.UserDao;
import entitites.concrete.User;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Database Eklendi");

    }

    @Override
    public void update(User user) {
        System.out.println("Database Güncellendi");
    }

    @Override
    public void delete(User user) {
        System.out.println("Database Silindi");
    }
}
