package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientOs = 0;
        if (clientOs < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int clientOs = 0;
        int clientDeviceYear = 2012;
        if (clientOs < 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs < 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }


    public static void task3() {
        int year = 1900;
        float yearOne = year % 4;
        float yearTwo = year % 100;
        float yearThree = year % 400;
        boolean yearOneBool = yearOne == 0;
        boolean yearTwoBool = yearTwo >= 0;
        boolean yearThreeBool = yearThree == 0;
        if (yearOneBool && yearTwoBool && yearThreeBool) {
            System.out.println(+year + " год является високосным");
        } else {
            System.out.println(+year + " год не является високосным");
        }
    }


    public static void task4() {
        int deliveryDistance = 141;
        int firstDay = 20;
        int distanceNextDay = 40;
        int numberOfDay = 1;
        int dostavka = 0;
        boolean deltaDay = (deliveryDistance - firstDay) % distanceNextDay != 0;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + numberOfDay);
        } else if (deliveryDistance > firstDay && deltaDay) {
            dostavka = numberOfDay + (deliveryDistance - firstDay) / distanceNextDay + 1;
            System.out.println("Потребуется дней " + dostavka);
        } else {
            dostavka = numberOfDay + (deliveryDistance - firstDay) / distanceNextDay;
            System.out.println("Потребуется дней " + dostavka);
        }


    }


    public static void task5() {
        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима!!!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Вескна !!!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето!!!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень!!!");
                break;
            default:
                System.out.println("Такого месяца не существует!!!");
        }

    }
}
