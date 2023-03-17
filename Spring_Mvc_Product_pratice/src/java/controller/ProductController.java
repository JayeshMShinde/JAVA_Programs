package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import model.Product;
import java.util.*;
import dao.ProductDao;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ProductController {
    
    @Autowired
    ProductDao pdao;
    
    @RequestMapping("Product")
    public ModelAndView ProductView(){
        ModelAndView m =  new ModelAndView("Product/index");
        List<Product>lst = pdao.GetProducts();
        m.addObject("Product", lst);
        return m;
    }
    
    @RequestMapping("add")
    public ModelAndView AddProduct(){
        Product p = new Product();
        ModelAndView v = new ModelAndView("Product/AddProduct","command",p);
        return v;
    }
    
    @RequestMapping(value="save" ,method = RequestMethod.POST)
    public RedirectView Save(@ModelAttribute("p")Product p){
        pdao.AddProduct(p);
        RedirectView rv = new RedirectView("Product");
        return rv;
    }    
}
