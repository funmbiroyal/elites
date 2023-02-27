package practices;

import jdk.jfr.StackTrace;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayPractise {


    public static int sumNumbers(int ... numbers){
        int total= 0;
        for(int number : numbers){
            total += number;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sumNumbers(1,2,3,4,5,5,6,7,9,6,7,7,9,5,78));
    }

}
