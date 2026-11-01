import java.util.ArrayList;
import java.util.List;

/**
 * Service quản lý bệnh viện - tuân thủ Single Responsibility Principle
 */
public class HospitalService {
    private List<Patient> patients;
    
    public HospitalService() {
        this.patients = new ArrayList<>();
    }
    
    public void admitPatient(Patient patient) throws InvalidPatientException {
        if (!patient.isValid()) {
            throw new InvalidPatientException("Invalid patient data");
        }
        
        // Check duplicate patient ID
        for (Patient p : patients) {
            if (p.getPatientId().equals(patient.getPatientId())) {
                throw new InvalidPatientException("Patient ID already exists");
            }
        }
        
        patients.add(patient);
    }
    
    public Patient findPatientById(String patientId) throws InvalidPatientException {
        for (Patient patient : patients) {
            if (patient.getPatientId().equals(patientId)) {
                return patient;
            }
        }
        throw new InvalidPatientException("Patient " + patientId + " not found");
    }
    
    public List<Patient> getAdmittedPatients() {
        List<Patient> admitted = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.isAdmitted()) {
                admitted.add(patient);
            }
        }
        return admitted;
    }
    
    public List<Patient> getDischargedPatients() {
        List<Patient> discharged = new ArrayList<>();
        for (Patient patient : patients) {
            if (!patient.isAdmitted()) {
                discharged.add(patient);
            }
        }
        return discharged;
    }
    
    public List<Patient> getPatientsByBloodType(String bloodType) {
        List<Patient> filtered = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getBloodType().equals(bloodType)) {
                filtered.add(patient);
            }
        }
        return filtered;
    }
    
    public List<Patient> getAllPatients() {
        return new ArrayList<>(patients);
    }
    
    public int getTotalPatients() {
        return patients.size();
    }
}