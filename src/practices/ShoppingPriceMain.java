package practices;

import java.util.Objects;
import java.util.Scanner;

public class ShoppingPriceMain {
    public static void main(String[] args) {
        ShoppingPrice shoppingPrice = new ShoppingPrice();
        Scanner scanner = new Scanner(System.in);

        System.out.println(shoppingPrice.displayOption());

        int userOptionNumber = scanner.nextInt();

        if (userOptionNumber == 1) shoppingPrice.getBookResponse();
        else if (userOptionNumber == 2) shoppingPrice.getBagResponse();
        else if (userOptionNumber == 3) shoppingPrice.getShoeResponse();
        else {
            System.out.println("invalid number!");
        }
        String userChoice;
        do {
            System.out.println("Continue, yes/no?");
            userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase("yes")){
                System.out.println(shoppingPrice.displayOption());
                shoppingPrice.pressUserOptionNumber();
            }


        }while (userChoice.equalsIgnoreCase("yes"));

        System.out.println("Thanks for checking out, we hope to see you next time!");
    }
}
