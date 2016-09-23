
import java.util.List;

public class Division {
    
    private List<Doctor> doctors;
    private List<Nurse> nurses;
    private List<Staff> staffes;
    private String divisionName;
    private List<Ward> wards;

    public Division() {
    }

    public Division(List<Doctor> doctors, List<Nurse> nurses, List<Staff> staffes, String divisionName, List<Ward> wards) {
        this.doctors = doctors;
        this.nurses = nurses;
        this.staffes = staffes;
        this.divisionName = divisionName;
        this.wards = wards;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public List<Staff> getStaffes() {
        return staffes;
    }

    public void setStaffes(List<Staff> staffes) {
        this.staffes = staffes;
    }

    public String getDivisionName() {
        return divisionName;
    }

    @Override
    public String toString() {
        return "Division{" + "doctors=" + doctors + ", nurses=" + nurses + ", staffes=" + staffes + ", divisionName=" + divisionName + ", wards=" + wards + '}';
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public List<Ward> getWards() {
        return wards;
    }

    public void setWards(List<Ward> wards) {
        this.wards = wards;
    }
}
