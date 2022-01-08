package models;

public class ExportProducts extends Product {
    private int priceExport;
    private String country;

    public ExportProducts() {
    }

    public ExportProducts(int id, String idProduct, String name, int price, int quantily, String nameProducer, int priceExport, String country) {
        super(id, idProduct, name, price, quantily, nameProducer);
        this.priceExport = priceExport;
        this.country = country;
    }

    public int getPriceExport() {
        return priceExport;
    }

    public void setPriceExport(int priceExport) {
        this.priceExport = priceExport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ExportProducts{" +
                "priceExport=" + priceExport +
                ", country='" + country + super.toString() + '\'' +
                '}';
    }
}
