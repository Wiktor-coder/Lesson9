import accounts.Account;
import accounts.CreditAccount;
import accounts.SimpleAccount;
import task2.Logger;
import task2.SimpleLogger;
import task2.SmartLogger;

public class Main {
    public static void main(String[] args) {
//        Проверка первого задания
        Account account = new CreditAccount();
        Account account1 = new SimpleAccount();
//        Перевод
        account.transfer(account1, 100_000);
        account1.transfer(account, 50_000);
//        Пополнение
        account.add(25_054);
        account1.add(15_845);
//        Покупка
        account.pay(800);
        account1.pay(545);

//        Вывод баланса
        account1.getBalance();
        account.getBalance();


//        Проверка второго задания
        Logger smg = new SimpleLogger();
        smg.log("Parabelom");
        Logger smg2 = new SmartLogger();
        smg2.log("I say an error to check");
        smg2.log("an empty message");
    }
}
