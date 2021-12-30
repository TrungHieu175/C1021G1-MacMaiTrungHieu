package models.facility;

public class Villa extends Facility {
    private String classRoom;
    private double areaPool;
    private int stage;

    public Villa(String nameSevice, double areaUse, double price, int person, int daily, int serviceId, String classRoom, double areaPool, int stage) {
        super(nameSevice, areaUse, price, person, daily, serviceId);
        this.classRoom = classRoom;
        this.areaPool = areaPool;
        this.stage = stage;
    }

    public Villa() {
    }


    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "classRoom='" + classRoom + '\'' +
                ", areaPool=" + areaPool +
                ", stage=" + stage + '\'' + super.toString() +
                '}';
    }
}
