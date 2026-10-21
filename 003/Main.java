public class Main
{
    public static void main(String[] args) {

        Employee employee = new Employee(1, "nikhil", 10000);
        SalaryCalculator salaryCalculator = new SalaryCalculator(employee);
        EmployeeRepository employeeRepository = new EmployeeRepository(employee);

        double annualSalary = salaryCalculator.annualSalary();
        employeeRepository.save();

        EmployeeReport employeeReport = new EmployeeReport(employee);
        employeeReport.viewEmployeeReport(annualSalary);

    }
}