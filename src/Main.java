import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Задание на условные операторы
         */
        //Ниже приведен код, запустите его, изучите.
        //1. Необходимо добавить условие, при котором в консоль будет выводится сообщение о том,
        //что введеное с клавиатуры слово не равно "фича" и не равно "бага".
        //2. Написать аналогичную программу используя switch case.
        //результат - 2 программы

        System.out.println("Это бага или фича? Введите слово: ");//выводим в консоль текст

        String task = new BufferedReader(new InputStreamReader(System.in)).readLine();//считываем текст с клавиатуры

        if (task.equals("бага")) {
            System.out.println("Это не бага, это фича");
        } else if (task.equals("фича")) {
            System.out.println("Это не фича, это бага");
        } else {
            System.out.println("Это не фича и не бага");
        }

        System.out.println();

        String task1 = new BufferedReader(new InputStreamReader(System.in)).readLine();

        switch (task1) {
            case "бага":
                System.out.println("Это не бага, это фича");
                break;
            case "фича":
                System.out.println("Это не фича, это бага");
                break;
            default:
                System.out.println("Это не фича и не бага!");

        }

        System.out.println();

        //1. Написать цикл while, который будет выводить числа от 1 до 10

        int i = 1;

        while (i <= 10) {
            System.out.println(i++);//todo Можно сократить запись, поместив i в метод println
//        i++;
        }
        System.out.println();
        //2. Написать цикл while, который будет выводить числа от 10 до 1
        int i1 = 10;
        while (i1 > 0) {
            System.out.println(i1);
            i1--;
        }
        System.out.println();
        //3. Написать цикл while, который будет выводить только четные числа от 1 до 10, т.е. 2,4,6,8
        //todo можно не использовать вложенный оператор if
        int i2 = 1;
        while (i2 < 11) {     // если 10 включительно, если нет то (i2 < 10)
            if (i2 % 2 == 0)
                System.out.println(i2);
            i2++;
        }
        System.out.println();

        //4. Написать цикл while, который будет выводить только нечетные числа от 1 до 10, т.е. 1,3,5,7,9
        //todo можно не использовать вложенный оператор if
        int i3 = 1;
        while (i3 < 11) {
            if (i3 % 2 != 0)
                System.out.println(i3);
            i3++;
        }
        //todo Бонусное задание: задания на цикл while выполнить с опертором for
    }
}
