package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    private int juniorIndex = 0;
    private int midIndex = 0;
    private int seniorIndex = 0;

    public HRManager(int id, String name, double salary, int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorSize];
        this.midDevelopers = new MidDeveloper[midSize];
        this.seniorDevelopers = new SeniorDeveloper[seniorSize];
    }

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }




    public void addEmployee(JuniorDeveloper junior) {
        if (juniorIndex < juniorDevelopers.length) {
            juniorDevelopers[juniorIndex++] = junior;
            System.out.println(junior.getName() + " added as Junior Developer.");
        } else {
            System.out.println("Junior Developer list is full! Can't add " + junior.getName());
        }
    }

    public void addEmployee(MidDeveloper mid) {
        if (midIndex < midDevelopers.length) {
            midDevelopers[midIndex++] = mid;
            System.out.println(mid.getName() + " added as Mid Developer.");
        } else {
            System.out.println("Mid Developer list is full! Can't add " + mid.getName());
        }
    }

    public void addEmployee(SeniorDeveloper senior) {
        if (seniorIndex < seniorDevelopers.length) {
            seniorDevelopers[seniorIndex++] = senior;
            System.out.println(senior.getName() + " added as Senior Developer.");
        } else {
            System.out.println("Senior Developer list is full! Can't add " + senior.getName());
        }
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing HR processes.");
    }
}