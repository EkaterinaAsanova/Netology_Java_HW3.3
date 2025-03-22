public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж при сроке кредита 1 год составил: "
                + service.calculate(1_000_000, 9.99, 12) + " рублей");

        System.out.println("Ежемесячный платеж при сроке кредита 2 года составил: "
                + service.calculate(1_000_000, 9.99, 24) + " рублей");

        System.out.println("Ежемесячный платеж при сроке кредита 3 года составил: "
                + service.calculate(1_000_000, 9.99, 36) + " рублей");
    }
}