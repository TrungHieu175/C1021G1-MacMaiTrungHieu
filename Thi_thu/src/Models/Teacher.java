package Models;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }

    public Teacher(String id, String name, String birthDay, String gender, String specialize) {
        super(id, name, birthDay, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                "specialize='" + specialize + '\'' + super.toString() +
                '}';
    }
}
