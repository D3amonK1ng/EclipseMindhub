package Bank;

public abstract class BankAcount {
    private String IBAN;
    private double amount;
    private int userId;

    public BankAcount(String IBAN, int userId) {
        this.IBAN = IBAN;
        this.userId = userId;
        this.amount = 0;
    }

    public abstract void addAmount(double amount);

    public abstract void takeAmount(double amount) throws Exception;

    public abstract void load(double amount);

    public String getIBAN() {
        return IBAN;
    }

    public double getAmount() {
        return amount;
    }

    public int getUserId() {
        return userId;
    }
}
