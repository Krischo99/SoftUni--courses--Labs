package Basics;

import java.util.Scanner;

public class basics_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetForDay = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        String serves = "";
        int incomeSum = 0;

        do {
            if (!input.equals("haircut") && !input.equals("color")){
                System.out.println("Invalid input");
                input = scanner.nextLine();
                continue;
            }
            serves = scanner.nextLine();
            switch (input) {
                case "haircut":
                    if (serves.equals("mens")) {
                        incomeSum += 15;
                    } else if (serves.equals("ladies")) {
                        incomeSum += 20;
                    } else if (serves.equals("kids")) {
                        incomeSum += 10;
                    }else {
                        System.out.println("Invalid input");
                        serves = scanner.nextLine();
                        continue;
                    }
                    break;
                case "color":
                    if (serves.equals("touch up")) {
                        incomeSum += 20;
                    } else if (serves.equals("full color")) {
                        incomeSum += 30;
                    }else {
                        System.out.println("Invalid input");
                        serves = scanner.nextLine();
                        continue;
                    }
                    break;
            }
            if (incomeSum >= targetForDay) {
                System.out.printf("You have reached your target for the day!\nEarned money: %dlv.", incomeSum);
                return;
            }
            input = scanner.nextLine();
        } while (!input.equals("closed"));
        System.out.printf("Target not reached! You need %dlv. more.\nEarned money: %dlv.", targetForDay - incomeSum, incomeSum);
    }
}
