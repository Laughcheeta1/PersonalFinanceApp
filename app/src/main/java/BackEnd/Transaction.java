package BackEnd;

public class Transaction {
    private String transactionName;
    private String description;
    private double transactionAmount;

    private double amountPayedToDate;
    private float interest;
    private short dues;

    public Transaction (String transactionName, String description, double transactionAmount, float interest, short dues)
    {
        this.transactionName = transactionName;
        this.description = description;
        this.transactionAmount = transactionAmount;
        amountPayedToDate = 0;
        this.interest = interest;
        this.dues = dues;
    }

    /**
     * @return the total amount of money remaining to pay considering you pay the exact amount per month
     */
    public double getTotalLeftToPay()
    {

    }

    public String getTransactionName() {
        return transactionName;
    }

    public String getDescription() {
        return description;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public double getAmountPayedToDate()
    {
        return amountPayedToDate;
    }

    public float getInterest() {
        return interest;
    }

    public short getDues() {
        return dues;
    }
}
