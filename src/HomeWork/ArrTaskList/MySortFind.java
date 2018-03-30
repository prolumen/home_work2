package HomeWork.ArrTaskList;

import java.util.Random;
import java.util.Scanner;

public class MySortFind {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    int arr[] = new int[10];
    //int arr1[] = new int[10];
    boolean flag;
    int tmp;

    MySortFind() {
        this.arr = arr;
        //for (int i = 0; i < arr.length; i++) arr[i] = -1;
        System.out.println("Array:");

        for (int i = 0; i < arr.length; i++) {
            int tmp = r.nextInt(21) - 1;
            if (tmp == -1) tmp += 1;
            arr[i] = tmp;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        do {
            flag = false;
            for (int i = arr.length-2; i>=0; i--){
                if (arr[i] < arr[i+1]){
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    flag =true;
                }
            }
        } while (flag);
        for (int i: arr) System.out.print(i + "\t");

        System.out.println("\nВведите число для поиска в массиве");
        tmp = sc.nextInt();

        int res = -1;
        int l = 0;
        int r = arr.length - 1;

        while (r >= l){
            int c = (r + l)/2;
            if (tmp == arr[c]){
                res = c;
                break;
            }
            if (tmp>arr[c]) r = c - 1;
            if (tmp<arr[c]) l = c + 1;
        }
        if (res<0) System.out.println("Тут ничего нет");
        else System.out.println("Есть такое в элементе\t" + res);
    }
    public static void main(String[] args) {
     MySortFind mf = new MySortFind();
    }
}
