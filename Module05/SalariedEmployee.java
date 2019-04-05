package Module05;

public class SalariedEmployee extends Employee {
    private double salary;
    private String name;

    SalariedEmployee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public void setName(String name) {this.name = name;}
    public void setSalary(double salary) {this.salary = salary;}
    public double getSalary(){return this.salary;}
    @Override
    public String getName(){return this.name;}
    @Override
    public double getMonthSalary(){return salary;}
    @Override
    public double getYearSalary(){return 12*salary;}

}
