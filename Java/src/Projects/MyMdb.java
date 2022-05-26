package Projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyMdb {
    public static void main(String[]args){
        System.out.println("We are back");
        try{
            Connection connection  =  DriverManager.getConnection("jdbc:mysql://localhost/world","root","MySql1705");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from Country order by 'LifeExpectancy' Desc ");
            while(resultSet.next()){
                System.out.println(resultSet.getString("Name"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
