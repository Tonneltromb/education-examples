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
            Class<? extends Element> aClass = enclosingElement.getClass();
            try {
                for (Field field : aClass.getDeclaredFields()) {
                    System.out.println(field.getName());
                }

//                Field field = aClass.getField(e.getSimpleName().toString());
//                field.setAccessible(true);
//                Object o = field.get(aClass);
//                System.out.println(o != null);
            } catch (Exception e1) {
                e1.printStackTrace();
            }

            System.err.println("element " + e.asType());
            System.err.println("element " + e.getClass());
            System.err.println("element " + enclosingElement);
            System.err.println("element " + ve.getConstantValue());
            System.err.println("element " + e.getKind());
            System.err.println("element " + e.getSimpleName());
//
//            if (!e.asType().getKind().isPrimitive()) {
//            }
        }
        return true;
    }
}
