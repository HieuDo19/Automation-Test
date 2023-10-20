package lab_06;

import java.util.Scanner;

public class Lab06_3 {
    public static String getDigitNumberFromString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < s.length(); index++) {
            char current = s.charAt(index);
            if (48 <= current && 57 >= current) stringBuilder.append(current);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input text: ");
        String test = scanner.nextLine();
        System.out.println("Digit Number: " + getDigitNumberFromString(test));
    }
}
