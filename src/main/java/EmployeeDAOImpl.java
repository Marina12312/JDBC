import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDAOImpl   implements EmployeeDAO{



    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {
        Session session= HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.update(employee);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteEmployee(Employee employee) {
        Session session= HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(employee);
        transaction.commit();
        session.close();

    }

    @Override
    public void createEmployee(Employee employee) {
        Session session= HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();

    }

    @Override
    public Employee getEmployeeByID(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Employee.class,id);

    }
}