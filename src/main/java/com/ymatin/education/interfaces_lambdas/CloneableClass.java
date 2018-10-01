package com.ymatin.education.interfaces_lambdas;

import java.util.Date;

public class CloneableClass implements Cloneable {
private Date date;



    @Override
    public CloneableClass clone() throws CloneNotSupportedException {
        CloneableClass cloned = (CloneableClass) super.clone();
        cloned.date = (Date) date.clone();
        return cloned;
    }
}
