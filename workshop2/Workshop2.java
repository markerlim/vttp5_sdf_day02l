package workshop2;

public class Workshop2 {
    public static void main(String[] args){
        BankAccount marcusbank = new BankAccount("Marcus");
        BankAccount martbank = new BankAccount("Mart",200.30f);
        FixedDepositAccount testbank = new FixedDepositAccount("VVVV", 200.50f, 4f, 5);

        marcusbank.deposit(100.20f);
        marcusbank.deposit(100.20f);

        System.out.println(marcusbank.getTransactions());

        martbank.withdraw(120.20f);
        System.out.println(martbank.getAccBal());

        System.out.println(testbank.getBalance());

    }
}
