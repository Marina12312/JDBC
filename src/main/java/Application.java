import javax.persistence.EntityManager;
import java.sql.*;
import java.util.List;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        EmployeeDAO employeeDao = new EmployeeDAOImpl();
        CityDAO cityDao = new CityDaoImpl();

        City city1 = new City("Cimf");
        cityDao.createCity(city1);
        City cityForEmployee = cityDao.getCityById(1);


        Employee employee = new Employee("Marina");

        employee.setCityId(cityForEmployee);


        employeeDao.createEmployee(employee);


        cityDao.deleteCity(cityForEmployee);
    }
}
