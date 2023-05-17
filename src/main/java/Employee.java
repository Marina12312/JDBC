

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int age;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    @Column(name = "city_id")
    private City cityId;

    public Employee(String first_name) {
        this.id=id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.gender=gender;
        this.age=age;

            }



    public City getCityId() {
        return cityId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setCityId(City cityId) {
        this.cityId = cityId;
    }

    public Employee() {

        }

    @Override
        public String toString() {
            return "Employee{" + ", last_Name='" + last_name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    ", cityId="  +
                    '}';
        }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}



