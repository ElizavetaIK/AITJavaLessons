package homework08;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int summ = 0;
        for (int i = 1; i <= number; i++) {
            summ = summ + i;
        }
        System.out.println(summ);
    }
}
