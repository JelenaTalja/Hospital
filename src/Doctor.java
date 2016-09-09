
import java.util.List;

public class Doctor extends Person implements Departmetns {

    private Department department;

    private List<Pacient> patsients;

    @Override
    public String getDepartmet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Department setDepatment(Department department) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
