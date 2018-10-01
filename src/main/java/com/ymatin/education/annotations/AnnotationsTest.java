package com.ymatin.education.annotations;

public class AnnotationsTest {
    public static void main(String[] args) {
        AnnotatedEntity entity = new AnnotatedEntity();
        System.out.println(entity.getIntField());
        AnnotationHandler.processAnnotation(entity);
        System.out.println(entity.getIntField());
        System.out.println(entity.getAnotherIntField());
    }
}
