package Lab_03;

import java.util.Arrays;

public class Lab03_4 {
    public static void main(String[] args) {
        int [] array1 = {1, 12, 16, 28, 34};
        int array1len = array1.length;
        int [] array2 = {1, 13, 16, 27, 99};
        int array2len = array2.length;
        int [] mergeArr = new int[array1len + array2len];
        int ct1 = 0;
        int ct2 = 0;
        int ctM = 0;

        while (ct1 < array1len && ct2 < array2len){
            if (array1[ct1] < array2[ct2]){
                mergeArr[ctM++] = array1[ct1++];
            } else {
                mergeArr[ctM++] = array2[ct2++];
            }
        }
        while (ct1 < array1len){
            mergeArr[ctM++] = array1[ct1++];
        }
        while (ct2 < array2len){
            mergeArr[ctM++] = array2[ct2++];
        }
        System.out.println(Arrays.toString(mergeArr));
    }
}
