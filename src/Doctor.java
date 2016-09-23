public class Doctor extends Person implements Employee {

    private Integer salary;

    public Doctor(Integer salary, String lastName, String firstName, String code, Address address) {
        super(lastName, firstName, code, address);
        this.salary = salary;
    }

    @Override
    public Integer getSalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
