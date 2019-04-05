package Module05;

public class HourlyEmployee extends Employee {
    private double stavka;
    private double otrabotanoInMonth;
    private double otrabotanoInYear;
    private String name;
    HourlyEmployee(String name, double stavka, double otrabotanoInMonth, double otrabotanoInYear){
        this.name=name;
        this.stavka=stavka;
        this.otrabotanoInMonth=otrabotanoInMonth;
        this.otrabotanoInYear=otrabotanoInYear;
    }

    public double getStavka(){return this.stavka;}
    public double getOtrabotanoInMonth(){return this.otrabotanoInMonth;}
    public double getOtrabotanoInYear(){return otrabotanoInYear;}
    public void setOtrabotanoInYear(double otrabotanoInYear) {this.otrabotanoInYear = otrabotanoInYear;}
    public void setName(String name) {this.name = name;}
    public void setStavka(double stavka) {this.stavka = stavka;}
    public void setOtrabotanoInMonth(double otrabotanoInMonth) {this.otrabotanoInMonth = otrabotanoInMonth;}
    @Override
    public String getName(){return this.name;}
    @Override
    public double getMonthSalary(){return stavka*otrabotanoInMonth;}
    @Override
    public double getYearSalary(){return stavka*otrabotanoInYear;}

}
