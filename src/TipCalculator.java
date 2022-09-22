import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int people = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int percentage = scan.nextInt();
        double price = 0;
        double cost = 0;
        System.out.print("Enter a cost in dollars and cents: ");
        price = scan.nextDouble();
        cost += price; 
        while (price != 0) {
            System.out.print("Enter a cost in dollars and cents: ");
            price = scan.nextDouble();
            cost += price;

        }

    }
}
