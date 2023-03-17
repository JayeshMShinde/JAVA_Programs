package model;


public class Product {
    
    private int product_id;
    private String product_name;
    private float rate;
    private float tax;
    private int stock_quan;

    public Product() {
    }

    public Product(int product_id, String product_name, float rate, float tax, int stock_quan) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.rate = rate;
        this.tax = tax;
        this.stock_quan = stock_quan;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public int getStock_quan() {
        return stock_quan;
    }

    public void setStock_quan(int stock_quan) {
        this.stock_quan = stock_quan;
    }
}
