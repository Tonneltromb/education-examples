package com.ymatin.education.generics;

public class Manager extends Employee {
    private Integer salary;

    public Manager(String name, Integer salary) {
        super(name);
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name= " + getName() + ", " +
                "salary= " + salary +
                " }";
    }
}
