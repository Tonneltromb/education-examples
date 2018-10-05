package com.ymatin.education.annotations.processors;

import com.ymatin.education.annotations.NotNullField;
import org.springframework.core.annotation.AnnotationUtils;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import java.lang.reflect.Field;
import java.util.Set;

@SupportedAnnotationTypes("com.ymatin.education.annotations.NotNullField")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class NotNullFieldAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        for (Element e : roundEnv.getElementsAnnotatedWith(NotNullField.class)) {

            final VariableElement ve = (VariableElement) e;
            Element enclosingElement = e.getEnclosingElement();
            try {
                Class<?> aClass = Class.forName(enclosingElement.toString());
                System.out.println("class " + aClass.getName());

                for (Field field : aClass.getDeclaredFields()) {
                    System.out.println(field.getType());

//                field.setAccessible(true);
//                    Object o = field.get(aClass);
//                String o = (String) field.get(aClass);
//                System.out.println(o != null);
                }

            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }

            System.err.println("element e.asType() " + e.asType());
            System.err.println("element e.getClass() " + e.getClass());
            System.err.println("element enclosingElement " + enclosingElement);
            System.err.println("element ve.getConstantValue() " + ve.getConstantValue());
            System.err.println("element e.getKind() " + e.getKind());
            System.err.println("element e.getSimpleName() " + e.getSimpleName());
//
//            if (!e.asType().getKind().isPrimitive()) {
//            }
        }
        return true;
    }
}
