public class CreditPaymentService {

    public int calculate(double loanAmount, double interestRate, int Year) {
        double rate = interestRate / 100 / 12;
        double result = loanAmount * ((rate * (Math.pow((1 + rate), Year))) /
                (Math.pow((1 + rate), Year) - 1));
        int payment = (int) result;
        return payment;
    }
}