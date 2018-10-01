package com.ymatin.education.junit_testing.user;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserControllerTest {

    UserController controller;
    EntityService service;

    @Before public void setUp(){
        controller = new UserController();
        service = mock(EntityService.class);
        controller.setService(service);
    }
    @After public void tearDown(){}

    @Test public void getUserTest() {
        User user = new User("Vas", 1);
        when(service.get()).thenReturn(user);

        assertEquals(user, service.get());
    }
}