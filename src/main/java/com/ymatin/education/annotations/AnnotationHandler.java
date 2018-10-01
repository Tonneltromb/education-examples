package com.ymatin.education.annotations;

import org.springframework.util.ReflectionUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.function.Consumer;

public class AnnotationHandler {

    public static void processAnnotation(Object target) {
        handleClassLevelAnnotations(target);
        handleFieldLevelAnnotations(target);
    }

    private static void handleClassLevelAnnotations(Object target) {
        Class<?> targetClass = target.getClass();
        ClassLevelAnnotation classLevelAnnotation = targetClass.getAnnotation(ClassLevelAnnotation.class);
        MarkerAnnotation markerAnnotation = targetClass.getAnnotation(MarkerAnnotation.class);
        if (classLevelAnnotation != null) {
            handleAnnotation(classLevelAnnotation, (a) -> {
                MarkerAnnotation annotation = a.annotationType().getAnnotation(MarkerAnnotation.class);
                if (annotation != null) {
                    handleAnnotation(annotation, (innerAnnotation) -> {
                        System.out.println(innerAnnotation.getClass());
                        System.out.println("annotation " + a.annotationType().getName() + " has an annotation MarkerAnnotation");

                    });
                }
//                System.out.println(a.annotationType()); // returns class of original annotation (ClassLevelAnnotation.class)
//                System.out.println(a.getClass()); // returns some proxy (com.sun.proxy$Proxy... or something like)
                System.out.println("class " + target.getClass().getName() + " has an annotation ClassLevelAnnotation");
            });
        }
        if (markerAnnotation != null) {
            System.out.println("class " + target.getClass().getName() + " has an annotation MarkerAnnotation");
        }
    }

    private static void handleFieldLevelAnnotations(Object target) {
        Class<?> aClass = target.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field f : fields) {
            GetStaticInt getStaticIntAnnotation = f.getDeclaredAnnotation(GetStaticInt.class);
            ClassRetentionAnnotation classRetentionAnnotation = f.getAnnotation(ClassRetentionAnnotation.class);
            InheritedAnnotation inheritedAnnotation = f.getAnnotation(InheritedAnnotation.class);
            MarkerAnnotation markerAnnotation = inheritedAnnotation != null ? inheritedAnnotation.annotationType().getDeclaredAnnotation(MarkerAnnotation.class) : null;
            if (getStaticIntAnnotation != null) {
                int value = getStaticIntAnnotation.value();
                f.setAccessible(true);
                ReflectionUtils.setField(f, target, value);
            }
            if (classRetentionAnnotation != null) {
                int value = classRetentionAnnotation.value();
                f.setAccessible(true);
                ReflectionUtils.setField(f, target, value);
            }
            if (inheritedAnnotation != null) {
                int value = inheritedAnnotation.value();
                f.setAccessible(true);
                ReflectionUtils.setField(f, target, value);
            }
            if (markerAnnotation != null) {
                f.setAccessible(true);
                try {
                    ReflectionUtils.setField(f, target, f.getInt(target) * 2);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void handleAnnotation(Annotation annotation, Consumer<Annotation> consumer) {
        consumer.accept(annotation);
    }
}
