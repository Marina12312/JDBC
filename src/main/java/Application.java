import javax.persistence.EntityManager;
import java.sql.*;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {
        Employee employee1 = new Employee(8, "Марина", "Микива", "w", 34, 3);
        EmployeeDAO employeeDAO=new EmployeeDAOImpl();
        employeeDAO.createEmployee(employee1);
        System.out.println(employeeDAO.getEmployeeByID(8));
        List<Employee> list = employeeDAO.getAllEmployee();
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
