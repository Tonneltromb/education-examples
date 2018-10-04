package com.ymatin.education.annotations;

import com.ymatin.education.annotations.entity.EntityChild;
import org.springframework.core.annotation.AnnotationUtils;

public class AnnotationUtilsExamples {
    public static void main(String[] args) {
        ClassNameAnnotation annotation = AnnotationUtils.findAnnotation(EntityChild.class, ClassNameAnnotation.class);
        System.out.println(annotation);
        Class<?> aClass = AnnotationUtils.findAnnotationDeclaringClass(ClassNameAnnotation.class, EntityChild.class);
        System.out.println(aClass);
    }
}
