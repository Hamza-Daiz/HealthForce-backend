package ma.ensa.backendhealthforce.payload.response;

public class JwtResponse {
  private String token;
  private String type = "Bearer";
  private String id;
  private String first_name;
  private String last_name;
  private String email;
  private String cin;
  private String phone;
  private String adress;
  private String assurance_medical;
  private String num_assurance;
  private String birth_date;



  public JwtResponse(String accessToken, String id,
                     String username, String email,
                     String first_name, String last_name,
                     String birth_date, String assurance_medical,
                     String num_assurance, String phone,
                     String cin, String adress) {

    this.token = accessToken;
    this.id = id;
    this.first_name = first_name;
    this.email = email;
    this.first_name = first_name;
    this.last_name = last_name;
    this.birth_date = birth_date;
    this.assurance_medical = assurance_medical;
    this.num_assurance = num_assurance;
    this.phone = phone;
    this.cin = cin;
    this.adress = adress;
  }

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }




  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getBirth_date() {
    return birth_date;
  }

  public void setBirth_date(String birth_date) {
    this.birth_date = birth_date;

  }

  public String getAssurance_medical() {
    return assurance_medical;
  }

  public void setAssurance_medical(String assurance_medical) {
    this.assurance_medical = assurance_medical;
  }

  public String getNum_assurance() {
    return num_assurance;
  }

  public void setNum_assurance(String num_assurance) {
    this.num_assurance = num_assurance;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getCin() {
    return cin;
  }

  public void setCin(String cin) {
    this.cin = cin;

  }

  public String getAccessToken() {
    return token;
  }

  public void setAccessToken(String accessToken) {
    this.token = accessToken;
  }

  public String getTokenType() {
    return type;
  }

  public void setTokenType(String tokenType) {
    this.type = tokenType;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

}
