package ma.ensa.backendhealthforce.models;


import javax.persistence.*;

@Entity
public class Patient {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    public Patient() {
    }

    @Column(name = "phone")
    private String phone;
    @Column(name = "id_patient")
    private String id_patient;
    @Column(name = "adress")
    private String adress;
    @Column(name = "birth_date")
    private String birth_date;
    @Column(name = "first_name", nullable = false)
    private String first_name;
    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "cin")
    private String cin;
    @Column(name = "gender")
    private String gender;
    @Column(name = "assurance_medical")
    private String assurance_medical;
    @Column(name = "num_assurance")
    private String num_assurance;
    @Column(name = "home_phone")
    private String home_phone;
    @Column(name = "description")
    private String description;
    @Column(name = "poid")
    private String poid;
    @Column(name = "taille")
    private String taille;
    @Column(name = "temperature")
    private String temperature;
    @Column(name = "tension")
    private String tension;
    @Column(name = "glecimie")
    private String glecimie;


    public Patient(String id, String phone, String birth_date, String first_name, String last_name, String email) {
        this.id = id;
        this.phone = phone;
        this.birth_date = birth_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public Patient(String id, String first_name, String last_name, String email,String password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password=password;
    }

    public Patient(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public Patient(String id, String phone, String id_patient, String adress, String birth_date, String first_name, String last_name, String email, String password, String cin, String gender, String assurance_medical, String num_assurance, String home_phone, String description, String poid, String taille, String temperature, String tension, String glecimie) {
        this.id = id;
        this.phone = phone;
        this.id_patient = id_patient;
        this.adress = adress;
        this.birth_date = birth_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.cin = cin;
        this.gender = gender;
        this.assurance_medical = assurance_medical;
        this.num_assurance = num_assurance;
        this.home_phone = home_phone;
        this.description = description;
        this.poid = poid;
        this.taille = taille;
        this.temperature = temperature;
        this.tension = tension;
        this.glecimie = glecimie;
    }

    public Patient(String id, String phone, String birth_date, String first_name, String last_name, String email, String password, String cin, String gender) {
        this.id = id;
        this.phone = phone;
        this.birth_date = birth_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.cin = cin;
        this.gender = gender;
    }

    public String getId_patient() {
        return id_patient;
    }

    public void setId_patient(String id_patient) {
        this.id_patient = id_patient;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getHome_phone() {
        return home_phone;
    }

    public void setHome_phone(String home_phone) {
        this.home_phone = home_phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoid() {
        return poid;
    }

    public void setPoid(String poid) {
        this.poid = poid;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }

    public String getGlecimie() {
        return glecimie;
    }

    public void setGlecimie(String glecimie) {
        this.glecimie = glecimie;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getFirst_name() {
        return first_name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
