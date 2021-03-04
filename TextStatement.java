import java.util.Enumeration;

public class TextStatement extends Statement {
    String stringCustomerName(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    String rentalFigures(Rental each) {
        return "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    String amountOwed(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    String amountEarned(Customer aCustomer) {
        return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
}