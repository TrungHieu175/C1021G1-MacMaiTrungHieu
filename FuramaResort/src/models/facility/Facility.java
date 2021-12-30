package models.facility;

public abstract class Facility {
    private String nameSevice;
    private double areaUse;
    private double price;
    private int person;
    private int daily;
    private int serviceId;
    public Facility() {
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameSevice='" + nameSevice + '\'' +
                ", areaUse=" + areaUse +
                ", price=" + price +
                ", person=" + person +
                ", daily=" + daily +
                ", serviceId=" + serviceId +
                '}';
    }

    public Facility(String nameSevice, double areaUse, double price, int person, int daily, int serviceId) {
        this.nameSevice = nameSevice;
        this.areaUse = areaUse;
        this.price = price;
        this.person = person;
        this.daily = daily;
        this.serviceId = serviceId;
    }

    public String getNameSevice() {
        return nameSevice;
    }

    public void setNameSevice(String nameSevice) {
        this.nameSevice = nameSevice;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getDaily() {
        return daily;
    }

    public void setDaily(int daily) {
        this.daily = daily;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }
}
