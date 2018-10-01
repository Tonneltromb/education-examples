package com.ymatin.education.generics;

public class ExperiencedManager extends Manager {
    private Integer experience;

    public ExperiencedManager(String name, Integer salary, Integer experience) {
        super(name, salary);
        this.experience = experience;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "ExperiencedManager{" +
                "experience=" + experience +
                '}';
    }
}
