package springframework_demo;

import Model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFramework_demo {

    public static void main(String[] args) {
        
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
        Student s = (Student)context.getBean("st");
        System.out.println("Roll no:"+s.getRno());
        System.out.println("Name:"+s.getName());
    }
    
}
