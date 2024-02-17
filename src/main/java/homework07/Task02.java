package homework07;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вопрос 1: Верно ли, что оператор неравенства обознаается ==? Варианты ответа: да, нет");
        String answerOne = scanner.next();
        int resultOne;
        if (answerOne.equals("нет")) {
            resultOne = 1;
        } else {
            resultOne = 0;
        }
        System.out.println("Вопрос 2: Какое значение из перечисленных может принимать переменная byte? Варианты ответа: a:28, b:801, c:-129");
        String answerTwo = scanner.next();
        int resultTwo;
        if (answerTwo.equals("a")) {
            resultTwo = 1;
        } else {
            resultTwo = 0;
        }
        System.out.println("Вопрос 3: Какой класс позволяет хранить строки и работать с ними?");
        String answerThree = scanner.next();
        int resultThree;
        if (answerThree.equals("String")) {
            resultThree = 1;
        } else {
            resultThree = 0;
        }
        if ((resultOne + resultTwo + resultThree) >= 2) {
            System.out.println("Вы хорошо знаете программирование!");
        } else {
            System.out.println("Вам нужно учиться больше!");
        }
    }
}
