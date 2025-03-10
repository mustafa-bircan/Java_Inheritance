package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() * 1.10); // %10 zam
        System.out.println(getName() + " is developing features as a Mid Developer. Salary updated: " + getSalary());
    }
}
