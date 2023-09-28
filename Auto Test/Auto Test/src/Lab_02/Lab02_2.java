package lab_02;

import java.util.Scanner;
public class Lab02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number:   ");
        int inputNumber = scanner.nextInt();
        boolean isNumber = (inputNumber%2 == 0 && inputNumber != 0);
        if (isNumber){
            System.out.printf("%d is Odd", inputNumber);
        } else {
            System.out.printf("%d is Even", inputNumber);
        }
    }
}
