package models.facility;

import models.facility.Facility;

public class Room extends Facility {
    private String freeSevice;

    public Room(String nameSevice, double areaUse, double price, int person, int daily, String freeSevice) {
        super(nameSevice, areaUse, price, person, daily);
        this.freeSevice = freeSevice;
    }

    public Room() {
    }

    public String getFreeSevice() {
        return freeSevice;
    }

    public void setFreeSevice(String freeSevice) {
        this.freeSevice = freeSevice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeSevice='" + freeSevice + '\'' + super.toString() +
                '}';
    }
}
