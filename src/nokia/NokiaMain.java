package nokia;

import java.util.Scanner;

public class NokiaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nokia nokia3310 = new Nokia();
        System.out.println(nokia3310.displayMenu());

        int userInput = scanner.nextInt();
        switch (userInput){
            case 2: nokia3310.messageMenu();
            break;
            case 3: nokia3310.callRegisterMenu();
            break;
            case 4: nokia3310.settingsMenu();
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println("Do you wish to continue? yes/no");
        String userChoice = scanner.nextLine();

        do {
            if(userChoice.equalsIgnoreCase("yes"))
            nokia3310.displayMenu();

        }while (userChoice.equalsIgnoreCase("yes"));

    }
}
