package com.mycompany.app;

/**
 * Created by student on 2016/04/01.
 */
public class Student {
    private int studNum;
    private String name;
    private String surname;
    private String address;
    private  double percent,mark1,mark2;

    public double ovarallPercent(){
        percent = (mark1+mark2)/100;
        return percent;
    }

    public boolean getPassResult(){
        if(percent > 0.5)
            return true;
        else
            return false;
    }

    public Student(double mark1, double mark2) {
        this.mark1 = mark1;
        this.mark2 = mark2;
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

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
