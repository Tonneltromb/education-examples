package com.ymatin.education.annotations.entity;

import com.ymatin.education.annotations.*;

@ClassNameAnnotation(value = "EntityChild")
@RepeatableAnnotation
@RepeatableAnnotation
public class Entity {

    //Fields


//    @NotNullField
    @Initials(name = "X", lastName = "Y")
    private String stringField = "default";

    @NotNullField
    private int intField = 1;
    // Constructors

    public Entity() {}

    public Entity(String stringField) {
        this.stringField = stringField;
    }

    //Some business methods

    @LengthLimit(min = 1, max = 6)
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
