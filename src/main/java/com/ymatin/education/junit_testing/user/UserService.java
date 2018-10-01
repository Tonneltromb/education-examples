package com.ymatin.education.junit_testing.user;

import java.util.List;

public class UserService implements EntityService<User> {

    Dao<User> dao;

    @Override
    public User create(User user) {
        return dao.create(user);
    }

    @Override
    public User get() {
        return dao.get();
    }

    @Override
    public User update(User user) {
        return dao.update(user);
    }

    @Override
    public boolean delete(User user) {
        return dao.delete(user);
    }

    @Override
    public List<User> getAll() {
        return dao.getAll();
    }
}
