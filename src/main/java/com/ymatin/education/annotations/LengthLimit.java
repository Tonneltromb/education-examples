package com.ymatin.education.annotations;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LengthLimit {
    int min() default 0;
    int max() default Integer.MAX_VALUE;
}
