package com.ymatin.education.patterns.creational.Bridge;

public class LinuxElementFactory extends UIElementsFactory {

    private OperatingSystem os = new Linux();
    @Override
    Button createButton() {
        return new Button(os);
    }

    @Override
    Paragraph createParagraph() {
        return new Paragraph(os);
    }
}

