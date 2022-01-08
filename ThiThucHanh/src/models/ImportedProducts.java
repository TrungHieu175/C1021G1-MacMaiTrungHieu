package models;

public class ImportedProducts extends Product {
    private double tax;
    private String address;

    public ImportedProducts() {
    }

    public ImportedProducts(int id, String idProduct, String name, int price, int quantily, String nameProducer, double tax, String address) {
        super(id, idProduct, name, price, quantily, nameProducer);
        this.tax = tax;
        this.address = address;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ImportedProducts{" +
                "tax=" + tax +
                ", address='" + address + super.toString() + '\'' +
                '}';
    }
}
