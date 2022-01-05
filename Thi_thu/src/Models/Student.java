package Models;

public class Student extends Person {
    private String nameClass;
    private String poin;
    public Student() {
    }

    public Student(String id, String name, String birthDay, String gender, String nameClass, String poin) {
        super(id, name, birthDay, gender);
        this.nameClass = nameClass;
        this.poin = poin;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getPoin() {
        return poin;
    }

    public void setPoin(String poin) {
        this.poin = poin;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "nameClass='" + nameClass + '\'' +
                ", poin='" + poin + '\'' + super.toString() +
                '}';
    }
}
