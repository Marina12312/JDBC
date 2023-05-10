import java.util.List;
public interface EmployeeDAO {
    List<Employee> getAllEmployee();
    void updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void createEmployee(Employee employee);

    Employee getEmployeeByID(int id);
}
