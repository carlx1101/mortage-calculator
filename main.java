import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte months_in_year = 12;
        final byte percentage = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Principal Values: ");
        int principal = scanner.nextInt();

        System.out.println("Enter Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percentage / months_in_year;

        System.out.println("Enter Period Value (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * months_in_year;

        double mortage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)/(Math.pow(1 + monthlyInterest, numberOfPayments)-1));

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Montage: " + mortageFormatted);




    }
}
