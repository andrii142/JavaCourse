package module2.practice;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] num) {
        int j;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (j = 0; j < num.length - 1; j++) {
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
        int[] myIntArray1 = {1, 20, 3, 7};

        bubbleSort(myIntArray1);
    }
}
