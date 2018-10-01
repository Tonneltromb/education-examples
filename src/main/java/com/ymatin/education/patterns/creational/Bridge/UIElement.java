package com.ymatin.education.patterns.creational.Bridge;

public abstract class UIElement {
    private OperatingSystem operatingSystem;

    public UIElement(OperatingSystem operatingSystem) { this.operatingSystem = operatingSystem; }

    public abstract String getElementName();

    public String getTitle() { return "This is the "+ operatingSystem.getOSName() + " " + getElementName(); }
}
