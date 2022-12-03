package Encapsulation;

public class AccountHolder_ENCAPSULAtion {


        String firstName;
        String lastName;
        String address;
        String phoneNumber;
        private double balance;
        private String SSN;

        public String getFirstName(String passcode) {
            if (passcode.equals("1234")) return firstName;
            else return null;
        }

        public void setFirstName(String firstName , String passcode){
            if (passcode.equals("1234")) this.firstName = firstName;
            else this.firstName = null;
            System.out.println("The passcode you provided is wrong");
        }

       public String getSSN() {
               return this.SSN;
       }

       public void setSSN(String SSN) {
           this.SSN = SSN;
       }

      // create an double balance instance variable and encapsulated

    public double getBalance() {
           return this.balance;
    }
    public void setBalance(double balance) {
           this.balance = balance;
    }



        @Override
        public String toString() {
                return "AccountHolder_ENCAPSULATION{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", address='" + address + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", SSN='" + SSN + '\'' +
                        '}';
        }
}
