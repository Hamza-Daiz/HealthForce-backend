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

    System.out.println(patient.get().getAdress());

    if (patient.get().getAdress()==null || !upatient.getAdress().equals(patient.get().getAdress())){
      patient.get().setAdress(patient.get().getAdress());
    }
    if (patient.get().getAssurance_medical()==null || !upatient.getAssurance_medical().equals(patient.get().getAssurance_medical())){
      patient.get().setAssurance_medical(patient.get().getAssurance_medical());
    }
    if (patient.get().getNum_assurance()==null || !upatient.getNum_assurance().equals(patient.get().getNum_assurance())){
      patient.get().setNum_assurance(patient.get().getNum_assurance());
    }
    if (patient.get().getBirth_date()==null || !upatient.getBirth_date().equals(patient.get().getBirth_date())){
      patient.get().setBirth_date(patient.get().getBirth_date());
    }
    if (patient.get().getCin()==null || !upatient.getCin().equals(patient.get().getCin())){
      patient.get().setCin(patient.get().getCin());
    }
    if (patient.get().getFirst_name()==null || !upatient.getFirst_name().equals(patient.get().getFirst_name())){
      patient.get().setFirst_name(patient.get().getFirst_name());
    }
    if (patient.get().getLast_name()==null || !upatient.getLast_name().equals(patient.get().getLast_name())){
      patient.get().setLast_name(patient.get().getLast_name());
    }
    if (patient.get().getGender()==null || !upatient.getGender().equals(patient.get().getGender())){
      patient.get().setGender(patient.get().getGender());
    }
    if (patient.get().getPhone()==null || !upatient.getPhone().equals(patient.get().getPhone())){
      patient.get().setPhone(patient.get().getPhone());
    }
    if (patient.get().getHome_phone()==null || !upatient.getHome_phone().equals(patient.get().getHome_phone())){
      patient.get().setHome_phone(patient.get().getHome_phone());
    }
    if (patient.get().getPoid()==null || !upatient.getPoid().equals(patient.get().getPoid())){
      patient.get().setPoid(patient.get().getPoid());
    }
    if (patient.get().getTaille()==null || !upatient.getTaille().equals(patient.get().getTaille())){
      patient.get().setTaille(patient.get().getTaille());
    }
    if (patient.get().getTemperature()==null || !upatient.getTemperature().equals(patient.get().getTemperature())){
      patient.get().setTemperature(patient.get().getTemperature());
    }
    if (patient.get().getGlecimie()==null || !upatient.getGlecimie().equals(patient.get().getGlecimie())){
      patient.get().setGlecimie(patient.get().getGlecimie());
    }
    if (patient.get().getDescription()==null || !upatient.getDescription().equals(patient.get().getDescription())){
      patient.get().setDescription(patient.get().getDescription());
    }
    if (patient.get().getTension()==null || !upatient.getTension().equals(patient.get().getTension())){
      patient.get().setTension(patient.get().getTension());
    }

    patientRepository.save(patient.get());


  }


}

