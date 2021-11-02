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
            System.out.println("Это не фича, это бага");
        }

        if (task.equals("фича")) {
            System.out.println("Это не бага, это фича");
        }
        else {
            System.out.println("Это не фича и не бага");
        }//todo ответы некорртектные, нужно поправить
        /**
         * Задание на циклические операторы
         */
        System.out.println("Это бага или фича? Введите слово: ");//выводим в консоль текст

          String mask = new BufferedReader(new InputStreamReader(System.in)).readLine();
        switch(mask) {
            case "бага" : System.out.println("да, это бага");
                 break;
            case "фича" : System.out.println("да, это фича");
                 break;
            default:  System.out.println("Это не бага и не фича");
                 break;
        }


        //1. Написать цикл while, который будет выводить числа от 1 до 10
        int v = 1;
        while (v < 11) {
            System.out.println(" " +v);
            v++;
        }
        //2. Написать цикл while, который будет выводить числа от 10 до 1
        int t = 10;
        while (t >= 1) {
            System.out.println(t);
            t--;
        }
        //3. Написать цикл while, который будет выводить только четные числа от 1 до 10, т.е. 2,4,6,8
        int c = 2;
        while (c < 10) {
            System.out.println(" " + c);
            c += 2;
        }
        //4. Написать цикл while, который будет выводить только нечетные числа от 1 до 10, т.е. 1,3,5,7,9
        int r = 1;
        while (r < 10) {
            System.out.println(" " + r);
            r += 2;
        }
    }
}
