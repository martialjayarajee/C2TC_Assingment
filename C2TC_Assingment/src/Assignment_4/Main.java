package Assignment_4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading booking details in CSV format
        String bookingInput = sc.nextLine();
        String[] parts = bookingInput.split(",");
        String stageEvent = parts[0];
        String customer = parts[1];
        int noOfSeats = Integer.parseInt(parts[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        int paymentChoice = Integer.parseInt(sc.nextLine());

        switch (paymentChoice) {
            case 1:
                double cashAmount = Double.parseDouble(sc.nextLine());
                booking.printReceipt();
                booking.makePayment(cashAmount);
                break;

            case 2:
                double walletAmount = Double.parseDouble(sc.nextLine());
                String walletNumber = sc.nextLine();
                booking.printReceipt();
                booking.makePayment(walletAmount, walletNumber);
                break;

            case 3:
                String holderName = sc.nextLine();
                double cardAmount = Double.parseDouble(sc.nextLine());
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.printReceipt();
                booking.makePayment(holderName, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}