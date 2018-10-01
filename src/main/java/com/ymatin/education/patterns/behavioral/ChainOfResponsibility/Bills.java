package com.ymatin.education.patterns.behavioral.ChainOfResponsibility;

public enum Bills {
    FIVE_THOUTHAND(5000),
    ONE_THOUTHAND(1000),
    FIVE_HUNDRED(500),
    ONE_HUNDRED(100),
    FIFTY(50),
    TEN(10),
    FIVE(5),
    TWO(2),
    ONE(1);

    private int value;

    Bills(int value) {
    this.value = value;
    }

    public int getValue() {
        return value;
    }
}
