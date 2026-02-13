package week03.invoice;
public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;

        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    public String getPartNumber() {
        return partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
    public static void main(String[] args) {

        Invoice inv = new Invoice("AAA", "Asus", 5, 10.5);
        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price per item: " + inv.getPricePerItem());
        System.out.println("Total Amount: " + inv.getInvoiceAmount());
    }
}
