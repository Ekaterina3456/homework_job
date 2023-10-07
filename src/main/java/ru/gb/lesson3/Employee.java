package ru.gb.lesson3;

public abstract class Employee implements Comparable<Employee> {

    protected String name;

    protected String surname;

    protected double salary;

    protected int age;

    public Employee(String surname, String name, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int surnameRes = surname.compareTo(o.surname);
        if (surnameRes == 0) {
            return name.compareTo(o.name);
        }
        return surnameRes;
    }
}
