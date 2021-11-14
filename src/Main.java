import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Данны массив и список
        int[] array = {10, 2, 10, 3, 1, 2, 5};//массив
        List<Integer> list = Arrays.asList(10, 2, 10, 3, 1, 2, 5);//список

        //вывести в консоль максимум, минимум и сумму всех элементов массива
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение в массиве array: " + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение в массиве array: " + min);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива array: " + sum);

        System.out.println();


        //вывести в консоль максимум, минимум и сумму всех элементов списка

        int maxL = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maxL) {
                maxL = list.get(i);
            }
        }
        System.out.println("Максимальное значение в списке list: " + maxL);

        int minL = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minL) {
                minL = list.get(i);
            }
        }
        System.out.println("Минимальное значение в списке list: " + min);

        int sumL = 0;
        for (int i = 0; i < list.size(); i++) {
            sumL += list.get(i);
        }
        System.out.println("Сумма элементов списка list: " + sum);

        System.out.println();

        //реализовать сортировку массива по возрастанию пузырьковым методом
        //напишите ваш код тут

        int sort;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    sort = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sort;
                }
            }
        }

        System.out.println("Отсортированный массив array: " + Arrays.toString(array));

        int sortL;
        for (int a = list.size() - 1; a > 0; a--) {
            for (int b = 0; b < a; b++) {
                if (list.get(b) > list.get(b + 1)) {
                    sortL = list.get(b);
                    list.set(b, list.get(b + 1));
                    list.set(b + 1, sortL);
                }
            }
        }

        System.out.println("Отсортированный список list: " + Arrays.toString(list.toArray()));

        System.out.println();

        //бонусное задание на циклы: вывести в консоль нижнюю треугольную матрицу из звездочек:

        int star = 9;

        for (int i = 0; i < star; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}

