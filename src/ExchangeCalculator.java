public class ExchangeCalculator {

    public void calculate(){
        double exchangeRate = 90.15;
        double amountToExchange = 1000.00;
        if (exchangeRate > 70.00) {
            if (exchangeRate * amountToExchange > 10000) {
                System.out.println("much");
            } else {
                System.out.println("little");
            }
        }
    }
}
