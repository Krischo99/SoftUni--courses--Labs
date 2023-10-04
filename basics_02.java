package Basics;

import java.util.Scanner;

public class basics_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int poorGrades = Integer.parseInt(scan.nextLine());
        String nameTask = scan.nextLine();

        int finishTasks = 0;
        double sumGrades = 0;
        String lastTask = "";
        int poorGrade1 = poorGrades;

        while (!nameTask.equals("Enough")) {
            double currentGrade = Double.parseDouble(scan.nextLine());
            if (currentGrade <= 4) {
                poorGrades--;
            }
            lastTask = nameTask;
            sumGrades += currentGrade;
            finishTasks++;
            if (poorGrades == 0) {
                System.out.printf("You need a break, %d poor grades.", poorGrade1);
                return;
            }
            nameTask = scan.nextLine();
        }
        System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s", sumGrades / finishTasks, finishTasks, lastTask);
    }
}
