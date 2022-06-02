package ma.ensa.backendhealthforce.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public class SignupRequest {
  @NotBlank
  @Size(min = 3, max = 20)
  private String username;

  @NotBlank
  @Size(min = 10, max = 30)
  private String telephone;

  @NotBlank
  @Size(max = 10)
  private String genre;

  private String date;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(min = 6, max = 40)
  private String password;

  public String getUsername() {
    return username;
  }

  public String getTelephone() {
    return telephone;
  }

  public String getGenre() {
    return genre;
  }

  public String getDate() {
    return date;
  }

  public String getEmail() {
    return email;
  }


  public String getPassword() {
    return password;
  }

}
