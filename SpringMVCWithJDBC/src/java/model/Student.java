package model;

public class Student {

    private int rno;
    private String name;
    private float english;
    private float  maths;
    private float science;
    private String gender;
    private int city_id;
    private String city_nm;

    public Student(int rno, String name, float english, float maths, float science, String gender, int city_id, String city_nm) {
        this.rno = rno;
        this.name = name;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.gender = gender;
        this.city_id = city_id;
        this.city_nm = city_nm;
    }

    public String getCity_nm() {
        return city_nm;
    }

    public void setCity_nm(String city_nm) {
        this.city_nm = city_nm;
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
    

    public Student() {
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

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getMaths() {
        return maths;
    }

    public void setMaths(float maths) {
        this.maths = maths;
    }

    public float getScience() {
        return science;
    }

    public void setScience(float science) {
        this.science = science;
    }

    public String getGendenr() {
        return gender;
    }

    public void setGendenr(String gender) {
        this.gender = gender;
    }
    
}
