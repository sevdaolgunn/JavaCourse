abstract public class Employee {
    String firstName;
    String lastName;
    int SSN;



    public Employee(String firstName,String lastName,int SSN) {
        setFirstName(firstName);
        setLastName(lastName);
        setSSN(SSN);

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    abstract double earning();

    @Override
    public String toString() {
        return "name: "+this.firstName +" "+ this.lastName +"security social number: "+ this.SSN;
    }
}

