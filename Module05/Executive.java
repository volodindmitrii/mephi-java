package Module05;

public class Executive extends Employee {
    private double oklad;
    private double monthProfit;
    private double yearProfit;
    private double persent;
    private String name;

    Executive(String name, double oklad, double monthProfit, double yearProfit, double persent){
        this.name=name;
        this.oklad=oklad;
        this.monthProfit=monthProfit;
        this.yearProfit=yearProfit;
        this.persent=persent;
    }

    public void setOklad(double oklad) {this.oklad = oklad;}
    public void setMonthProfit(double monthSails) {this.monthProfit = monthSails;}
    public void setYearProfit(double yearSails) {this.yearProfit = yearSails;}
    public void setPersent(double persent) {this.persent = persent;}
    public void setName(String name) {this.name = name;}
    public double getOklad(){return oklad;}
    public double getMonthProfit(){return monthProfit;}
    public double getYearProfit(){return yearProfit;}
    public double getPersent(){return persent;}
    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public double getMonthSalary(){
        return oklad+persent/100*monthProfit;
    }

    @Override
    public double getYearSalary(){
        return 12*oklad+persent/100*yearProfit;
    }
}
