package Module05;

public abstract class Employee {
//    public double stavka;
//    public double otrabotanoInMonth;
//    public double otrabotanoInYear;
//    public String name;

//    Employee(String name, double stavka, double otrabotanoInMonth, double otrabotanoInYear){
//        this.name=name;
//        this.stavka=stavka;
//        this.otrabotanoInMonth=otrabotanoInMonth;
//        this.otrabotanoInYear=otrabotanoInYear;
//    }
//    Employee(String name, double salary){
//        this.name=name;
//        this.salary=salary;
//    }
//    Employee(String name, double oklad, double monthSails, double yearSails, double persent){
//        this.name=name;
//        this.oklad=oklad;
//        this.monthSails=monthSails;
//        this.yearSails=yearSails;
//        this.persent=persent;

    abstract String getName();
    abstract double getMonthSalary();
    abstract double getYearSalary();
}
