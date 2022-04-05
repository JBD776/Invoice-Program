import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Shipment {

    public Shipment(String ups, ShipmentStatus inProgress, int trackingId, Date parse) {
    }

    enum ShipmentStatus {InProgress, Shipped, Delivered}


    String carrier;
    ShipmentStatus shipmentStatus;
    int trackingId;
    Date dateShipped;
    Date dateDelivered;

    @Override
    public String toString() {
        Random ran = new Random(999999999);

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        return (
                "Carrier: '" + carrier + '\n' +
                "Shipment Status: " + shipmentStatus + '\n'+
                "Tracking ID: " +ran.nextInt(trackingId) + '\n' +
                "DateShipped: " + sdf.format(dateShipped ) + '\n' +
                "Date Delivered:" + sdf.format(dateDelivered)) ;
    }

    public Shipment( String carrier, ShipmentStatus shipmentStatus, int trackingId, Date dateShipped, Date dateDelivered) {

        this.carrier = carrier;
        this.shipmentStatus = shipmentStatus;
        this.trackingId = trackingId;
        this.dateShipped = dateShipped;
        this.dateDelivered = dateDelivered;
    }

    public static void main(String[] arg) throws ParseException {
        Random ran = new Random();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        ArrayList<Shipment> sS = new ArrayList<>();

        sS.add(new Shipment("UPS", ShipmentStatus.InProgress,ran.nextInt(999999999),
                sdf.parse("12-10-22"), sdf.parse("12-22-22")));

        for (Shipment i : sS){
            System.out.println(i);
        }


    }


}
