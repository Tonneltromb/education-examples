package com.ymatin.education.patterns.creational.Bridge;

public class WindowsElemetsFactory extends UIElementsFactory {

    private OperatingSystem os = new Windows();
    @Override
    Button createButton() {
        return new Button(os);
    }

    @Override
    Paragraph createParagraph() {
        return new Paragraph(os);
    }
}
