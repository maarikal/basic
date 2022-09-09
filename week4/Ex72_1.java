package week4;

public class Ex72_1 {
    public static void main(String[] args) {
        Account mattAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);

        System.out.println(mattAccount);
        System.out.println(myAccount);

        mattAccount.withdrawal(100);
        System.out.println(mattAccount);

        myAccount.deposit(100);
        System.out.println(myAccount);
    }

}
