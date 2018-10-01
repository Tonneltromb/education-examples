package com.ymatin.education.junit_testing.user;

import org.junit.*;

public class UserTest {

    private User user = new User();

    public UserTest() {
        System.out.println("Constructor");
        System.out.println("********************");
    }
    @BeforeClass
    public static void before(){
        System.out.println("before class");
        System.out.println("********************");
    }
    @Before
    public void setUp() {
        System.out.println("before method");
        System.out.println("********************");
    }
    @After
    public void tearDown() {
        System.out.println("after method");
        System.out.println("********************");
        System.out.println();
    }
    @AfterClass
    public static void after() {
        System.out.println("after class");
        System.out.println("********************");
    }
    @Test
    public void firstTest() {
        System.out.println("first test");
        System.out.println("********************");
    }
    @Test public void secondTest() {
        System.out.println("second test");
        System.out.println("********************");
    }
    @Test public void thirdTest() {
        System.out.println("third test");
        System.out.println("********************");
    }

}