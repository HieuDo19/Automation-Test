package lab_07_1;

import java.util.Arrays;

public class TestEmployeeController {
    public static void main(String[] args) {

        Employee fte1 = new FTE();
        Employee fte2 = new FTE();
        Employee fte3 = new FTE();
        Employee ce1 = new CE();
        Employee ce2 = new CE();
        int totalSalary = EmployeeController.getTotalSalary(Arrays.asList(fte1, fte2, fte3, ce1, ce2));
        System.out.printf("Total salary is: %d", totalSalary);

    }
}
