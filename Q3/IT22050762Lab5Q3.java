import java.util.Scanner;

public class IT22050762Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter start day: ");
        int startDay = input.nextInt();

        System.out.print("Enter end day: ");
        int endDay = input.nextInt();

        if (startDay < 1 || startDay > 31 ||
            endDay < 1 || endDay > 31) {

            System.out.println("Invalid date!");
            input.close();
            return;
        }

        if (startDay >= endDay) {
            System.out.println("Start day must be less than end day!");
            input.close();
            return;
        }

        int days = endDay - startDay;

        double totalCharge = days * ROOM_CHARGE;
        double discount = 0;

        if (days >= 5) {
            discount = totalCharge * DISCOUNT_20;
        }
        else if (days >= 3) {
            discount = totalCharge * DISCOUNT_10;
        }

        double finalAmount = totalCharge - discount;

        System.out.println("Number of days: " + days);
        System.out.println("Total room charge: Rs. " + totalCharge);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final amount: Rs. " + finalAmount);

        input.close();
    }
}
