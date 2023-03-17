
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

    @Id
//    @Column(name="employee_id")
    private int employee_id;
    private String employee_name;
    private String designation;
    private float salary;

    public Employee() {
    }

    public Employee(int employee_id, String employee_name, String designation, float salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
}
