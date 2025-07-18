package gr.aueb.cf.bankapp.dao;

import gr.aueb.cf.bankapp.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {
    private final List<Account> accounts = new ArrayList<>(); /// o δείκτης στο stack είναι immutable.

    @Override
    public void saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);

        if (index != -1) {
            accounts.set(index, account);
            return;
        }
        accounts.add(account);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(a -> a.getIban().equals(iban));

    }

    @Override
    public Optional<Account> getByIban(String iban) {
        return accounts.stream()
                .filter(a ->a.getIban().equals(iban))  // επιστρέφει φιλτραρισμένο stream.
                .findFirst();                                 // επιστρέφει optional.

    }

    @Override
    public List<Account> getAccounts() {
       // return Collections.unmodifiableList(accounts); immutable.
        return new ArrayList<>(accounts);
    }
}
