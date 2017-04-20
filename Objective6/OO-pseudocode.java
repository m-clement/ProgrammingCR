package example;

/**
 * Created by pclement on 4/19/17.
 */
public class WithdrawOO {

    public long withdraw(String accountNumber, long amount) throws Exception {
        Withdrawal withdrawal = WithdrawalFactory.byAccount(accountNumber); // throws exception
        withdrawal.withdraw(amount);
    }
}

public class WithdrawalFactory {
    public static final Withdrawal byAccount(String accountNumber) throws Exception {
        account = database.lookup(accountNumber) -> (Savings / Checking);
        if (account.isNotActive()) {
            throw new Exception("you suck");
        }
        return new WithdrawSavings / WithdrawalChecking ();
    }
}

public abstract class  Withdrawal {
    long withdraw(long amount);
}

public class WithdrawSavings extends Withdrawal{
    long withdraw(long amount) {

    }

}
public  class WithdrawalChecking extends  Withdrawal{
    long withdraw(long amount) {

    }
}
public  class WithdrawalMoneyMarket extends  Withdrawal{
    long withdraw(long amount) {

    }
}

