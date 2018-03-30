package HomeWork.ArrExample;

import java.util.Random;

public class ExamleArr {
    int a = 10;
    int output, temp;
    int array[] = new int [a];
    public ExamleArr() {
        Random r = new Random();
        System.out.println("Создаем массив и заполняем случайными числами:");
        for (int i = 0; i < a; i++) {
            int tmp = r.nextInt(21) - 1;
            if (tmp == -1) tmp += 1;
            array[i] = tmp;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\nНаходим среднее арифметическое эл. массива:");
        for (int i:array) {
            temp += i;
        }
        System.out.println(output = temp/array.length);

        System.out.println("\n\nУмножаем эллементы массива на 2:");
        for (int i = 0; i < array.length/2; i++) {
            array[i] *=2;
        }
        for (int i: array) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nПереворачиваем массив: ");
        for (int i = 0; i < array.length/2; i++){
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        for (int i: array) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nВыводим наибольшее и наименьшее значения эл. массива:");
        int maxVal = 0, minVal = 100, maxInd = 0, minInd = 0;
        for (int i = 0; i < array.length; i++){
            if (minVal > array[i]) {
                minVal = array[i];
                minInd = i;
            }
            if (maxVal < array[i]) {
                maxVal = array[i];
                maxInd = i;
            }
        }
        System.out.println("Большее:\t" + maxVal + "\t\tс индексом: " + maxInd);
        System.out.println("Меньшее:\t" + minVal + "\t\tс индексом: " + minInd);


    }

    public static void main(String[] args) {
        ExamleArr arr = new ExamleArr();
    }
}
