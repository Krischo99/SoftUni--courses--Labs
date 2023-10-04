package Basics;

import java.util.Scanner;

public class basics_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourExam = Integer.parseInt(scan.nextLine());
        int minuteExam = Integer.parseInt(scan.nextLine());
        int hourStud = Integer.parseInt(scan.nextLine());
        int minuteStud = Integer.parseInt(scan.nextLine());

        int allexam = (hourExam * 60) + minuteExam;
        int allstud = (hourStud * 60) + minuteStud;
        int count = Math.abs(allexam - allstud);

        if (allexam < allstud) {
            System.out.println("Late");
            if (count >= 60) {
                int hour = count / 60;
                int minutes = count % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            } else {
                System.out.printf("%d minutes after the start", count);
            }
        } else if (allexam == allstud || count <= 30) {
            System.out.println("On time");
            if (count >= 1) {
                System.out.printf("%d minutes before the start", count);
            }
        } else {
            System.out.println("Early");
            if (count >= 60) {
                int hour = count / 60;
                int minutes = count % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            } else {
                System.out.printf("%d minutes before the start", count);
            }
        }
    }
}
