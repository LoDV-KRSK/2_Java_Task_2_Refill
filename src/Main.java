public class Main {
    public static void main(String[] args) {

// Входные данные
        int startingBalance = 500;  // начальный баланс
        int accountsRefill = 1300;  // сумма пополнения
        int threshold = 1000;   // минимальный порог для начисления бонуса
        int bonus;

// расчет
        if (accountsRefill >= threshold) {
            bonus = accountsRefill / 100;

        } else {
            bonus = 0;
        }

        int finalBalance = startingBalance + accountsRefill;

        System.out.println("Ваш текущий баланс: " + finalBalance);
        System.out.println("Ваш бонус за пополнение: " + bonus);
    }
}
