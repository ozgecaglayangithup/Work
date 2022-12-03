package Encapsulation;

public class Test_Encapsulation {
    public static void main(String[] args) {

        AccountHolder_ENCAPSULAtion accountHolder = new AccountHolder_ENCAPSULAtion();


        accountHolder.setFirstName("John" , "1234");
        System.out.println(accountHolder.getFirstName("1234"));






        accountHolder.firstName = "John";
        accountHolder.lastName = "Doe";
        accountHolder.address = "Chicago";
        accountHolder.phoneNumber = "(312) 000-0000";

        accountHolder.setSSN("000-00-0000");


        System.out.println(accountHolder.getSSN()); // null
        System.out.println(accountHolder);
        accountHolder.setBalance(12.5);
        System.out.println(accountHolder.getBalance());

    }
}
