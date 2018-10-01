package com.ymatin.education.patterns.creational.Bridge;

public class Button extends UIElement {
    public Button(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public String getElementName() {
        return "button";
    }
}
