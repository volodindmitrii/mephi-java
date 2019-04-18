package Module05;

class SalariedEmployee extends Employee {
    private double salary;

    SalariedEmployee(String name, double salary){
        super(name);
        this.salary=salary;
    }

    void setName(String name) {this.name = name;}
    void setSalary(double salary) {this.salary = salary;}
    double getSalary(){return salary;}
    @Override
    double getMonthSalary(){return salary;}
    @Override
    double getYearSalary(){return 12*salary;}
    @Override
    public String toString(){
        return super.toString() + " || salary: " + salary + " |";
    }
}
