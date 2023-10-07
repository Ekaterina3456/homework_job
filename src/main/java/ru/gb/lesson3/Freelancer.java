package ru.gb.lesson3;

public class Freelancer extends Employee{

    private int hour;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Freelancer(String surname, String name, int age, double salary, int hour) {
        super(surname, name, age, salary);
        this.hour = hour;
    }

    @Override
    public double calculateSalary() {
        return salary * hour;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d лет; Фрилансер; среднемесячная заработная плата (почасовая): %.2f (рублей); cумма выплат: %.2f",
                surname, name, age, salary, calculateSalary());
    }
}
