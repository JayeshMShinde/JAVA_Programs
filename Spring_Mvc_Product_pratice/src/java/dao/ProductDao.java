package dao;

import java.util.*;
import model.Product;

public class ProductDao {
    
    public static List<Product>lstprod = new ArrayList<>();
    public int nextid(){
        return lstprod.size()+1;
    }
    public int AddProduct(Product p){
        p.setProduct_id(nextid());    
        lstprod.add(p);
        return lstprod.size();
    }
    public List<Product>GetProducts(){
        return lstprod;
    }
}
