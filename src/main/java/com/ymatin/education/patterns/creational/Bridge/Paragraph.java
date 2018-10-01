package com.ymatin.education.patterns.creational.Bridge;

public class Paragraph extends UIElement {
    public Paragraph(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public String getElementName() {
        return "paragraph";
    }
}
