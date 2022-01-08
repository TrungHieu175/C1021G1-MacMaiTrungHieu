package models;

public abstract class Product {
    private int id;
    private String idProduct;
    private String name;
    private int price;
    private int quantily;
    private String nameProducer;

    public Product() {
    }

    public Product(int id, String idProduct, String name, int price, int quantily, String nameProducer) {
        this.id = id;
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.quantily = quantily;
        this.nameProducer = nameProducer;
    }

    public int getId() {
        return id;
    }

    public void setId(int
                              id) {
        this.id = id;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public String getNameProducer() {
        return nameProducer;
    }

    public void setNameProducer(String nameProducer) {
        this.nameProducer = nameProducer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", idProduct='" + idProduct + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantily=" + quantily +
                ", nameProducer='" + nameProducer + '\'' +
                '}';
    }
}
