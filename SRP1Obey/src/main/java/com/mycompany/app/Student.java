package com.mycompany.app;

/**
 * Created by student on 2016/04/01.
 */
public class Student {
    private int studNum;
    private String name;
    private String surname;
    private String address;
    private double percentage, mark1,mark2;

    public Student(double mark1, double mark2) {
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getStudNum() {
        return studNum;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public void setStudNum(int studNum) {
        this.studNum = studNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

}
