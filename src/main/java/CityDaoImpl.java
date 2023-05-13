import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CityDaoImpl implements CityDAO{

    @Override
    public List<City> getAllCity() {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            return session.createQuery("from City").list();
        }
    }
    @Override
    public void updateCity(City city) {
        Session session=HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.update(city);
        transaction.commit();
        session.close();

    }

    @Override
    public void deleteCity(City city) {
        Session session= HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(city);
        transaction.commit();
        session.close();
    }

    @Override
    public void createCity(City city) {
        Session session= HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.save(city);
        transaction.commit();
        session.close();
    }

    @Override
    public City getCityById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(City.class,id);
    }
}
