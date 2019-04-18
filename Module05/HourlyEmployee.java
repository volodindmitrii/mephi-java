package Module05;

class HourlyEmployee extends Employee {
    private double stavka;
    private double otrabotanoInMonth;
    private double otrabotanoInYear;
    HourlyEmployee(String name, double stavka, double otrabotanoInMonth, double otrabotanoInYear){
        super(name);
        this.stavka=stavka;
        this.otrabotanoInMonth=otrabotanoInMonth;
        this.otrabotanoInYear=otrabotanoInYear;
    }

    double getStavka(){return stavka;}
    double getOtrabotanoInMonth(){return otrabotanoInMonth;}
    double getOtrabotanoInYear(){return otrabotanoInYear;}
    void setOtrabotanoInYear(double otrabotanoInYear) {this.otrabotanoInYear = otrabotanoInYear;}
    void setName(String name) {this.name = name;}
    void setStavka(double stavka) {this.stavka = stavka;}
    void setOtrabotanoInMonth(double otrabotanoInMonth) {this.otrabotanoInMonth = otrabotanoInMonth;}
    @Override
    double getMonthSalary(){return stavka*otrabotanoInMonth;}
    @Override
    double getYearSalary(){return stavka*otrabotanoInYear;}
    @Override
    public String toString(){
        return super.toString() + " || otrabotano in month: " + otrabotanoInMonth +
                " || otrabotano in year: " + otrabotanoInYear + " || stavka: " + stavka + " |";
    }
}
