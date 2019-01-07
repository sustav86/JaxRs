package academy.learnprogramming.entities;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

@Entity
public class ApplicationUser extends AbstractEntity{

//    @SequenceGenerator(name = "User_seq", sequenceName = "User_sequence")
//    @GeneratedValue(generator = "User_seq")
//    @Id
//    private Long id;

//    CREATE SEQUENCE Emp_Seq
//    MINVALUE 1
//    START WITH 1
//    INCREMENT BY 50

    @NotEmpty(message = "Email must be set")
    @Email(message = "Email must be in form dd@dd.com")
    @FormParam("email")
    private String email;



    @NotEmpty(message = "Password must be set")
    @Size(min = 5, message = "Password must be more than 5 char")
    @FormParam("password")
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
