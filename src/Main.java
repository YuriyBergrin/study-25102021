import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Задание на условные операторы.
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
        }

        else if (task.equals("фича")) {
            System.out.println("Это не фича, это бага");
        }
        else {
            System.out.println("Это не фича, и это не бага");
        }

        System.out.println();

        System.out.println("Это бага или фича? Введите слово: ");

        String task2 = new BufferedReader(new InputStreamReader(System.in)).readLine();

        switch (task2){
            case "бага":
                System.out.println("Это не бага, это фича");
                break;
            case "фича":
                System.out.println("Это не фича, это бага");
                break;
            default:
                System.out.println("Это не фича, и это не бага");

        }

        System.out.println();


        /**
         * Задание на циклические операторы.
         */
        //1. Написать цикл while, который будет выводить числа от 1 до 10
        //2. Написать цикл while, который будет выводить числа от 10 до 1
        //3. Написать цикл while, который будет выводить только четные числа от 1 до 10, т.е. 2,4,6,8
        //4. Написать цикл while, который будет выводить только нечетные числа от 1 до 10, т.е. 1,3,5,7,9

        int a = 1;
        while (a != 11) {
            System.out.println(a);
            a++;
        }

        System.out.println();

        int b = 10;
        while (b != 0) {
            System.out.println(b);
            b--;
        }

        System.out.println();

        int c = 2;
        while (c != 10) {
            System.out.println(c);
            c = c+2;
        }


        System.out.println();

        int d = 1;
        while (d != 11) {
            System.out.println(d);
            d = d+2;
        }




    }
}
