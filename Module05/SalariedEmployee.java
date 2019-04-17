package Module05;

class SalariedEmployee extends Employee {
    private double salary;
    private String name;

    SalariedEmployee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    void setName(String name) {this.name = name;}
    void setSalary(double salary) {this.salary = salary;}
    double getSalary(){return this.salary;}
    @Override
    String getName(){return this.name;}
    @Override
    double getMonthSalary(){return salary;}
    @Override
    double getYearSalary(){return 12*salary;}

}
