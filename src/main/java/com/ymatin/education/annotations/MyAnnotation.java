package com.ymatin.education.annotations;

public @interface MyAnnotation {
    String name() default "[user]";
    int count() default 0;
}
