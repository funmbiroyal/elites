package practices;

import java.util.Scanner;

public class ShoppingPrice {
    private final int bookPrice = 200;
    private final int bagPrice = 100;
    private final int shoePrice = 300;
    Scanner scanner = new Scanner(System.in);

    public int calculateBookQuantityPrice(int bookQuantity){
        return bookQuantity * getBookPrice();
    }
    public int calculateBagQuantityPrice(int bagQuantity){
        return bagQuantity * getBagPrice();
    }
    public int calculateShoeQuantityPrice(int shoeQuantity){
        return shoeQuantity * getShoePrice();
    }

    public  String displayOption(){
        return"""
                Welcome!
                To Check book price, press 1
                To Check bag price, press 2
                To Check Shoe price, press 3
                """;
    }
    public int getBookPrice() {
        return bookPrice;
    }

    public int getBagPrice() {
        return bagPrice;
    }

    public int getShoePrice() {
        return shoePrice;
    }
    public void getBookResponse(){
        System.out.println("How many book quantities?");
        int userBookQuantity = scanner.nextInt();
        System.out.println("A Book costs " + getBookPrice());
        System.out.println(userBookQuantity+ " book(s) costs " +calculateBookQuantityPrice(userBookQuantity));
    }
    public void getBagResponse(){
        System.out.println("How many bag quantities?");
        int userBagQuantity = scanner.nextInt();
        System.out.println("A Bag costs " + getBagPrice());
        System.out.println(userBagQuantity+ " bag(s) costs " +calculateBagQuantityPrice(userBagQuantity));
    }
    public void getShoeResponse(){
        System.out.println("How many shoe quantities?");
        int userShoeQuantity = scanner.nextInt();
        System.out.println("A shoe costs " + getShoePrice());
        System.out.println(userShoeQuantity+ " shoe(s) costs " +calculateShoeQuantityPrice(userShoeQuantity));
    }
    public void pressUserOptionNumber(){
        int userOptionNumber = scanner.nextInt();
        if (userOptionNumber == 1) getBookResponse();
        else if (userOptionNumber == 2) getBagResponse();
        else if (userOptionNumber == 3) getShoeResponse();
        else {
            System.out.println("invalid number!");
        }
    }

}
