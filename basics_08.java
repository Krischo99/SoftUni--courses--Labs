package Basics;

import java.util.Scanner;

public class basics_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int symPoints = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == 'a') {
                symPoints++;
            } else if (symbol == 'e') {
                symPoints += 2;
            } else if (symbol == 'i') {
                symPoints += 3;
            } else if (symbol == 'o') {
                symPoints += 4;
            } else if (symbol == 'u') {
                symPoints += 5;
            }
        }System.out.println(symPoints);
    }
}
