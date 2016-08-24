package module2.practice;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] num) {
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1])
                {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println(Arrays.toString(num));
    }


    public static void main(String[] args) {
        int[] myIntArray1 = {1, 70, 16, 7, -1, 20};

        bubbleSort(myIntArray1);
    }
}
