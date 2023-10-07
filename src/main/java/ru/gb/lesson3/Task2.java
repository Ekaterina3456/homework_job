package ru.gb.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    static Random random = new Random();

    static Woker generateWorker() {

        String[] names = new String[] {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[] {"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salary = random.nextInt(50000, 100000);
        int age = random.nextInt(18,65);
        Woker woker = new Woker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, salary);
        return woker;
    }

    static Freelancer generateFreelancer() {

        String[] names = new String[] {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[] {"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salary = random.nextInt(800, 2000);
        int hour = random.nextInt(81);
        int age = random.nextInt(18,65);
        Freelancer freelancer = new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, salary, hour);
        return freelancer;
    }

    static Employee[] generateEmployees (int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < employees.length; i++) {
            int type = random.nextInt(2);
            if (type == 0) {
                employees[i] = generateWorker();
            }
            if (type == 1) {
                employees[i] = generateFreelancer();
            }
        }
        return employees;
    }

    public static void main(String[] args) {

//        Woker woker = new Woker("Иван", "Иванов", 85000);
//        System.out.println(woker);

        Employee[] employees = generateEmployees(15);

        for (Employee em : employees) {
            System.out.println(em);
        }

        Arrays.sort(employees, new SalaryComparetor(SortType.Ascending));

        System.out.println();

        for (Employee em : employees) {
            System.out.println(em);
        }

        Arrays.sort(employees, new AgeComparator(SortType.Descending));

        System.out.println();

        for (Employee em : employees) {
            System.out.println(em);
        }

    }
}
