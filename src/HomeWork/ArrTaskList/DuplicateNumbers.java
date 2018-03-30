package HomeWork.ArrTaskList;

import java.util.Random;


public class DuplicateNumbers {
    DuplicateNumbers() {
        Random r = new Random();
        int arr[] = new int[10];
        int arr1[] = new int[10];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) arr1[i] = -1;
        System.out.println("Array:");

        for (int i = 0; i < arr.length; i++) {
            int tmp = r.nextInt(21) - 1;
            if (tmp == -1) tmp += 1;
            arr[i] = tmp;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (arr[j] != -1)) {
                    if ((j != i) && (count == 0)) {
                        count++;
                        arr1[i] = arr[j];
                        arr[i] = -1;
                        arr[j] = -1;
                    }
                }
             }
        }

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if ((arr1[i] == arr1[j]) && (arr1[j] != -1)) {
                    if ((j != i) && (count == 0)) {
                        count++;
                        arr1[i] = -1;
                    }
                }
            }
        }
        System.out.println("Duplicate numbers:");

        for (int i = 0; i<arr1.length; i++ ) {
            if (arr1[i] != -1) System.out.print(arr1[i] + "\t");
        }
    }
    public static void main(String[] args) {
        DuplicateNumbers a = new DuplicateNumbers();

    }
}


