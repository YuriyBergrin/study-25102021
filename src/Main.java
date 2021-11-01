import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Задание на условные операторы.

         //Ниже приведен код, запустите его, изучите.
         //1. Необходимо добавить условие, при котором в консоль будет выводится сообщение о том,
         //что введеное с клавиатуры равно не "фича" и не равно "бага".
         //2. Написать аналогичную программу используя switch case.
         //результат - 2 программы
         */
        System.out.println("Это бага или фича? Введите слово: ");//выводим в консоль текст

        String task = new BufferedReader(new InputStreamReader(System.in)).readLine();//считываем текст с клавиатуры

 if (task.equals("бага")) {
 System.out.println("Это не бага,");
 }else {
 if (task.equals("фича")) {
 System.out.println("Это не фича,");
 }else {
 System.out.println("Не мышонок, не лягушка,");
 }}


 switch (task){
 case "фича":
 System.out.println("это бага");
 break;
 case "бага":
 System.out.println("это фича");
 break;
 default:
 System.out.println("а неведома зверушка");
 }

        /**
         * Задание на циклические операторы.
         */
        //1. Написать цикл while, который будет выводить числа от 1 до 10
        System.out.println("\nЦикл while, который будет выводить числа от 1 до 10");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        //2. Написать цикл while, который будет выводить числа от 10 до 1
        System.out.println("\nЦикл while, который будет выводить числа от 10 до 1");
        i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        //3. Написать цикл while, который будет выводить только четные числа от 1 до 10, т.е. 2,4,6,8
        System.out.println("\nЦикл while, который будет выводить только четные числа от 1 до 10, т.е. 2,4,6,8");
        int x = 1;
        while (x <= 10){
            if (x%2==0)
            System.out.println(x);
            x++;
        }

        //4. Написать цикл while, который будет выводить только нечетные числа от 1 до 10, т.е. 1,3,5,7,9

        System.out.println("\nЦикл while, который будет выводить только нечетные числа от 1 до 10, т.е. 1,3,5,7,9");
        if (x == 10);
        x = 1;
        while (x <= 10){
            if (x%2!=0)
                System.out.println(x);
            x++;
        }
    }}
