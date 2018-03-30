package HomeWork.ArrTaskList;

import java.util.Random;

public class MySort{
    int [] arr = new int[10];
    int len = arr.length/2;
    int [] a = new int[arr.length/2];
    int [] b = new int[arr.length/2];
    Random rand = new Random();

    public MySort(){
        this.arr = arr;
        System.out.println("Заполняем массив");
        for (int i = 0; i < arr.length; i++) {
            int tmp = rand.nextInt(21) - 1;
            if (tmp == -1) tmp += 1;
            arr[i] = tmp;
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i<arr.length; i++) {
            if (i < arr.length / 2) {
                a[i] = arr[i];
            } else if (i >= arr.length/2){
                b[i-(arr.length/2)] = arr[i];
            }
        }

        System.out.println("\nSort");
        int tmp = 0;
        for (int i = 0; i<a.length-1; i++){
            int min = i;
            int max = i;
            for (int j = i+1; j<a.length; j++){
                if (a[j] < a[min]) min = j;
                if (b[j] > b[max]) max = j;

            }
            if (min != i){
                tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
            if (max != i){
                tmp = b[i];
                b[i] = b[max];
                b[max] = tmp;
            }
        }

        for (int i = 0; i<arr.length; i++){
            if (i<arr.length/2) {
                arr[i] = a[i];
            } else if (i >= a.length/2) {
                arr[i] = b[i-arr.length/2];
            }
        }

        for (int i : arr) System.out.print(i + "\t");


    }



    public static void main(String[] args) {
        MySort s = new MySort();
    }
}
