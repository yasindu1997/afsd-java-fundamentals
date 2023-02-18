package database;

import java.sql.*;
import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        //insert, delete, update ---> executeUpdate()
        //select ---> executeQuery()

        //saveStudent();
        loadData();
    }
    
    public static void saveStudent(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student'S ID : ");
        String sid = scan.next();

        System.out.print("Enter Student'S Name : ");
        String name = scan.next();

        System.out.print("Enter Student'S Address : ");
        String address = scan.next();

        System.out.print("Enter Student'S Tel.No : ");
        int telNo = scan.nextInt();

        System.out.print("Enter Student'S Mark : ");
        double mark = scan.nextDouble();

        try {
            //mysql Driver ram ekata load karanawa
            Class.forName("com.mysql.cj.jdbc.Driver");

            //mysql server eke adala database ekath ekka connection ekk hadagnnawa
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_afsd", "root", "yasindu@ijse");

            //dynamic data set kirima
            PreparedStatement stm = connection.prepareStatement("insert into students values(?,?,?,?,?)");
            stm.setObject(1, sid);
            stm.setObject(2, name);
            stm.setObject(3, address);
            stm.setObject(4, telNo);
            stm.setObject(5, mark);

            int i = stm.executeUpdate();

            if(i>0){
                System.out.println("Data added !");
            }else{
                System.out.println("Data adding failed !");
            }

        }catch (SQLException | ClassNotFoundException ex){
            System.out.println("SQL or Driver Error..Please Check ---> "+ex);
        }
    }
    
    public static void loadData(){
        try {
            //mysql Driver ram ekata load karanawa
            Class.forName("com.mysql.cj.jdbc.Driver");

            //mysql server eke adala database ekath ekka connection ekk hadagnnawa
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_afsd", "root", "yasindu@ijse");

            PreparedStatement stm = connection.prepareStatement("select * from students");

            ResultSet resultSet = stm.executeQuery();

            while(resultSet.next()){
                System.out.println("[ "+resultSet.getObject(1)+" "+resultSet.getObject(2)+" "+resultSet.getObject(3)+" "+resultSet.getObject(4)+" "+resultSet.getObject(5)+" ]");
            }


        }catch (SQLException | ClassNotFoundException ex){
            System.out.println("SQL or Driver Error..Please Check ---> "+ex);
        }
    }
}
