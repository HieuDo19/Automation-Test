package lab_04;

import java.util.*;

public class Lab_4 {
    static final int ARRAY_LENGTH = 9;
    static final int MAX_VALUE = 1000;

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        generateRandomNumber(myList);

        Scanner scanner = new Scanner(System.in);

        boolean isContinuing = true;
        while (isContinuing) {
            printMenu();
            System.out.print("Please enter your option: ");
            int userOption = scanner.nextInt();

            switch (userOption) {
                case 1:
                    printAllNumbers(myList);
                    break;
                case 2:
                    printMaxiumValue(myList);
                    break;
                case 3:
                    printMinimumValue(myList);
                    break;
                case 4:
                    searchNumber(myList);
                    break;
                case 5:
                    isContinuing = false;
                    System.out.println("End Game!!");
                    break;
                default:
                    System.out.println("Please enter a number in Menu!!");
            }
        }
    }

    public static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. End Game!!");
    }

    public static void generateRandomNumber(List<Integer> myList) {
        Random random = new Random();
        for (int index = 0; index < ARRAY_LENGTH; index++) {
            int randomNumber = random.nextInt(MAX_VALUE);
            myList.add(randomNumber);
        }
        System.out.println(myList);
    }

    public static void printAllNumbers(List<Integer> myList) {
        System.out.println("Your array list is: " + Arrays.toString(myList.toArray()));
    }

    public static void printMaxiumValue(List<Integer> myList) {
        int maxValue = myList.get(0);
        for (int index = 0; index < myList.size(); index++) {
            if (myList.get(index) > maxValue) {
                maxValue = myList.get(index);
            }
        }
        System.out.println("Max value is: " + maxValue);
    }

    public static void printMinimumValue(List<Integer> myList) {
        int minValue = myList.get(0);
        for (int index = 0; index < myList.size(); index++) {
            if (myList.get(index) < minValue) {
                minValue = myList.get(index);
            }
        }
        System.out.println("Min value is: " + minValue);
    }

    public static void searchNumber(List<Integer> myList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int searchNumber = scanner.nextInt();
        int indexNumber = -1;
        for (int index = 0; index < ARRAY_LENGTH; index++) {
            if (searchNumber == myList.get(index)) {
                indexNumber = index;
            }
        }
        if (indexNumber >= 0) {
            System.out.println("Index of your number is: " + indexNumber);
        } else {
            System.out.println("Your number is not in the list");
        }
    }
}

