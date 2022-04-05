import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;



public class Main {


    enum Condition {New, Used, Reconditioned}

    enum ShipmentSpeed {OneDay, TwoDay, Mail}

    enum ShipmentStatus {InProgress, Shipped, Delivered}

    enum PaymentType {CreditCard, BankTransfer, Visa, MasterCard, Discover}


    public static void main(String[] args) throws ParseException {

        Random ran = new Random();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

        Main aM = new Main();


        Order order = new Order();


        ArrayList<Customer> customer = new ArrayList<>();
        ArrayList<Product> productArrayList = new ArrayList<>();
        ArrayList<Shipment> sS = new ArrayList<>();
        ArrayList<Order> OrderItem = new ArrayList<>();


        System.out.println("*****************************");
        System.out.println("Order Information");
        System.out.println("*****************************");
        customer.add((new Customer("John Smith", "267 Paramount Dr", "(888)-888-8888",
                "Warchester, NY 8976", "US")));
        productArrayList.add(new Product("Animal Farm", "Book", "Barns & Nobel", 8.99));
        sS.add(new Shipment("UPS", Shipment.ShipmentStatus.InProgress, ran.nextInt(999999999),
                sdf.parse("12-10-22"), sdf.parse("12-22-22")));
        //CreditCard cc = new CreditCard(100.00, "Steven Rodgers",sdf.parse(String.valueOf(12-21-2025)),"8879-9900-0789-6384");


        System.out.println(customer.toString().replace("[", "").replace("]", ""));
        System.out.println(productArrayList.toString().replace("[", "").replace("]", ""));
        System.out.println(sS.toString().replace("[", "").replace("]", ""));
        System.out.println("Payment type" + PaymentType.MasterCard);
        System.out.println("Delivery: " + ShipmentSpeed.OneDay);
        System.out.println("\n*****************************");


//next order
        ArrayList<Customer> customer1 = new ArrayList<>();
        ArrayList<Product> productArrayList1 = new ArrayList<>();
        ArrayList<Shipment> sS1 = new ArrayList<>();

        System.out.println("\n*****************************");
        System.out.println("Order Information");
        System.out.println("*****************************");
        customer1.add((new Customer("Thomas Stone", "1515 Chestnut St", "(888)-555-1499",
                "Philadelphia, PA 19383", "US")));
        productArrayList1.add(new Product("30lb Kettle Bell", "Exercise Equipment", "Amazon Services", 29.99));
        sS1.add(new Shipment("FedEx", Shipment.ShipmentStatus.Delivered, ran.nextInt(999999999),
                sdf.parse("01-10-22"), sdf.parse("01-13-22")));


        System.out.println(customer1.toString().replace("[", "").replace("]", ""));
        System.out.println(productArrayList1.toString().replace("[", "").replace("]", ""));
        System.out.println(sS1.toString().replace("[", "").replace("]", ""));
        System.out.println("Payment type: " + PaymentType.BankTransfer);
        System.out.println("Delivery: " + ShipmentSpeed.Mail);
        System.out.println("\n*****************************\n");

        //next Order


        ArrayList<Customer> customer2 = new ArrayList<>();
        ArrayList<Product> productArrayList2 = new ArrayList<>();
        ArrayList<Shipment> sS2 = new ArrayList<>();

        System.out.println("\n*****************************");
        System.out.println("Order Information");
        System.out.println("*****************************");
        customer1.add((new Customer("Sandra Adams", "3 Walnut St", "(888)-555-3232",
                "Philadelphia, PA 19383", "US")));
        productArrayList1.add(new Product("Brave Heart DVD", "Entertainment", "Amazon Services", 9.99));
        sS1.add(new Shipment("FedEx", Shipment.ShipmentStatus.InProgress, ran.nextInt(999999999),
                sdf.parse("01-10-22"), sdf.parse("01-13-22")));




        System.out.println(customer2.toString().replace("[", "").replace("]", ""));
        System.out.println(productArrayList2.toString().replace("[", "").replace("]", ""));
        System.out.println(sS2.toString().replace("[", "").replace("]", ""));
        System.out.println("Payment type: " + PaymentType.Discover);
        System.out.println("Delivery: " + ShipmentSpeed.Mail);
        System.out.println("\n*****************************\n");






    }

}










