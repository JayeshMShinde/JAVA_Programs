package jdbc_demo2;

import java.util.*;
import java.sql.*;

public class Jdbc_demo2 {

    public void AddStudent_byuser() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Roll No");
            int r = sc.nextInt();
            System.out.println("Enter the Name");
            String n = sc.next();
            System.out.println("Enter the Qualification");
            String q = sc.next();
            System.out.println("Enter the Percentage");
            float p = sc.nextFloat();
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
            Statement st = con.createStatement();
            int cnt = st.executeUpdate("insert into Student_data_code values(" + r + ",'" + n + "','" + q + "'," + p + ")");
            if (cnt > 0) {
                System.out.println("Data Added succesfully");
            } else {
                System.out.println("Error..!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void DisplayStudent() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Student_data_code");
            while (rs.next()) {
                int r = rs.getInt("rno");
                String n = rs.getString("name");
                String q = rs.getString("qual");
                float p = rs.getFloat("per");
                System.out.println(r + " " + n + " " + q + " " + p);
            }
        } catch (Exception e) {
            System.out.println("Exception =>" + e.getMessage());
        }
    }

    public void UpdateStudent_byUser() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Roll No:");
            int r = sc.nextInt();
            System.out.println("Enter the Name");
            String n = sc.next();
            System.out.println("Enter the Qualification");
            String q = sc.next();
            System.out.println("Enter the Percentage");
            float p = sc.nextFloat();
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
            Statement st = con.createStatement();
            int cnt = st.executeUpdate("Update Student_data_code set name='" + n + "',qual='" + q + "',per=" + p + " where rno =" + r);
            if (cnt > 0) {
                System.out.println("Data Updated succesfully");
            } else {
                System.out.println("Error..!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void DeleteStudent() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Roll No:");
            int r = sc.nextInt();

            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
            Statement st = con.createStatement();
            int cnt = st.executeUpdate("Delete from Student_data_code where rno =" + r);
            if (cnt > 0) {
                System.out.println("Data Deleted succesfully");
            } else {
                System.out.println("Error..!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Jdbc_demo2 jd2 = new Jdbc_demo2();
        int i = 1;
        while (i != 0) {
            System.out.println("Enter the  Choice :");
            System.out.println("1.Add Student\n2.Update Student\n3.Delete Student\n4.Display Student");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    jd2.AddStudent_byuser();
                    break;
                }
                case 2: {
                    jd2.UpdateStudent_byUser();
                    break;
                }
                case 3: {
                    jd2.DeleteStudent();
                    break;
                }
                case 4: {
                    jd2.DisplayStudent();
                    break;
                }
                default: {
                    System.out.println("Invalid Choice");
                    break;
                }
            }
            System.out.println("Do you Want to continue:Yes(1)/No(0)");
            i = sc.nextInt();

        }
    }

}
