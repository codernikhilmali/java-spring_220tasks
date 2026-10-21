public class Employee {
    
    private final int id;

    private final String name;

    private final double baseSalary;

    public Employee( int id, String name, double baseSalary)
    {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBasePay()
    {
        return baseSalary;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

}
