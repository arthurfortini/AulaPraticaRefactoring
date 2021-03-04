import java.util.Enumeration;

public class HtmlStatement extends Statement {
    String stringCustomerName(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    String rentalFigures(Rental each) {
        return each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
    }

    String amountOwed(Customer aCustomer) {
        return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    String amountEarned(Customer aCustomer) {
        return "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }
}