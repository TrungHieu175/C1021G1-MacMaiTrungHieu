package models.person;

public class Customer extends Person {
    private String customerType;
    private String location;

    public Customer(String id, String fullName, String birthDay, String gender, String idCard, String phoneNumber, String email, String customerType, String location) {
        super(id, fullName, birthDay, gender, idCard, phoneNumber, email);
        this.customerType = customerType;
        this.location = location;
    }

    public Customer() {
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", location='" + location + '\'' + '\'' + super.toString() +
                '}';
    }
}
