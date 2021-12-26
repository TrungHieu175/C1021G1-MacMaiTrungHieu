package models.agreement;

public class Contract {
    private String idContract;
    private int codeBooking;
    private double deposit;
    private double total;
    private String idCustomer;

    public Contract(String idContract, int codeBooking, double deposit, double total, String idCustomer) {
        this.idContract = idContract;
        this.codeBooking = codeBooking;
        this.deposit = deposit;
        this.total = total;
        this.idCustomer = idCustomer;
    }

    public Contract() {
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", codeBooking=" + codeBooking +
                ", deposit=" + deposit +
                ", total=" + total +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
