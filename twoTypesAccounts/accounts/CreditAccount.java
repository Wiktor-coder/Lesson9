package accounts;

public class CreditAccount extends Account {
    private long creditLimit;

    public CreditAccount() {
        this.creditLimit = 250_000;
    }

    @Override
    public long getBalance() {
        System.out.println(balance);
        return balance;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount < -creditLimit) {
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)) {
                return true;
            } else {
                add(amount);
            }
        }
        return false;
    }


}
