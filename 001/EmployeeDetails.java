public class EmployeeDetails {
    
    private final int id;
    private final String name;
    private final String department;
    private double salary;

   
    public EmployeeDetails( int id,String name, String department, double salary) {
        this.department = department;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public double getSalary()
    {
        return salary;
    }

    public boolean  updateSalary(double updatedSalary)
    {
        if(updatedSalary <= 0 )
        {
            System.out.println("Salary cannot be less than or equal to 0 so no salary updated.");
            System.out.println("Current salary = "+salary);

            return false;
        }
        else
        {
            System.out.println("salary before update = "+salary);
            System.out.println("Salary updated successfully");

            salary = updatedSalary;

            System.out.println("salary after update = "+salary);

            return true;
        } 
    }

    public void getEmployeeDetails()
    {
        System.out.println("Employee Details ");
        System.out.println("ID = "+id);
        System.out.println("Name = "+name);
        System.out.println("Department = "+department);
        System.out.println("Salary = "+salary);
    }

}
