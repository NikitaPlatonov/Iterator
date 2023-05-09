package ru.netology;

public class Main {
    public static void main(String[] args) {
        for (int randomNumber : new Randoms(10, 100)) {
            if (randomNumber == 100) {
                System.out.println("Выпало число 100, на этом можно закончить");
                break;
            }
            System.out.println("Выпало число " + randomNumber);
        }
    }
}