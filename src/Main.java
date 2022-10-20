public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int amount = 2000;
        int balans2 = balans + amount;
        if (amount > 1000) {
            int bonus = amount / 100;
            balans2 = balans + amount + bonus;
            System.out.println("Ваши бонусы: " + bonus);
        } else {
            int bonus = 0;
            System.out.println("Ваши бонусы: " + bonus);
        }
        System.out.println("Ваш баланс на счете: " + balans2);
    }
}