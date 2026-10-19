public class Main {

    public static void main(String[] args) {
        
        EmployeeDetails obj1 = new EmployeeDetails(1, "Nikhil", "Manager", 20000);
        EmployeeDetails obj2 = new EmployeeDetails(2, "Ram", "Worker", 10000);

        obj1.getEmployeeDetails();
        obj1.updateSalary(-1);
        obj1.updateSalary(200001);
        obj1.getEmployeeDetails();

        obj2.getEmployeeDetails();
        obj2.updateSalary(-1);
        obj2.updateSalary(100001);
        obj2.getEmployeeDetails();

        System.out.println("Employee 1 salary = "+obj1.getSalary());

    }
}
