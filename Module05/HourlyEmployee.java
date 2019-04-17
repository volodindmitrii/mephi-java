package Module05;

class HourlyEmployee extends Employee {
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

    double getStavka(){return this.stavka;}
    double getOtrabotanoInMonth(){return this.otrabotanoInMonth;}
    double getOtrabotanoInYear(){return otrabotanoInYear;}
    void setOtrabotanoInYear(double otrabotanoInYear) {this.otrabotanoInYear = otrabotanoInYear;}
    void setName(String name) {this.name = name;}
    void setStavka(double stavka) {this.stavka = stavka;}
    void setOtrabotanoInMonth(double otrabotanoInMonth) {this.otrabotanoInMonth = otrabotanoInMonth;}
    @Override
    String getName(){return this.name;}
    @Override
    double getMonthSalary(){return stavka*otrabotanoInMonth;}
    @Override
    double getYearSalary(){return stavka*otrabotanoInYear;}

}
