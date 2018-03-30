package Lesson;

import java.util.Random;

public class TestArrRand {
    public static void main(String[] arg){
        Random r = new Random();
        int array[] = new int[10];
        int[]arraySort = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int tmp = r.nextInt(11) - 1;
            if (tmp == -1) tmp += 1;
                array[i] = tmp;
                System.out.print(array[i] + "\t");
        }

        for(int i = array.length; i >= 0; i--){
            arraySort[array.length - i] = array[i];
        }

        for(int a = 0; a < array.length; a++){
            array[a] = arraySort[a];
        }
    }
}

