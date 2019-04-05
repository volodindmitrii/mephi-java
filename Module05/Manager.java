package Module05;

public class Manager extends Employee {


    private double oklad;
    private double monthSails;
    private double yearSails;
    private double persent;
    private String name;

    Manager(String name, double oklad, double monthSails, double yearSails, double persent){
        this.name=name;
        this.oklad=oklad;
        this.monthSails=monthSails;
        this.yearSails=yearSails;
        this.persent=persent;
    }
    public void setOklad(double oklad) {this.oklad = oklad;}
    public void setMonthSails(double monthSails) {this.monthSails = monthSails;}
    public void setYearSails(double yearSails) {this.yearSails = yearSails;}
    public void setPersent(double persent) {this.persent = persent;}
    public void setName(String name) {this.name = name;}
    public double getOklad(){return oklad;}
    public double getMonthSails(){return monthSails;}
    public double getYearSails(){return yearSails;}
    public double getPersent(){return persent;}
    @Override
    public String getName(){return this.name;}
    @Override
    public double getMonthSalary(){return oklad+persent/100*monthSails;}
    @Override
    public double getYearSalary(){return 12*oklad+persent/100*yearSails;}
}
