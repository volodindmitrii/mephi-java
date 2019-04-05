package Module05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    private static List hourlyEmployees = new ArrayList();
    private static List salariedEmployees = new ArrayList();
    private static List managerEmployees = new ArrayList();
    private static List executiveEmployees = new ArrayList();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        String name;
        double month;
        double year;
        double stavka;
        double persent;
        int a=1;
        int doing;
        int type;
        System.out.println("Welcome!");
        while (a==1) {
            System.out.println("->If you want to finish, input 0");
            System.out.println("->If you want to add employee, input 1");
            System.out.println("->If you want to remote employee, input 2");
            System.out.println("->If you want to change parameters of employee, input 3");
            System.out.println("->If you want to change type of payment of employee, input 4");
            System.out.println("->If you want me to show you list of employees, input 5");
            System.out.println("->If you want to open addition options, input 6");
            doing = in.nextInt();

            switch (doing) {
                case 0:
                    a = 0;
                    break;
                case 1:
                    additionEmpoyee();
                    break;
                case 2:
                    System.out.println("input name of employee: ");
                    name = st.nextLine();
                    removeEmployee(name);
                    break;
                case 3:
                    System.out.println("input name of employee: ");
                    name = st.nextLine();
                    chanchingOfParemethers(name);
                    break;
                case 4:
                    System.out.println("input name of employee: ");
                    name = st.nextLine();
                    System.out.println("input type of new payment: (1 - hourly, 2 - salaried, 3 - manager, 4 - executive)");
                    type = in.nextInt();
                    moveEmployee(name, type);
                    break;
                case 5:
                    printEmployees();
                    break;
                case 6:
                    int adOper;
                    System.out.println("-> to go back, input 0");
                    System.out.println("->If you want me to show you list of employee names with their salaries, input 1");
                    System.out.println("->If you want me to show you quantity of employees and their summ and average salaries, input 2");
                    System.out.println("->If you want me to show you quantity of employees and their summ and average salaries in a group, input 3");
                    adOper=in.nextInt();
                    switch (adOper){
                        case 0:
                            break;
                        case 1:
                            listOfSalaries();
                            break;
                        case 2:
                            sumAndOver();
                            break;
                        case 3:
                            sumAndOverGroup();
                            break;
                        default:
                            System.out.println("invalid input, please try again");
                    }
                    break;
                default:
                    System.out.println("invalid input, please try again");
                }
            }
        }

    //addition
    public static void additionEmpoyee(){
        String name;
        double month;
        double year;
        double stavka;
        double persent;
        int type;
        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        System.out.println("input type of payment: (1 - hourly, 2 - salaried, 3 - manager, 4 - executive)");
        type = in.nextInt();
        System.out.println("input name: ");
        name = st.nextLine();
        switch (type){
            case 1:
                System.out.println("input stavka: ");
                stavka = in.nextDouble();
                System.out.println("input otrabotano in month: ");
                month = in.nextDouble();
                System.out.println("input otrabotano in year: ");
                year = in.nextDouble();
                hourlyEmployees.add(new HourlyEmployee(name, stavka, month, year));
                break;
            case 2:
                System.out.println("input salary: ");
                stavka = in.nextDouble();
                salariedEmployees.add(new SalariedEmployee(name, stavka));
                break;
            case 3:
                System.out.println("input oklad: ");
                stavka = in.nextDouble();
                System.out.println("input sails in month: ");
                month = in.nextDouble();
                System.out.println("input sails in year: ");
                year = in.nextDouble();
                System.out.println("input pursent: ");
                persent = in.nextDouble();
                managerEmployees.add(new Manager(name, stavka, month, year, persent));
                break;
            case 4:
                System.out.println("input oklad: ");
                stavka = in.nextDouble();
                System.out.println("input profit in month: ");
                month = in.nextDouble();
                System.out.println("input profit in year: ");
                year = in.nextDouble();
                System.out.println("input pursent: ");
                persent = in.nextDouble();
                executiveEmployees.add(new Executive(name, stavka, month, year, persent));
                break;
        }
    }
    public static void additionEmpoyee(String name, int type){
        double month;
        double year;
        double stavka;
        double persent;
        Scanner in = new Scanner(System.in);
        switch (type){
            case 1:
                System.out.println("input stavka: ");
                stavka = in.nextDouble();
                System.out.println("input otrabotano in month: ");
                month = in.nextDouble();
                System.out.println("input otrabotano in year: ");
                year = in.nextDouble();
                hourlyEmployees.add(new HourlyEmployee(name, stavka, month, year));
                break;
            case 2:
                System.out.println("input salary: ");
                stavka = in.nextDouble();
                salariedEmployees.add(new SalariedEmployee(name, stavka));
                break;
            case 3:
                System.out.println("input oklad: ");
                stavka = in.nextDouble();
                System.out.println("input sails in month: ");
                month = in.nextDouble();
                System.out.println("input sails in year: ");
                year = in.nextDouble();
                System.out.println("input pursent: ");
                persent = in.nextDouble();
                managerEmployees.add(new Manager(name, stavka, month, year, persent));
                break;
            case 4:
                System.out.println("input oklad: ");
                stavka = in.nextDouble();
                System.out.println("input profit in month: ");
                month = in.nextDouble();
                System.out.println("input profit in year: ");
                year = in.nextDouble();
                System.out.println("input pursent: ");
                persent = in.nextDouble();
                executiveEmployees.add(new Executive(name, stavka, month, year, persent));
                break;
        }
    }
    //removing
    public static void removeEmployee(String nname){
        int a=0;
        HourlyEmployee employee;
        for (int i = 0; i < hourlyEmployees.size(); i++) {
            employee=(HourlyEmployee) (hourlyEmployees.get(i));
            if (nname.equals(employee.getName())) {
                a = 1;
                hourlyEmployees.remove(employee);
                break;
            }
        }
        if (a==0){
            SalariedEmployee employee1;
            for (int i = 0; i < salariedEmployees.size(); i++) {
                employee1=(SalariedEmployee) (salariedEmployees.get(i));
                if (nname.equals(employee1.getName())) {
                    a = 1;
                    salariedEmployees.remove(employee1);
                    break;
                }
            }
        }
        if (a==0){
            Manager employee2;
            for (int i = 0; i < managerEmployees.size(); i++) {
                employee2=(Manager) (managerEmployees.get(i));
                if (nname.equals(employee2.getName())) {
                    a = 1;
                    managerEmployees.remove(employee2);
                    break;
                }
            }
        }
        if (a==0){
            Executive employee3;
            for (int i = 0; i < executiveEmployees.size(); i++) {
                employee3=(Executive) (executiveEmployees.get(i));
                if (nname.equals(employee3.getName())) {
                    a = 1;
                    executiveEmployees.remove(employee3);
                    break;
                }
            }
        }
        if (a==0){
            System.out.println("This employee is not exist");
        }


    }
    //moving
    public static void moveEmployee(String nname, int type){
        removeEmployee(nname);
        additionEmpoyee(nname, type);
        }
    //change settings
    public static void chanchingOfParemethers(String nname){
        Scanner in = new Scanner(System.in);
        int a=0;
        HourlyEmployee employee;
        for (int i = 0; i < hourlyEmployees.size(); i++) {
            employee=(HourlyEmployee) (hourlyEmployees.get(i));
            if (nname.equals(employee.getName())) {
                a = 1;
                employee.setName(nname);
                System.out.println("input new stavka: ");
                employee.setStavka(in.nextDouble());
                System.out.println("input new otrabotano in month: ");
                employee.setOtrabotanoInMonth(in.nextDouble());
                System.out.println("input new otrabotano in year: ");
                employee.setOtrabotanoInYear(in.nextDouble());
                hourlyEmployees.set(i, employee);
            }
        }
        if (a==0){
            SalariedEmployee employee1;
            for (int i = 0; i < salariedEmployees.size(); i++) {
                employee1=(SalariedEmployee) (salariedEmployees.get(i));
                if (nname.equals(employee1.getName())) {
                    a = 1;
                    employee1.setName(nname);
                    System.out.println("input new salary: ");
                    employee1.setSalary(in.nextDouble());
                    salariedEmployees.set(i, employee1);
                }
            }
        }
        if (a==0){
            Manager employee2;
            for (int i = 0; i < managerEmployees.size(); i++) {
                employee2=(Manager) (managerEmployees.get(i));
                if (nname.equals(employee2.getName())) {
                    a = 1;
                    employee2.setName(nname);
                    System.out.println("input new oklad: ");
                    employee2.setOklad(in.nextDouble());
                    System.out.println("input new sails in month: ");
                    employee2.setMonthSails(in.nextDouble());
                    System.out.println("input new sails in year: ");
                    employee2.setYearSails(in.nextDouble());
                    System.out.println("input new pursent: ");
                    employee2.setPersent(in.nextDouble());
                    salariedEmployees.set(i, employee2);
                }
            }
        }
        if (a==0){
            Executive employee3;
            for (int i = 0; i < executiveEmployees.size(); i++) {
                employee3=(Executive) (executiveEmployees.get(i));
                if (nname.equals(employee3.getName())) {
                    a = 1;
                    employee3.setName(nname);
                    System.out.println("input new oklad: ");
                    employee3.setOklad(in.nextDouble());
                    System.out.println("input new profit in month: ");
                    employee3.setMonthProfit(in.nextDouble());
                    System.out.println("input new profit in year: ");
                    employee3.setYearProfit(in.nextDouble());
                    System.out.println("input new pursent: ");
                    employee3.setPersent(in.nextDouble());
                    salariedEmployees.set(i, employee3);
                }
            }
        }
        if (a==0){
            System.out.println("This employee is not exist");
        }

    }
    //printing of employees and their parameters
    public static void printEmployees(){
        HourlyEmployee employee;
        for (int i = 0; i < (hourlyEmployees.size()); i++) {
            employee=(HourlyEmployee) (hourlyEmployees.get(i));
            System.out.println("| name: "+employee.getName()+" || otrabotano in month: "+employee.getOtrabotanoInMonth()+
                    " || otrabotano in year: "+employee.getOtrabotanoInYear()+" || stavka: "+employee.getStavka()+" |");
        }
        SalariedEmployee employee1;
        for (int i = 0; i < (salariedEmployees.size()); i++) {
            employee1=(SalariedEmployee) (salariedEmployees.get(i));
            System.out.println("| name: "+employee1.getName()+" || salary: "+employee1.getSalary()+" |");
        }
        Manager employee2;
        for (int i = 0; i < (managerEmployees.size()); i++) {
            employee2=(Manager) (managerEmployees.get(i));
            System.out.println("| name: "+employee2.getName()+" || oklad: "+employee2.getOklad()+
                    " || month sails: "+employee2.getMonthSails()+" || year sails: "+employee2.getYearSails()+" || persent: "+employee2.getPersent()+" |");
        }
        Executive employee3;
        for (int i = 0; i < (executiveEmployees.size()); i++) {
            employee3=(Executive) (executiveEmployees.get(i));
            System.out.println("| name: "+employee3.getName()+" || oklad: "+employee3.getOklad()+
                    " || month profit: "+employee3.getMonthProfit()+" || year profit: "+employee3.getYearProfit()+" || persent: "+employee3.getPersent()+" |");
        }
    }
    //printing of employees and their salaries
    public static void listOfSalaries(){
        HourlyEmployee employee;
        for (int i = 0; i < (hourlyEmployees.size()); i++) {
            employee=(HourlyEmployee) (hourlyEmployees.get(i));
            System.out.println("| name: "+employee.getName()+" || month salary: "+employee.getMonthSalary()+
                    " || year salary: "+employee.getYearSalary());
        }
        SalariedEmployee employee1;
        for (int i = 0; i < (salariedEmployees.size()); i++) {
            employee1=(SalariedEmployee) (salariedEmployees.get(i));
            System.out.println("| name: "+employee1.getName()+" || month salary: "+employee1.getMonthSalary()+
                    " || year salary: "+employee1.getYearSalary()+" |");
        }
        Manager employee2;
        for (int i = 0; i < (managerEmployees.size()); i++) {
            employee2=(Manager) (managerEmployees.get(i));
            System.out.println("| name: "+employee2.getName()+" || month salary: "+employee2.getMonthSalary()+
                    " || year salary: "+employee2.getYearSalary()+" |");
        }
        Executive employee3;
        for (int i = 0; i < (executiveEmployees.size()); i++) {
            employee3=(Executive) (executiveEmployees.get(i));
            System.out.println("| name: "+employee3.getName()+" || month salary: "+employee3.getMonthSalary()+
                    " || year salary: "+employee3.getYearSalary()+" |");
        }
    }
    //summ and aver salaries
    public static void sumAndOver(){
        int quantity=hourlyEmployees.size()+salariedEmployees.size()+managerEmployees.size()+executiveEmployees.size();
        double mes=0;
        double ye=0;
        HourlyEmployee employee;
        for (int i = 0; i < (hourlyEmployees.size()); i++) {
            employee=(HourlyEmployee) (hourlyEmployees.get(i));
            mes+=employee.getMonthSalary();
            ye+=employee.getYearSalary();
        }
        SalariedEmployee employee1;
        for (int i = 0; i < (salariedEmployees.size()); i++) {
            employee1=(SalariedEmployee) (salariedEmployees.get(i));
            mes+=employee1.getMonthSalary();
            ye+=employee1.getYearSalary();
        }
        Manager employee2;
        for (int i = 0; i < (managerEmployees.size()); i++) {
            employee2=(Manager) (managerEmployees.get(i));
            mes+=employee2.getMonthSalary();
            ye+=employee2.getYearSalary();
        }
        Executive employee3;
        for (int i = 0; i < (executiveEmployees.size()); i++) {
            employee3=(Executive) (executiveEmployees.get(i));
            mes+=employee3.getMonthSalary();
            ye+=employee3.getYearSalary();
        }
        System.out.println("| Quantity of employees: "+quantity+" || summ month salary: "+mes+" || summ year salary: "+ye+" || average month salary: "+mes/quantity+" || average year salary: "+ye/quantity+" |");
    }
    //summ and aver salaries in a group
    public static void sumAndOverGroup(){
        Scanner in =new Scanner(System.in);
        System.out.println("input type of group: (1 - hourly, 2 - salaried, 3 - manager, 4 - executive)");
        int type = in.nextInt();
        int quantity=0;
        double mes=0;
        double ye=0;
        switch (type){
            case 1:
                quantity=hourlyEmployees.size();
                HourlyEmployee employee;
                for (int i = 0; i < (hourlyEmployees.size()); i++) {
                    employee=(HourlyEmployee) (hourlyEmployees.get(i));
                    mes+=employee.getMonthSalary();
                    ye+=employee.getYearSalary();
                }
                break;
            case 2:
                quantity=salariedEmployees.size();
                SalariedEmployee employee1;
                for (int i = 0; i < (salariedEmployees.size()); i++) {
                    employee1=(SalariedEmployee) (salariedEmployees.get(i));
                    mes+=employee1.getMonthSalary();
                    ye+=employee1.getYearSalary();
                }
                break;
            case 3:
                quantity=managerEmployees.size();
                Manager employee2;
                for (int i = 0; i < (managerEmployees.size()); i++) {
                    employee2=(Manager) (managerEmployees.get(i));
                    mes+=employee2.getMonthSalary();
                    ye+=employee2.getYearSalary();
                }
                break;
            case 4:
                quantity=executiveEmployees.size();
                Executive employee3;
                for (int i = 0; i < (executiveEmployees.size()); i++) {
                    employee3=(Executive) (executiveEmployees.get(i));
                    mes+=employee3.getMonthSalary();
                    ye+=employee3.getYearSalary();
                }
                break;
            default:
                System.out.println("This group is not exist");
                return;
        }
        System.out.println("| Quantity of employees: "+quantity+" || summ month salary: "+mes+" || summ year salary: "+ye+" || average month salary: "+mes/quantity+" || average year salary: "+ye/quantity+" |");
    }
}
    /*public static void removeSalariedEmployee(String nname){
        int a=0;
        for (SalariedEmployee employee : salariedEmployees) {
            if (nname.equals(employee.getName())) {
                a = 1;
                salariedEmployees.remove(employee);
            }
        }
        if (a==0){
            System.out.println("This employee is not exist");
        }
    }
    public static void removeManagerEmployee(String nname){
        int a=0;
        for (Manager employee : managerEmployees) {
            if (nname.equals(employee.getName())) {
                a = 1;
                managerEmployees.remove(employee);
            }
        }
        if (a==0){
            System.out.println("This employee is not exist");
        }
    }
    public static void removeExecutiveEmployee(String nname){
        int a=0;
        for (Executive employee : executiveEmployees) {
            if (nname.equals(employee.getName())) {
                a = 1;
                executiveEmployees.remove(employee);
            }
        }
        if (a==0){
            System.out.println("This employee is not exist");
        }
    }*/

    /*if (a==0) {
            for (int i = 0; i < salariedEmployees.size(); i++) {
                if (nname.equals((salariedEmployees.get(i)).getName())) {
                    a = 1;
                    salariedEmployees.remove(salariedEmployees.get(i));
                }
            }
        }
        if (a==0) {
            for (int i=0; i< managerEmployees.size(); i++){
                if (nname.equals((managerEmployees.get(i)).getName())) {
                    a = 1;
                    managerEmployees.remove(managerEmployees.get(i));
                }
            }
        }
        if (a==0) {
            for (int i=0; i< executiveEmployees.size(); i++){
                if (nname.equals((executiveEmployees.get(i)).getName())) {
                    a = 1;
                    executiveEmployees.remove(executiveEmployees.get(i));
                }
            }
        }*/
/*public static void addHourlyEmployee(HourlyEmployee employee){hourlyEmployees.add(employee);}
    public static void addSalariedEmployee(SalariedEmployee employee){salariedEmployees.add(employee);}
    public static void addManagerEmployee(Manager employee){managerEmployees.add(employee);}
    public static void addExecutiveEmployee(Executive employee){executiveEmployees.add(employee);}*/







