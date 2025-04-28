package accounts;

public abstract class Account {
    public long balance;

    public long getBalance() {
        System.out.println(balance);
        return balance;
    }

    public boolean add(long amount) {
        balance += amount;
        return true;
    }
    public boolean pay(long amount) {
        if(balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
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
