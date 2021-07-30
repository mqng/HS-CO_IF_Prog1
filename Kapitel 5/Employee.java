class Employee {
    private static int count = 0;
    private String firstName;
    private String lastName;

    {
        count += 1;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } 
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCount() {
        return count;
    }

    public String toString() {
        return "First Name: " + firstName + " Last Name: " + lastName + "\n";
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("FirstName 1", "LastName 1");    
        Employee e2 = new Employee("FirstName 2", "LastName 2");    
        Employee e3 = new Employee("FirstName 3", "LastName 3");    
        Employee e4 = new Employee("FirstName 4", "LastName 4");    
        Employee e5 = new Employee("FirstName 5", "LastName 5");    
        Employee e6 = new Employee("FirstName 6", "LastName 6");
        
        System.out.println("# of Employees: " + Employee.getCount());
    } 
}


