package example;

/**
 * Created by pclement on 4/19/17.
 */
public class WithdrawStructured {

    public long withdraw(String accountNumber, long amount) throws Exception {
        account = assertAccountNumber(accountNumber);
        assertAccountIsActive(account);
        if (account.type == "savings" && !accountHasFunds(amount)) {
            throw exception
        }
        if (accountHasFunds(amoutnt)) {
            return account.withdraw(amount);
        }
        savingsAccount = findSavingsAccount(account);
        toBorrow = account.getBalance() - amount;
        savingsAccunt.transfer(account, toBorrow);
        return account.withdraw(amount);
    }
}

