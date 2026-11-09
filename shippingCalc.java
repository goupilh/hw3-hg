
import java.util.Scanner;

/*
 * ShippingCalculator.java
 * CIS 1130 Homework 3, Program 2 STARTER CODE
 *
 * This program is SUPPOSED to:
 *   - Ask for the order subtotal, package weight, and shipping zone.
 *   - Keep asking for the zone until it is 1, 2, or 3.
 *   - Charge a base rate by zone plus $0.75 per pound.
 *   - Give FREE shipping when the subtotal is $50.00 or more.
 *   - Print the shipping cost and order total.
 *
 * It contains 5 bugs that have been fixed below.
 */

public class ShippingCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Order subtotal: $");
        double subtotal = input.nextDouble();

        System.out.print("Package weight (lbs): ");
        double weight = input.nextDouble();

        System.out.print("Shipping zone (1, 2, or 3): ");
        int zone = input.nextInt();

        while (zone < 1 || zone > 3) {
            System.out.println("Zone must be 1, 2, or 3.");
            System.out.print("Shipping zone (1, 2, or 3): ");
            zone = input.nextInt(); //FIX 1: Read the new zone
        }

        double shipping = calculateShipping(weight, zone);
        shipping = applyFreeShipping(subtotal, shipping);

        System.out.printf("Shipping: $%.2f%n", shipping);
        System.out.printf("Total:    $%.2f%n", subtotal + shipping);
    }

    // Returns the base rate for a zone.
    public static double getBaseRate(int zone) {
        double base;
        switch (zone) {
            case 1:
                base = 5.00;
                break; //FIX 2: Added break
            case 2:
                base = 7.50;
                break;
            default:
                base = 10.00;
        }
        return base;
    }

    // Returns the base rate plus the per-pound charge.
    public static double calculateShipping(double weight, int zone) {
        double perPound = 3.0 / 4.0; //FIX 3: Changed to decimal division
        return getBaseRate(zone) + perPound * weight; //FIX 4: Added semicolon
    }

    // Returns 0 if the order qualifies for free shipping.
    // original shipping cost.
    public static double applyFreeShipping(double subtotal, double shipping) {
        if (subtotal >= 50.00) {// FIX 5: Changed > to >=
            return 0.00;
        }
        return shipping;
    }
}
