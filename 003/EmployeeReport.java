public class EmployeeReport {
    
    private final Employee employee;

    public EmployeeReport( Employee employee)
    {
        this.employee = employee;
    }
    
    public void viewEmployeeReport(double annualSalary)
    {
        System.out.println("Employee id = "+employee.getId());
        System.out.println("Employee Name = "+employee.getName());
        System.out.println("employee Base Salary = "+employee.getBasePay());
        System.out.println("employee Annual Salary = "+annualSalary);
    }
}
