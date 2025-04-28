package accounts;

public class SimpleAccount extends Account {

    // вывод на экран количества средств на счете
    @Override
    public long getBalance() {
        System.out.println(balance);
        return balance;
    }

    // пополнение счета
    @Override
    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
        }
        return true;
    }

    // покупка
    @Override
    public boolean pay(long amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // перевод
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
