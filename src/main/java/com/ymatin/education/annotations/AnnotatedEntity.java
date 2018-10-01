package com.ymatin.education.annotations;

@ClassLevelAnnotation
public class AnnotatedEntity {

    @GetStaticInt(value = 10)
    private int intField;
//    @ClassRetentionAnnotation
    @InheritedAnnotation
//    @MarkerAnnotation
    private int anotherIntField;

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public int getAnotherIntField() {
        return anotherIntField;
    }

    public void setAnotherIntField(int anotherIntField) {
        this.anotherIntField = anotherIntField;
    }
}
