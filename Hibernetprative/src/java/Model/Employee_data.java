/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_data")
public class Employee_data {
    @Id
    private int Emp_Id;
    private String Emp_name;
    private String Designation;
    private float salary;

    public Employee_data() {
    }

    public Employee_data(int Emp_Id, String Emp_name, String Designation, float salary) {
        this.Emp_Id = Emp_Id;
        this.Emp_name = Emp_name;
        this.Designation = Designation;
        this.salary = salary;
    }

    public int getEmp_Id() {
        return Emp_Id;
    }

    public void setEmp_Id(int Emp_Id) {
        this.Emp_Id = Emp_Id;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String Emp_name) {
        this.Emp_name = Emp_name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
