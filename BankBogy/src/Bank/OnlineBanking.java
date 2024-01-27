package Bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineBanking {
    private Map<Integer, User> users;
    private Map<String, BankAcount> bankAcounts;

    public OnlineBanking() {
        this.users = new HashMap<>();
        this.bankAcounts = new HashMap<>();
    }

    public int registerUser(String name) {
        int userId = users.size() + 1;
        User newUser = new User(userId, name);
        users.put(userId, newUser);
        return userId;
    }

    public void registerBankAccount(int userId, AcountType accountType) throws Exception {
        if (!users.containsKey(userId)) {
            throw new Exception("User with ID " + userId + " does not exist.");
        }

        String IBAN = generateUniqueIBAN();
        BankAcount newAccount = null;

        switch (accountType) {
            case DEBIT:
                newAccount = new DebitBankAccount(IBAN, userId);
                break;
            case CREDIT:
                newAccount = new CreditBankAcount(IBAN, userId, 1000);
                break;
            case SAVINGS:
                newAccount = new SavingsAccount(IBAN, userId);
                break;
        }

        bankAcounts.put(IBAN, newAccount);
    }


    private String generateUniqueIBAN() {
        return "UniqueIBAN";
    }
}