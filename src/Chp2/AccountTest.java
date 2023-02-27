package Chp2;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Remi",50);
       System.out.println("initial name is:" + account.getName());
        System.out.println(account.getBalance());
        account.setName("Remigious");
        System.out.println("new name is:" +account.getName());

    }

}
