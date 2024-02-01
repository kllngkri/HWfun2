import java.util.ArrayList;
import java.util.NoSuchElementException;

public class AccountRegistry {
    private ArrayList<Account> accounts = new ArrayList<Account>();

    private int countActiveAccounts() {
        return countAccountsByStatus(Account.Status.ACTIVE);
    }

    private int countAccountsByStatus(Account.Status byStatus) {
        int count = 0;
        for (Account account: accounts)
            if (account.getStatus() == byStatus)
                count++;
        return count;
    }

    public void addAccount(Account acc) {

        if (acc == null)
            throw new NullPointerException("Account is null.");
        else
            accounts.add(acc);
    }

    public Account getAccount(String accountNumber) {
        for (Account account: accounts)
            if (account.getAccountNumber().equals(accountNumber))
                return account;
        throw new NoSuchElementException("No such account number.");
    }

    public Account[] listAccounts() {
       return listAccounts(Account.Status.ACTIVE);
    }

    public Account[] listAccounts(Account.Status status){
      Account[] results = new Account[countAccountsByStatus(status)];

        int idx = 0;
        for (Account account: accounts)
            if (account.getStatus() == status )
                results[idx++] = account;

        return results;
    }
    
}
