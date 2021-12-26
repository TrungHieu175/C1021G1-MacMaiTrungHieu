package models.agreement;

public class Booking {
    private int codeBooking;
    private String dayStar;
    private String dayEnd;
    private String idCustomer;
    private String nameService;
    private String classService;

    public Booking(int codeBooking, String dayStar, String dayEnd, String idCustomer, String nameService, String classService) {
        this.codeBooking = codeBooking;
        this.dayStar = dayStar;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.classService = classService;
    }
    public Booking() {
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDayStar() {
        return dayStar;
    }

    public void setDayStar(String dayStar) {
        this.dayStar = dayStar;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getClassService() {
        return classService;
    }

    public void setClassService(String classService) {
        this.classService = classService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking=" + codeBooking +
                ", dayStar='" + dayStar + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", classService='" + classService + '\'' +
                '}';
    }
}
