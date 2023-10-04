package Basics;

import java.util.Scanner;

public class basics_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyForHoliday = Double.parseDouble(scan.nextLine());
        double currentMoney = Double.parseDouble(scan.nextLine());

        boolean toMuchSpend = false;

        int spendDays = 0;
        int currentDays = 0;

        while (moneyForHoliday > currentMoney) {
            String act = scan.nextLine();
            double sum = Double.parseDouble(scan.nextLine());
            currentDays++;
            if (act.equals("spend")) {
                spendDays++;
                currentMoney -= sum;
                if (spendDays == 5) {
                    toMuchSpend = true;
                    break;
                }
            } else if (act.equals("save")) {
                spendDays = 0;
                currentMoney += sum;
            }
            if (currentMoney < 0) {
                currentMoney = 0;
            }
        }
        if (toMuchSpend) {
            System.out.printf("You can't save the money.\n%d", currentDays);
        } else {
            System.out.printf("You saved the money for %d days.", currentDays);
        }
    }
}
