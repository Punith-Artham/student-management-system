import dao.*;
import model.*;
import util.DBConnection;
import java.sql.*;
import model.*;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAOImpl();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add Student");
        System.out.println("2. View Students");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("ID: ");
            int id = sc.nextInt(); sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt(); sc.nextLine();

            System.out.print("Course: ");
            String course = sc.nextLine();

            dao.addStudent(new Student(id, name, age, course));

        } else {
            dao.getAllStudents().forEach(s ->
                System.out.println(
                    s.getId()+" "+s.getName()+" "+
                    s.getAge()+" "+s.getCourse()
                )
            );
        }
    }
}
