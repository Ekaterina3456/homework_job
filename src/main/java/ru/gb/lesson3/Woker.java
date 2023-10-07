package ru.gb.lesson3;

public class Woker extends Employee{

    public Woker(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d лет; Рабочий; среднемесячная заработная плата (фиксированная): %.2f (рублей)",
                surname, name, age, calculateSalary());
    }
}
