package ExchangeRate;

import java.util.Scanner;

public class ExchangeRate {
    public static void main(String[] args) {
        final double USD = 3.29;
        final double EUR = 3.6;
        final double RUB = 0.034259;
        final double KZT = 0.006792;
        final double JPY = 0.022017;
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите сумму (в BYN):");
        double sum = sc.nextDouble();

        System.out.println("USD: "+USD*sum);
        System.out.println("EUR: "+EUR*sum);
        System.out.println("RUB: "+RUB*sum);
        System.out.println("KZT: "+KZT*sum);
        System.out.println("JPY: "+JPY*sum);
    }
}
