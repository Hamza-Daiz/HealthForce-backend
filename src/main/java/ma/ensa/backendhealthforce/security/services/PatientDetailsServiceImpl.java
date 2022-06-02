package ma.ensa.backendhealthforce.security.services;


import ma.ensa.backendhealthforce.models.Patient;
import ma.ensa.backendhealthforce.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class PatientDetailsServiceImpl implements UserDetailsService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Patient patient = patientRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return PatientDetailsIml.build(patient);
    }
}
