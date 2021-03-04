import java.util.Enumeration;

public class TextStatement extends Statement {
    public String stringCustomerName(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String rentalFigures(Rental each) {
        return "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    public String amountOwed(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    public String amountEarned(Customer aCustomer) {
        return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
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