package workshop2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String name;
    private String accNum;
    private float accBal;
    private List<String> transactions = new ArrayList<>();
    private boolean closed = false;
    private LocalDateTime createDate;
    private LocalDateTime closingDate;

    public BankAccount(String name) {
        this.name = name;
        this.accBal = 0;
    };

    public BankAccount(String name, float accBal) {
        this.name = name;
        this.accBal = accBal;
    }

    public void deposit(float depositAmt){
        if(depositAmt<=0){
            throw new IllegalArgumentException("You cannot deposit a negative amount");
        }
        if(this.closed){
            throw new IllegalArgumentException("The account is closed");
        }
        this.accBal += depositAmt;
        LocalDateTime transactdate = LocalDateTime.now();
        DateTimeFormatter formattingDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = transactdate.format(formattingDate);
        transactions.add("deposit $" + depositAmt +" at " +formattedDate);
    }

    public void withdraw(float withdrawAmt){
        if(withdrawAmt<=0 || withdrawAmt>this.accBal){
            throw new IllegalArgumentException("You cannot withdraw a negative amount");
        }
        if(this.closed){
            throw new IllegalArgumentException("The account is closed");
        }
        this.accBal -= withdrawAmt;
        LocalDateTime transactdate = LocalDateTime.now();
        DateTimeFormatter formattingDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = transactdate.format(formattingDate);
        transactions.add("Withdraw $" + withdrawAmt +" at " +formattedDate);
    }
    public void setCreatedDate(LocalDateTime createDate){
        this.createDate = LocalDateTime.now();
    }
    public String getName(){
        return this.name;
    }
    public String getAccNum(){
        return this.accNum;
    }
    public float getAccBal(){
        return this.accBal;
    }
    public List<String> getTransactions(){
        return this.transactions;
    }
    public LocalDateTime getCreationDate(){
        return this.createDate;
    }
    public LocalDateTime getClosingDate(){
        return this.closingDate;
    }
    public boolean getAccStatus(){
        return this.closed;
    }
}

