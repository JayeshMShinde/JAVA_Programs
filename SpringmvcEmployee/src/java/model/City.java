package model;

public class City {
    private int city_id;
    private String city_nm;

    public City() {
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

    public City(int city_id, String city_nm) {
        this.city_id = city_id;
        this.city_nm = city_nm;
    }
}
