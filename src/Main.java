public class Main {
    public static void main(String[] args) {
        int account = 500;
        int bill = 2300;
        int bonus;

        if (bill > 1000) {
            bonus = bill / 100;
        } else {
            bonus = 0;
        }

        System.out.println(account + bill + bonus);
        System.out.println(bonus);


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}