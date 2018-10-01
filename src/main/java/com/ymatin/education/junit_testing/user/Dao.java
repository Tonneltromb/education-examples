package com.ymatin.education.junit_testing.user;

import java.util.List;

public interface Dao<T> {
    T create(T t);
    T get();
    T update(T t);
    boolean delete(T t);
    List<T> getAll();
}
