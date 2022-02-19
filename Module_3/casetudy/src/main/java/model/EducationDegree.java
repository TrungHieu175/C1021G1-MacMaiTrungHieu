package model;

public class EducationDegree {
    private int educationDegree_id;
    private String educationDegree_name;

    public EducationDegree() {
    }

    public EducationDegree(int educationDegree_id, String educationDegree_name) {
        this.educationDegree_id = educationDegree_id;
        this.educationDegree_name = educationDegree_name;
    }

    public int getEducationDegree_id() {
        return educationDegree_id;
    }

    public void setEducationDegree_id(int educationDegree_id) {
        this.educationDegree_id = educationDegree_id;
    }

    public String getEducationDegree_name() {
        return educationDegree_name;
    }

    public void setEducationDegree_name(String educationDegree_name) {
        this.educationDegree_name = educationDegree_name;
    }
}
