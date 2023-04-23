import java.util.List;
public interface EmployeeDAO {
    List<Employee> getAllEmployee();
    void createEmployee(Employee employee);
    void updateEmployee(int id);
    void deleteEmployee(int id);
    void getEmployeeByID(int id);
}
