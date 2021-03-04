import java.util.Enumeration;

abstract class Statement {
    abstract String stringCustomerName(Customer aCustomer);
    abstract String rentalFigures(Rental each);
    abstract String amountOwed(Customer aCustomer);
    abstract String amountEarned(Customer aCustomer);


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