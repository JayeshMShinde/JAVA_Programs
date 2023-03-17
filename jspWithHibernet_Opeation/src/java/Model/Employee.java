package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees_tbl")
public class Employee {
    
    @Id
    private int Employee_id;
    private String Employee_name;
    private String Designation;
    private float Salary;

    public Employee() {
    }

    public Employee(int Employee_id, String Employee_name, String Designation, float Salary) {
        this.Employee_id = Employee_id;
        this.Employee_name = Employee_name;
        this.Designation = Designation;
        this.Salary = Salary;
    }

    public int getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(int Employee_id) {
        this.Employee_id = Employee_id;
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String Employee_name) {
        this.Employee_name = Employee_name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }
}
