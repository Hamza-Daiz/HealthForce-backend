package ma.ensa.backendhealthforce.controllers;

import javax.validation.Valid;

import ma.ensa.backendhealthforce.models.Patient;
import ma.ensa.backendhealthforce.repository.PatientRepository;
import ma.ensa.backendhealthforce.security.services.PatientDetailsIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import ma.ensa.backendhealthforce.payload.request.LoginRequest;
import ma.ensa.backendhealthforce.payload.response.JwtResponse;
import ma.ensa.backendhealthforce.payload.response.MessageResponse;
import ma.ensa.backendhealthforce.security.jwt.JwtUtils;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  PatientRepository patientRepository;

  private final PasswordEncoder passwordEncoder;

  @Autowired
  PasswordEncoder encoder;


  @Autowired
  JwtUtils jwtUtils;

  public AuthController(PasswordEncoder passwordEncoder) {
    this.passwordEncoder = passwordEncoder;
  }

  @PostMapping("/signin")
  public ResponseEntity<JwtResponse> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
    System.out.println("1");
    Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
    System.out.println("2");
    SecurityContextHolder.getContext().setAuthentication(authentication);
    String jwt = jwtUtils.generateJwtToken(authentication);
    System.out.println("3");
    PatientDetailsIml patientDetails = (PatientDetailsIml) authentication.getPrincipal();
    System.out.println("4");
    System.out.println("patientPhone " + patientDetails.getPhone());
    System.out.println("patientAdress " + patientDetails.getAdress());
    return ResponseEntity.ok(new JwtResponse(jwt,
            patientDetails.getId(),
            patientDetails.getEmail(),
            patientDetails.getEmail(),
            patientDetails.getFirst_name(),
            patientDetails.getLast_name(),
            patientDetails.getBirth_date(),
            patientDetails.getAssurance_medical(),
            patientDetails.getNum_assurance(),
            patientDetails.getPhone(),
            patientDetails.getCin(),
            patientDetails.getAdress()
            ));

  }

  @PostMapping("/signup")
 // public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
    public ResponseEntity<?> registerPatient(@RequestBody Patient patientFromExternal) {

    if (patientRepository.existsByEmail(patientFromExternal.getEmail())) {
      return ResponseEntity
              .badRequest()
              .body(new MessageResponse("Error: Email is already in use!"));
    }

    String encodedPassword = this.passwordEncoder.encode(patientFromExternal.getPassword());
    System.out.println("Agent password encoded: " + encodedPassword);

    patientFromExternal.setPassword(encodedPassword);

    // Create new Patient's account
    // Patient patient = new Patient(00001L,"fistName","LastName","test@gmail.com","pass123");

    patientRepository.save(patientFromExternal);

    return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
  }
  @GetMapping("/getee")
  // public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
  public String GetEncode() {


    String encodedPassword = this.passwordEncoder.encode("toumi");
    System.out.println("Agent password encoded: " + encodedPassword);

    this.passwordEncoder.matches("toumi","$2a$10$2/AjPwO9WpEepxFUGLXpoOEVXRuFkieToVsV6SD6UVMhr/mP/NHx.");

    return encodedPassword;
  }
}

