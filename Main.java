import accounts.Account;
import accounts.CreditAccount;
import accounts.SimpleAccount;

public class Main {
    public static void main(String[] args) {

        Account account = new CreditAccount();
        Account account1 = new SimpleAccount();
        account.transfer(account1, 100_000);

//        account1.add(100_000);

        account1.getBalance();
        account.getBalance();

    }
}
