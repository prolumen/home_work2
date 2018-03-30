package HomeWork.ArrTaskList;

import java.util.Random;
import java.util.Scanner;

public class ShiftArr {
    ShiftArr(){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        boolean flag = false;
        System.out.print("Введите размер массива: ");
        int len = s.nextInt();
        int [] arr = new int[len];
        System.out.println();

        for (int i = 0; i<arr.length; i++){
            int tmp = r.nextInt(21) -1;
            if (tmp == -1) tmp ++;
            arr[i] =tmp;
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nдля сдвига влево тыцните l: ");
        System.out.println("для сдвига вправо тыцните r: ");
        System.out.println("для выхода тыцните хоть ШО-нибудь: \t");
        String choose = new String();

        choose = s.next();
        if (choose.equals("l")){
            int a = arr[0];
            for (int i =0; i<arr.length-1; i++) arr[i] = arr[i + 1];
            arr[arr.length - 1] = a;
            for (int i: arr) System.out.print(i + "\t");
        } else if (choose.equals("r")){

            int a = arr[arr.length - 1];
            for (int i = len-1; i>0 ; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = a;
            for (int i: arr) System.out.print(i + "\t");
        }
    }

    public static void main(String[] args) {
        ShiftArr a = new ShiftArr();

    }
}
