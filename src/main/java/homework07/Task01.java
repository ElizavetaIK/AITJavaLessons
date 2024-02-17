package homework07;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст:");
        byte age = scanner.nextByte();
        if (age <= 11) {
            System.out.println("Вы ребенок");
        } else if (age <= 19) {
            System.out.println("Вы подросток");
        } else if (age <= 65) {
            System.out.println("Вы взрослый");
        } else {
            System.out.println("Вы старик");
        }
    }
}
