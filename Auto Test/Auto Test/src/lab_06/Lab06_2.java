package lab_06;

import java.util.Scanner;

public class Lab06_2 {
    public static String CORRECT_PASS = "hieu123";
    public static int MAX_INPUT = 3;

    public static void checkInputPassword() {
        int numberInput = 0;
        boolean flag = false;
        System.out.println("Input your password: ");
        while (numberInput < MAX_INPUT) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals(CORRECT_PASS)) {
                System.out.println("Successful");
                flag = true;
                break;
            } else {
                System.out.println("Wrong Pass, Please again: ");
                numberInput++;
            }
        }
        if (!flag) System.out.println("Input wrong 3 times");
    }

    public static void main(String[] args) {
        checkInputPassword();
    }
}
