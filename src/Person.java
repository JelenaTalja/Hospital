
import util.ParseCode;




public class Person implements Peaple {

    private String lastName;
    private String firstName;
    private String code;
    private Address address;
    private ParseCode parseCode;


    public Person(String lastName, String firstName, String code, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.code = code;
        this.address = address;
        this.parseCode = new ParseCode(this.code);
        this.setAge(this.parseCode);
        this.Britdey(this.parseCode);
        this.setGender(this.parseCode);
    }

    @Override
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;    }

   
  

    private void setAge(ParseCode parseCode) {
        this.age = parseCode.getAge();
    }

    private void Britdey(ParseCode parseCode) {
        
    }

    private void setGender(ParseCode parseCode) {
   
    }

    @Override
    public String getCoge() {

    }

    
    
}
