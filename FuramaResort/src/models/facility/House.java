package models.facility;

import models.facility.Facility;

public class House extends Facility {
    private String classRoom;
    private int stage;

    public House(String nameSevice, double areaUse, double price, int person, int daily, String classRoom, int stage) {
        super(nameSevice, areaUse, price, person, daily);
        this.classRoom = classRoom;
        this.stage = stage;
    }

    public House() {
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return "House{" +
                "classRoom='" + classRoom + '\'' +
                ", stage=" + stage + '\'' + super.toString() +
                '}';
    }
}
