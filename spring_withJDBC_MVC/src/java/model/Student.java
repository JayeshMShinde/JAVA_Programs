package model;

public class Student {
    private int rno;
    private String name;
    private String gender;
    private int city_id;
    private String city_nm;
    private float english;
    private float science;
    private float maths;

    public Student() {
    }

    public Student(int rno, String name, String gender, int city_id, String city_nm, float english, float science, float maths) {
        this.rno = rno;
        this.name = name;
        this.gender = gender;
        this.city_id = city_id;
        this.city_nm = city_nm;
        this.english = english;
        this.science = science;
        this.maths = maths;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_nm() {
        return city_nm;
    }

    public void setCity_nm(String city_nm) {
        this.city_nm = city_nm;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getScience() {
        return science;
    }

    public void setScience(float science) {
        this.science = science;
    }

    public float getMaths() {
        return maths;
    }

    public void setMaths(float maths) {
        this.maths = maths;
    }
}
