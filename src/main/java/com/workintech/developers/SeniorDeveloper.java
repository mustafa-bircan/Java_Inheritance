package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() * 1.15); // %15 zam
        System.out.println(getName() + " is leading projects as a Senior Developer. Salary updated: " + getSalary());
    }
}
