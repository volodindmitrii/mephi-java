package Module05;

class Executive extends Employee {
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

    void setOklad(double oklad) {this.oklad = oklad;}
    void setMonthProfit(double monthSails) {this.monthProfit = monthSails;}
    void setYearProfit(double yearSails) {this.yearProfit = yearSails;}
    void setPersent(double persent) {this.persent = persent;}
    void setName(String name) {this.name = name;}
    double getOklad(){return oklad;}
    double getMonthProfit(){return monthProfit;}
    double getYearProfit(){return yearProfit;}
    double getPersent(){return persent;}
    @Override
    String getName(){
        return this.name;
    }
    @Override
    double getMonthSalary(){
        return oklad+persent/100*monthProfit;
    }
    @Override
    double getYearSalary(){
        return 12*oklad+persent/100*yearProfit;
    }
}
