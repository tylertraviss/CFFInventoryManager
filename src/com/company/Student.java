package com.company;

public class Student {

    private int shoeSize;
    private String shirtSize;
    private String pantSize;
    private String gender;
    private String schoolFile;

    public Student(String shirtSize, String pantSize, String gender, int shoeSize, String schoolFile) {
        this.shirtSize = shirtSize;
        this.pantSize = pantSize;
        this.gender = gender;
        this.shoeSize = shoeSize;
        this.schoolFile = schoolFile;
    }

    public String getShirtSize() {
        return shirtSize;
    }

    public void setShirtSize(String shirtSize) {
        this.shirtSize = shirtSize;
    }

    public String getPantSize() {
        return pantSize;
    }

    public void setPantSize(String pantSize) {
        this.pantSize = pantSize;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchoolFile() {
        return schoolFile;
    }

    public void setSchoolFile(String schoolFile) {
        this.schoolFile = schoolFile;
    }

}
