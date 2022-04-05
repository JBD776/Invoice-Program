import java.util.ArrayList;

public class Product {

    String productId;
    String productDescription;
    String soldBy;
    double price;




    public Product(String productId, String productDescription, String soldBy, double price) {
        this.productId = productId;
        this.productDescription = productDescription;
        this.soldBy = soldBy;
        this.price = price;
        double grandTotal = (price*.06)+price;


    }

    @Override
    public String toString() {
        double grandTotal = (price*.06)+price;
        return (
                "Product ID: " + productId + '\n' +
                "Item Description: " + productDescription + '\n' +
                "Sold By: " + soldBy + '\n' +
                "Price: $" + price + "\n" +
                "Grand Total: " + String.format("$%.2f", grandTotal)) + "\n\n\n";}




    public static void main(String[] args){
        ArrayList<Product> productArrayList = new ArrayList<>();

        productArrayList.add(new Product("30lb Kettle Bell", "Exercise Equipment", "Amazon Services", 29.99) );






        System.out.println(productArrayList);
        System.out.println();

    }


}
