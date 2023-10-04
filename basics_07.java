package Basics;

import java.util.Scanner;

public class basics_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int year = 1;
        int fail = 0;
        double allGrades = 0;

        while (year <= 12) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade < 4) {
                fail++;
                if (fail > 1) {
                    break;
                }
                continue;
            }
            allGrades += grade;
            year++;
        }
        if (fail == 2) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, allGrades/12);
        }
    }
}
