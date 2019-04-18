package Module05;

abstract class Employee {
    String name;
    Employee(String name){
        this.name=name;
    }
    String getName(){return name;}
    abstract double getMonthSalary();
    abstract double getYearSalary();
    @Override
    public String toString(){
        return "| name: "+ name;
    }
    String printSalaries(){
        return "| name: "+getName()+" || month salary: "+getMonthSalary()+
                " || year salary: "+getYearSalary();
    }
}
