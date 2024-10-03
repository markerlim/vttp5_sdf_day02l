package workshop2;

public class FixedDepositAccount extends BankAccount{

    private float interest;
    private Integer months;
    private boolean changedInt;
    private boolean changedMth;

    public FixedDepositAccount(String name) {
        super(name);
        this.interest = 0.03f;
        this.months = 6;
        this.changedInt=false;
        this.changedMth=false;

    }

    public FixedDepositAccount(String name, Float accBal) {
        super(name, accBal);
        this.interest = 0.03f;
        this.months = 6;
        this.changedInt=false;
        this.changedMth=false;
    }

    public FixedDepositAccount(String name, Float accBal, Float interest, Integer months ) {
        super(name, accBal);
        this.interest = interest/100;
        this.months = months;
        this.changedInt=false;
        this.changedMth=false;
    }

    public void IntChange(Float interestRate){
        if(changedInt){
            throw new IllegalArgumentException("You have already made a change before, you cannot make anymore changes");
        }
        this.interest = interestRate;
        changedInt=true;
    }

    public void MthChange(Integer months){
        if(changedMth){
            throw new IllegalArgumentException("You have already made a change before, you cannot make anymore changes");
        }
        this.months = months;
        changedMth=true;
    }

    @Override()
    public void deposit(float depositAmt){

    }
    @Override()
    public void withdraw(float withdrawAmt){

    }

    public float getBalance(){
        return getAccBal() * (1+this.interest);
    }
}
