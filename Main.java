public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolder("Rahul");

        account.deposit(1000.0);
        account.withdraw(300.0);
        account.withdraw(800.0);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}
