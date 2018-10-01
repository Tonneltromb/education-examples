package com.ymatin.education.junit_testing.user;

import java.util.List;

public class UserController{

    EntityService<User> service;

    public EntityService<User> getService() {
        return service;
    }

    public void setService(EntityService<User> service) {
        this.service = service;
    }

    public User create(User user) {
        return service.create(user);
    }

    public User get() {
        return service.get();
    }

    public User update(User user) {
        return service.update(user);
    }

    public boolean delete(User user) {
        return service.delete(user);
    }

    public List<User> getAll() {
        return service.getAll();
    }
}
