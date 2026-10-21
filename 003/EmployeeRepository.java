public class EmployeeRepository
{
    private final Employee employee;

    public EmployeeRepository( Employee employee)
    {
        this.employee = employee;
    }

    public void save()
    {
        if(employee.getId() > 0 )
        {
            System.out.println("employee details saved Successfully");
        }
        else
        {
            System.out.println("employee details not saved");
        }
    }
}