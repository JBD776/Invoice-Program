import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
    Random ran = new Random();


    enum ShipmentSpeed {OneDay, TwoDay, Mail}

    enum ShipmentStatus {InProgress, Shipped, Delivered}


    ArrayList<Product> productArrayList = new ArrayList<>();

    int qty;
    Product product;

    public Order(int qty, Product product) {
        this.qty = qty;
        this.product = product;
    }

    public Order() {

    }

    @Override
    public String toString() {
        return "Order: " +
                "Quantity: " + qty +
                "Product: " + product;
    }

    public void createProduct(ArrayList<Product> productArrayList){

    productArrayList.add(new Product("Animal Farm: George Orwell", "Book", "Barns & Nobel", 8.99));
    productArrayList.add(new Product("30lb Kettle Bell", "Exercise Equipment", "Amazon Services", 29.99));
    productArrayList.add(new Product("PlayStation 5", "Electronics", "Amazon Services", 499.99));
    productArrayList.add(new Product("Compressed-Gas Cleaning Duster", "Cleaning Supplies", "Amazon Services", 9.99));

}

public void createOrder() throws ParseException {
    createProduct(productArrayList);

    Customer customer = new Customer("John Smith", "267 Paramount Dr", "(888)-888-8888",
            "Warchester, NY 8976", "US");

    Customer customer1 = new Customer("Thomas Stone", "1515 Chestnut St", "(888)-555-1499",
            "Philadelphia, PA 19383", "US");

    Customer customer2 = new Customer("Michael Jordan", "48 Ericson St", "(888)-999-4871",
            "Atlanta, GA 19383", "US");

    Customer customer3 = new Customer("Christopher Brown", "986 Daven Dr", "(888)-321-8761",
            "San Diego, CA 90210", "US");

    ArrayList<Order> OrderItem = new ArrayList<>();

    OrderItem.add(new Order(1, productArrayList.get(2)));


    System.out.println(productArrayList);

    Order order = new Order();
    Shipment shipment = new Shipment("UPS", Shipment.ShipmentStatus.InProgress, ran.nextInt(999999999),
            sdf.parse("12-10-22"));





}
    public static void main(String []arg) throws ParseException {
        Order o = new Order();
        ArrayList<Product> productArrayList = new ArrayList<>();


        //o.createProduct(productArrayList);

        o.createOrder();


    }
}
