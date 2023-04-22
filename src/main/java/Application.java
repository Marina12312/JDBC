import java.sql.*;
import java.util.List;
public class Application {
    public static void main(String[] args) throws SQLException {

        final String user = "postgres";
        final String password = "miller";
        final String url = "jdbc:postgresql://localhost:5432/skypro";

        try (final Connection connection = DriverManager.getConnection(url,user,password);
             PreparedStatement statement =
                     connection.prepareStatement("SELECT * FROM employee")) {
                 ResultSet resultSet = statement.executeQuery();
   while (resultSet.next()) {
       int idOfPerson = resultSet.getInt("id");
  System.out.println("ID работника: " + idOfPerson);

   String namePerson = resultSet.getString("first_name");
   String lastName = resultSet.getString("last_name");
   String gender = resultSet.getString("gender");
   String city = resultSet.getString("city_id");
 System.out.println(namePerson + " " + lastName + " " + gender + " Город: " + city);}


   } catch (SQLException e) {
            System.out.println("Ошибка при подключении к базе данных!");
            e.printStackTrace();
        }
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        List <Employee> employees = employeeDAO.getAllEmployee();
        for (Employee employee : employees){
            System.out.println(employee.getFirst_name());
        }

        employeeDAO.deleteEmployee(8);
        for (Employee employee : employees){
            System.out.println(employee.getFirst_name());
        }
    }
}