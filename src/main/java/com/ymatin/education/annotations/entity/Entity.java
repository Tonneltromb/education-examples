package com.ymatin.education.annotations.entity;

import com.ymatin.education.annotations.ClassNameAnnotation;
import com.ymatin.education.annotations.NotNullField;

@ClassNameAnnotation(value = "EntityChild")
public class Entity {

    //Fields


//    @NotNullField
    private String stringField = "default";

    @NotNullField
    private int intField = 1;
    // Constructors

    public Entity() {}

    public Entity(String stringField) {
        this.stringField = stringField;
    }

    //Some business methods

    public void toUpperCase(String string) {
        string = string.toUpperCase();
    }

    // Getters and Setters

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

}
