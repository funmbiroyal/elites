package Chp2;

public class Loops {
    public static void main(String[] args) {
        int counter = 0;
        while(counter <= 5){
            System.out.println(counter);
            counter++;
        }
        for(int count = 0; count <= 5;count++){
            System.out.println(count);
        }

        int countNo = 0;
        do {
            System.out.println(countNo);
            countNo++;
        }while (countNo <= 5);
    }
}
