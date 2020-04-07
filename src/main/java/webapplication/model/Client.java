package webapplication.model;
import javax.persistence.*;

@Entity
@Table(name = "Clients")
@NamedQuery(name="Client.Print",query = "Select c From Client as c")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "age", nullable = false)
    private int age;
    @Column(name = "userlogin", nullable = false)
    private String userlogin;

    public Client() {
    }

    public Client(String name, int age, String userlogin) {
        this.name = name;
        this.age = age;
        this.userlogin = userlogin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserlogin() {
        return userlogin;
    }

    public void setUserlogin(String userlogin) {
        this.userlogin = userlogin;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", userlogin='" + userlogin + '\'' +
                '}';
    }

}