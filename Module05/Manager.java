package Module05;

class Manager extends Employee {
    private double oklad;
    private double monthSails;
    private double yearSails;
    private double persent;

    Manager(String name, double oklad, double monthSails, double yearSails, double persent){
        super(name);
        this.oklad=oklad;
        this.monthSails=monthSails;
        this.yearSails=yearSails;
        this.persent=persent;
    }
    void setOklad(double oklad) {this.oklad = oklad;}
    void setMonthSails(double monthSails) {this.monthSails = monthSails;}
    void setYearSails(double yearSails) {this.yearSails = yearSails;}
    void setPersent(double persent) {this.persent = persent;}
    void setName(String name) {this.name = name;}
    double getOklad(){return oklad;}
    double getMonthSails(){return monthSails;}
    double getYearSails(){return yearSails;}
    double getPersent(){return persent;}
    @Override
    public double getMonthSalary(){return oklad+persent/100*monthSails;}
    @Override
    public double getYearSalary(){return 12*oklad+persent/100*yearSails;}
    @Override
    public String toString() {
        return super.toString() + " || oklad: " + oklad +
                " || month sails: " + monthSails + " || year sails: " + yearSails + " || persent: " + persent + " |";
    }
}
