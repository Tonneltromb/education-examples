package com.ymatin.education.generics;

import java.util.function.Supplier;

public class Along<T> {
    private T param;

    Along(){}

    Along(T param){ this.param = param; }

    public static <T> Along<T> makeAlong(Supplier<T> constructor){
        return new Along<>(constructor.get());
    }

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return "Along{" +
                "param=" + param +
                '}';
    }
}
