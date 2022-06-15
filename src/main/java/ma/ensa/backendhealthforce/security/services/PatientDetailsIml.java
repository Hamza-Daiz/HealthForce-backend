package ma.ensa.backendhealthforce.security.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ma.ensa.backendhealthforce.models.Patient;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Objects;

public class PatientDetailsIml implements UserDetails {

    private static final long serialVersionUID = 1L;
    private String id;
    private  String email;
    private String first_name;
    private String last_name;
    private String birth_date;
    private String assurance_medical;
    private String num_assurance;
    private String phone;
    private String cin;

    private String adress;

    @JsonIgnore
    private String password;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
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

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PatientDetailsIml(String id,  String email,String last_name, String phone, String birth_date, String password) {
        this.id = id;
        this.email = email;
        this.last_name=last_name;
        this.phone = phone;
        this.birth_date = birth_date;
        this.password = password;



    }

    public PatientDetailsIml(String id, String email,
                             String first_name, String last_name,
                             String birth_date, String assurance_medical,
                             String num_assurance, String phone,
                             String cin, String password, String adress) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.assurance_medical = assurance_medical;
        this.num_assurance = num_assurance;
        this.phone = phone;
        this.cin = cin;
        this.password = password;
        this.adress = adress;
    }

    public static PatientDetailsIml build(Patient patient
    ) {

        return new PatientDetailsIml(
                patient.getId(),
                patient.getEmail(),
                patient.getFirst_name(),
                patient.getLast_name(),
                patient.getBirth_date(),
                patient.getAssurance_medical(),
                patient.getNum_assurance(),
                patient.getPhone(),
                patient.getCin(),
                patient.getPassword(),
                patient.getAdress());
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PatientDetailsIml patient = (PatientDetailsIml) o;
        return Objects.equals(id, patient.id);
    }
}
