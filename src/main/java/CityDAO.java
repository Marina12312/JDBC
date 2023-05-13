import java.util.List;

public interface CityDAO {
    List<City> getAllCity();
    void updateCity(City city);
    void  deleteCity(City city);
    void createCity(City city);
    City getCityById(int id);


}
