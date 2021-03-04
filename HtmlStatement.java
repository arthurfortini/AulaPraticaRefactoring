import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String stringCustomerName(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    public String rentalFigures(Rental each) {
        return each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
    }

    public String amountOwed(Customer aCustomer) {
        return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    public String amountEarned(Customer aCustomer) {
        return "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = stringCustomerName(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += rentalFigures(each);
        }
        //add footer lines
        result += amountOwed(aCustomer);
        result += amountEarned(aCustomer);
        return result;
    }
}