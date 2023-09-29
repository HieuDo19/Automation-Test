package lab_03;

public class Lab03_2 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 10};
        int max = intArr [0];
        int min = intArr [0];
        for (int index = 0; index < intArr.length; index++) {
            if (intArr[index] > max) {
                max = intArr[index];
            }
            else if (min > intArr[index]) {
                min = intArr[index];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
