package Basics;

import java.util.Scanner;

public class basics_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        double saveMoney = 0;
        String nameDestination = "";

        while (!destination.equals("End")) {
            nameDestination = destination;
            double minimumBudget = Double.parseDouble(scanner.nextLine());

            String inputMoney = scanner.nextLine();
            while (!inputMoney.equals("End")){
                double savedMoney = Double.parseDouble(inputMoney);
                saveMoney += savedMoney;
                if (minimumBudget <= saveMoney){
                    System.out.printf("%.2f lv\n", saveMoney);
                    saveMoney = 0;
                    break;
                }
                inputMoney = scanner.nextLine();
            }
            if (inputMoney.equals("End")){
                break;
            }
            System.out.printf("Going to %s!\n",nameDestination);
            destination = scanner.nextLine();
        }
    }
}
