import java.util.ArrayList;

public class Customer {

    String customerName;
    String streetAdress;
    String contact;
    String cityStateZip;
    String country;


    public Customer(String customerName, String streetAdress, String contact, String cityStateZip, String country) {
        this.customerName = customerName;
        this.streetAdress = streetAdress;
        this.contact = contact;
        this.cityStateZip = cityStateZip;
        this.country = country;
    }

    @Override
    public String toString() {
        return (
                "Customer Name: " + customerName + '\n' +
                "Street Address: " + streetAdress + '\n' +
                "Contact: " + contact + '\n' +
                "City/State/Zip: " + cityStateZip + '\n' +
                "Country: " + country + '\n');

    }
    public static void main(String[] arg){
        ArrayList<Customer> customer = new ArrayList<>();

        customer.add(new Customer("John Smith", "267 Paramount Dr", "(888)-888-8888",
                "Warchester, NY 8976", "US"));

        for (Customer i : customer) {
            System.out.println(i);
        }
    }
}
