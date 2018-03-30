package HomeWork.ArrTaskList;

import java.util.Random;

public class DoubleHalfReverce {
    DoubleHalfReverce() {
        int [] arr = new int[10];
        int len = arr.length/2;
        int [] a = new int[arr.length/2];
        int [] b = new int[arr.length/2];
        Random rand = new Random();

        System.out.println("Заполняем массив");
        for (int i = 0; i < arr.length; i++) {
            int tmp = rand.nextInt(21) - 1;
            if (tmp == -1) tmp += 1;
            arr[i] = tmp;
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i<arr.length; i++) {
            int tmp;
            if (i < arr.length / 2) {
                a[i] = arr[i];

            } else if (i >= arr.length/2){
                b[i-(arr.length/2)] = arr[i];
            }
        }
        System.out.println("\nперевернутые половины");
        for (int i = 0; i<len/2; i++){
            int tmp1 = a[i];
            int tmp2 = b[i];
            a[i] = a[a.length - i - 1];
            b[i] = b[len - i - 1];
            a[a.length - i - 1] = tmp1;
            b[len - i - 1] = tmp2;
        }

        for (int i = 0; i<arr.length; i++){
            if (i < len){
                arr[i] = a[i];
            } else if (i >= len) {
                arr[i] = b[i - len];
            }
        }

        for (int i: arr) System.out.print(i + "\t");
    }

    public static void main(String[] args) {
        DoubleHalfReverce a = new DoubleHalfReverce();
    }

}
