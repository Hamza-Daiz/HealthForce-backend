package ma.ensa.backendhealthforce.security.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ma.ensa.backendhealthforce.models.Patient;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Objects;

public class PatientDetailsIml implements UserDetails {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String id_patient;
    private  String email;

    private String last_name;

    public String getId_patient() {
        return id_patient;
    }

    public void setId_patient(String id_patient) {
        this.id_patient = id_patient;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    private  String phone;
    private String birth_date;

    @JsonIgnore
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

    public PatientDetailsIml(Long id, String id_patient, String email,String last_name, String phone, String birth_date, String password) {
        this.id = id;
        this.id_patient=id_patient;
        this.email = email;
        this.last_name=last_name;
        this.phone = phone;
        this.birth_date = birth_date;
        this.password = password;



    }

    public static PatientDetailsIml build(Patient patient
    ) {

        return new PatientDetailsIml(
                patient.getId(),
                patient.getId_patient(),
                patient.getEmail(),
                patient.getLast_name(),
                patient.getPhone(),
                patient.getBirth_date(),
                patient.getPassword());
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
