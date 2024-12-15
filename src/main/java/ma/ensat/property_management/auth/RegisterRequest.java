package ma.ensat.property_management.auth;

import lombok.*;

//@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public String getFirstname() {
        return firstname;
    }
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
    public String getLastname() {
        return lastname;
    }

    // Getter for email (added missing getter)
    public String getEmail() {
        return email;
    }

    // Getter for password (if needed, add it too)
    public String getPassword() {
        return password;
    }
}
