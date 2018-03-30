package Matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixDemo {
    MatrixDemo(){
        Scanner scan = new Scanner(System.in);
        Random rand =  new Random();
        int a = 0, b = 0;
        int tmp;
        System.out.println("Введите кол-во строк");
        a = scan.nextInt();
        System.out.println("Введите кол-во столбцов");
        b = scan.nextInt();
        int [][] arr = new int[a][b];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                tmp = rand.nextInt(21) - 1;
                if (tmp == -1) tmp += 1;
                arr[i][j] = tmp;
            }
        }
        for ( int i = 0; i<arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n\nВыводим наибольшее и наименьшее значения эл. массива:");
        int maxVal = 0, minVal = 100;
        int [] maxInd = {0,0};
        int [] minInd = {0,0};
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++){
                if (minVal > arr[i][j]) {
                    minVal = arr[i][j];
                    minInd [0] = i;
                    minInd [1] = j;
                }
                if (maxVal < arr[i][j]) {
                    maxVal = arr[i][j];
                    maxInd [0] = i;
                    maxInd [1] = j;
                }
            }
        }
        System.out.print("Большее:\t" + maxVal + "\tс индексом: ");
        for (int i : maxInd) System.out.print(i+"\t");
        System.out.print("\nМеньшее:\t" + minVal + "\tс индексом: " );
        for (int i : minInd) System.out.print(i+"\t");

        System.out.println("\n\nВыводим в консоль строку, сумма элементов которой максимальна:");
        int maxSum;
        int arrMax[] = new int [arr.length];
        for (int i = 0; i< arr.length; i++){
            maxSum = 0;
            for (int j = 0; j < arr[0].length; j++){
                maxSum += arr[i][j];
            }
            arrMax[i] = maxSum;
        }
        maxVal = 0;
        int ind = 0;
        for (int i = 0; i < arrMax.length; i++){
            if (maxVal < arrMax[i]) {
                maxVal = arrMax[i];
                ind  = i;
            }
        }
        System.out.println("Максимальная сумма элементов:\t"+ maxVal + "\nнаходистся в строке с индексом\t" + ind);
    }

    public static void main(String[] args) {
        MatrixDemo demo = new MatrixDemo();
    }
}
