package com.ymatin.education.generics;

public class TwoTypesPair<T, V> {
    private T first;
    private V second;

    public TwoTypesPair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "DoublePair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
