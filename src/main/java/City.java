import javax.persistence.*;
import java.util.List;

@Entity

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_id;
//    выбрала значение LAZY, так как по умолчанию подходит к OneToMany
    @OneToMany(mappedBy = "cityId",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Employee>employees;
    private String city_name;

    public City() {

    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public City(int city_id, String city_name) {
        this.city_id = city_id;
        this.city_name = city_name;

    }

    public City(String dwd) {

    }

    public int getCity_id() {
        return city_id;
    }
}
