package homework08;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}
