
import javax.persistence.*;

@Entity
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name ="FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name ="LAST_NAME", nullable = false)
    private String lastName;

    @Column(name ="ROLE_ID", nullable = false)
    private String role;

    @Column(name ="EMAIL", unique = true, nullable = false)
    private String email;

    @Column(name ="PASSWORD", nullable = false)
    private  String password;


    public User(){}

    public User(String email) {
        this.email = email;
    }

    public int getId(){return id;}

    public void setId(int id){ this.id = id; }

    public String getFirstName(){return firstName;}

    public void setFirstName(String firstName){ this.firstName = firstName; }

    public String getLastName(){return lastName;}

    public void setLastName(String lastName){ this.lastName = lastName; }

    public String getRole(){return role;}

    public void setRole(String role){ this.role = role; }

    public String getEmail(){ return  email; }

    public  void setEmail (String login){ this.email = email; }

    public String getPassword(){ return  password; }

    public void setPassword (String password){ this.password = password; }

}
