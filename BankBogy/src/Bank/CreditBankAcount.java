package Bank;

public class CreditBankAcount extends BankAcount {
    public CreditBankAcount(String IBAN, int userId) {
		super(IBAN, userId);
		// TODO Auto-generated constructor stub
	}

	private double creditLimit;

    public CreditBankAcount(String IBAN, int userId, double creditLimit) {
        super(IBAN, userId);
        this.creditLimit = creditLimit;
    }

	@Override
	public void addAmount(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeAmount(double amount) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load(double amount) {
		// TODO Auto-generated method stub
		
	}	
}
