package ma.ensa.backendhealthforce.controllers;

import ma.ensa.backendhealthforce.models.Patient;
import ma.ensa.backendhealthforce.payload.request.LoginRequest;
import ma.ensa.backendhealthforce.payload.response.JwtResponse;
import ma.ensa.backendhealthforce.payload.response.MessageResponse;
import ma.ensa.backendhealthforce.repository.PatientRepository;
import ma.ensa.backendhealthforce.security.jwt.JwtUtils;
import ma.ensa.backendhealthforce.security.services.PatientDetailsIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/patient")
public class PatientController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  PatientRepository patientRepository;




  @PutMapping("/update")
  public void updateInfos(@RequestBody Patient upatient) {
    Optional<Patient> patient = patientRepository.findByEmail(upatient.getEmail());

    if (!upatient.getAdress().equals(patient.get().getAdress())){
      patient.get().setAdress(patient.get().getAdress());
    }
    if (!upatient.getAssurance_medical().equals(patient.get().getAssurance_medical())){
      patient.get().setAssurance_medical(patient.get().getAssurance_medical());
    }
    if (!upatient.getNum_assurance().equals(patient.get().getNum_assurance())){
      patient.get().setNum_assurance(patient.get().getNum_assurance());
    }
    if (!upatient.getBirth_date().equals(patient.get().getBirth_date())){
      patient.get().setBirth_date(patient.get().getBirth_date());
    }
    if (!upatient.getCin().equals(patient.get().getCin())){
      patient.get().setCin(patient.get().getCin());
    }
    if (!upatient.getFirst_name().equals(patient.get().getFirst_name())){
      patient.get().setFirst_name(patient.get().getFirst_name());
    }
    if (!upatient.getLast_name().equals(patient.get().getLast_name())){
      patient.get().setLast_name(patient.get().getLast_name());
    }
    if (!upatient.getGender().equals(patient.get().getGender())){
      patient.get().setGender(patient.get().getGender());
    }
    if (!upatient.getPhone().equals(patient.get().getPhone())){
      patient.get().setPhone(patient.get().getPhone());
    }
    if (!upatient.getHome_phone().equals(patient.get().getHome_phone())){
      patient.get().setHome_phone(patient.get().getHome_phone());
    }
    if (!upatient.getPoid().equals(patient.get().getPoid())){
      patient.get().setPoid(patient.get().getPoid());
    }
    if (!upatient.getTaille().equals(patient.get().getTaille())){
      patient.get().setTaille(patient.get().getTaille());
    }
    if (!upatient.getTemperature().equals(patient.get().getTemperature())){
      patient.get().setTemperature(patient.get().getTemperature());
    }
    if (!upatient.getGlecimie().equals(patient.get().getGlecimie())){
      patient.get().setGlecimie(patient.get().getGlecimie());
    }
    if (!upatient.getDescription().equals(patient.get().getDescription())){
      patient.get().setDescription(patient.get().getDescription());
    }
    if (!upatient.getTension().equals(patient.get().getTension())){
      patient.get().setTension(patient.get().getTension());
    }

    patientRepository.save(patient.get());


  }


}

