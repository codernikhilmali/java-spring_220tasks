public class SalaryCalculator{

    private double annualSalary = 0;
    private final Employee employee;

    public SalaryCalculator(Employee employee)
    {
        this.employee = employee;
    }

    public double annualSalary() {
        return annualSalary = 12 * employee.getBasePay();
    }
}
