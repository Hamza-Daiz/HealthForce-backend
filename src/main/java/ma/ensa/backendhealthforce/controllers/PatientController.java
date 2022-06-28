package ma.ensa.backendhealthforce.controllers;

import ma.ensa.backendhealthforce.models.Patient;
import ma.ensa.backendhealthforce.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/patient")
public class PatientController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  PatientRepository patientRepository;

  private final PasswordEncoder passwordEncoder;

  public PatientController(PasswordEncoder passwordEncoder) {
    this.passwordEncoder = passwordEncoder;
  }

  @PutMapping("/update")
  public void updateInfos(@RequestBody Patient upatient) {

    Optional<Patient> patient = patientRepository.findByEmail(upatient.getEmail());

    upatient.setPassword(patient.get().getPassword());


    System.out.println(patient.get().getEmail());
    System.out.println(patient.get().getId());


    patientRepository.save(upatient);


  }


}

