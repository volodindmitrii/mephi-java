package Module05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    private static List<HourlyEmployee> hourlyEmployees = new ArrayList();
    private static List<SalariedEmployee> salariedEmployees = new ArrayList();
    private static List<Manager> managerEmployees = new ArrayList();
    private static List<Executive> executiveEmployees = new ArrayList();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        String name;
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
                    additionEmployee();
                    break;
                case :
                    System.out.println("input name of employee: ");
                    name = st.nextLine();
                    removeEmployee(name);
                    break;
                case 3:
                    System.out.println("input name of employee: ");
                    name = st.nextLine();
                    changeParameters(name);
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
    private static void additionEmployee(){
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
    private static void additionEmployee(String name, int type){
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
    private static void removeEmployee(String nname){
        int a=0;
        for (HourlyEmployee employee : hourlyEmployees) {
            if (nname.equals(employee.getName())) {
                a = 1;
                hourlyEmployees.remove(employee);
                break;
            }
        }
        if (a==0){
            for (SalariedEmployee employee : salariedEmployees) {
                if (nname.equals(employee.getName())) {
                    a = 1;
                    salariedEmployees.remove(employee);
                    break;
                }
            }
        }
        if (a==0){
            for (Manager employee : managerEmployees) {
                if (nname.equals(employee.getName())) {
                    a = 1;
                    managerEmployees.remove(employee);
                    break;
                }
            }
        }
        if (a==0){
            for (Executive employee : executiveEmployees) {
                if (nname.equals(employee.getName())) {
                    a = 1;
                    executiveEmployees.remove(employee);
                    break;
                }
            }
        }
        if (a==0){
            System.out.println("This employee is not exist");
        }


    }
    //moving
    private static void moveEmployee(String nname, int type){
        removeEmployee(nname);
        additionEmployee(nname, type);
        }
    //change settings
    private static void changeParameters(String nname){
        Scanner in = new Scanner(System.in);
        int a=0;
        int j=0;
        for (HourlyEmployee employee : hourlyEmployees) {
            if (nname.equals(employee.getName())) {
                a = 1;
                employee.setName(nname);
                System.out.println("input new stavka: ");
                employee.setStavka(in.nextDouble());
                System.out.println("input new otrabotano in month: ");
                employee.setOtrabotanoInMonth(in.nextDouble());
                System.out.println("input new otrabotano in year: ");
                employee.setOtrabotanoInYear(in.nextDouble());
                hourlyEmployees.set(j, employee);
            }
            j++;
        }
        if (a==0){
            j=0;
            for (SalariedEmployee employee : salariedEmployees) {
                if (nname.equals(employee.getName())) {
                    a = 1;
                    employee.setName(nname);
                    System.out.println("input new salary: ");
                    employee.setSalary(in.nextDouble());
                    salariedEmployees.set(j, employee);
                }
                j++;
            }
        }
        if (a==0){
            j=0;
            for (Manager employee : managerEmployees) {
                if (nname.equals(employee.getName())) {
                    a = 1;
                    employee.setName(nname);
                    System.out.println("input new oklad: ");
                    employee.setOklad(in.nextDouble());
                    System.out.println("input new sails in month: ");
                    employee.setMonthSails(in.nextDouble());
                    System.out.println("input new sails in year: ");
                    employee.setYearSails(in.nextDouble());
                    System.out.println("input new pursent: ");
                    employee.setPersent(in.nextDouble());
                    managerEmployees.set(j, employee);
                }
                j++;
            }
        }
        if (a==0){
            j=0;
            for (Executive employee : executiveEmployees) {
                if (nname.equals(employee.getName())) {
                    a = 1;
                    employee.setName(nname);
                    System.out.println("input new oklad: ");
                    employee.setOklad(in.nextDouble());
                    System.out.println("input new profit in month: ");
                    employee.setMonthProfit(in.nextDouble());
                    System.out.println("input new profit in year: ");
                    employee.setYearProfit(in.nextDouble());
                    System.out.println("input new pursent: ");
                    employee.setPersent(in.nextDouble());
                    executiveEmployees.set(j, employee);
                }
                j++;
            }
        }
        if (a==0){
            System.out.println("This employee is not exist");
        }

    }
    //printing of employees and their parameters
    private static void printEmployees(){
        for (HourlyEmployee employee : hourlyEmployees) {
            System.out.println(employee.toString());
        }
        for (SalariedEmployee employee : salariedEmployees) {
            System.out.println(employee.toString());
        }
        for (Manager employee : managerEmployees) {
            System.out.println(employee.toString());
        }
        for (Executive employee : executiveEmployees) {
            System.out.println(employee.toString());
        }
    }
    //printing of employees and their salaries
    private static void listOfSalaries(){
        for (HourlyEmployee employee : hourlyEmployees) {
            System.out.println(employee.printSalaries());
        }
        for (SalariedEmployee employee : salariedEmployees) {
            System.out.println(employee.printSalaries());
        }
        for (Manager employee : managerEmployees) {
            System.out.println(employee.printSalaries());
        }
        for (Executive employee : executiveEmployees) {
            System.out.println(employee.printSalaries());
        }
    }
    //summ and aver salaries
    private static void sumAndOver(){
        int quantity=hourlyEmployees.size()+salariedEmployees.size()+managerEmployees.size()+executiveEmployees.size();
        double mes=0;
        double ye=0;
        for (HourlyEmployee employee : hourlyEmployees) {
            mes+=employee.getMonthSalary();
            ye+=employee.getYearSalary();
        }
        for (SalariedEmployee employee : salariedEmployees) {
            mes+=employee.getMonthSalary();
            ye+=employee.getYearSalary();
        }
        for (Manager employee : managerEmployees) {
            mes+=employee.getMonthSalary();
            ye+=employee.getYearSalary();
        }
        for (Executive employee : executiveEmployees) {
            mes+=employee.getMonthSalary();
            ye+=employee.getYearSalary();
        }
        System.out.println("| Quantity of employees: "+quantity+" || summ month salary: "+mes+" || summ year salary: "+
                ye+" || average month salary: "+mes/quantity+" || average year salary: "+ye/quantity+" |");
    }
    //summ and aver salaries in a group
    private static void sumAndOverGroup(){
        Scanner in =new Scanner(System.in);
        System.out.println("input type of group: (1 - hourly, 2 - salaried, 3 - manager, 4 - executive)");
        int type = in.nextInt();
        int quantity=0;
        double mes=0;
        double ye=0;
        switch (type){
            case 1:
                quantity=hourlyEmployees.size();
                for (HourlyEmployee employee : hourlyEmployees) {
                    mes+=employee.getMonthSalary();
                    ye+=employee.getYearSalary();
                }
                break;
            case 2:
                quantity=salariedEmployees.size();
                for (SalariedEmployee employee : salariedEmployees) {
                    mes+=employee.getMonthSalary();
                    ye+=employee.getYearSalary();
                }
                break;
            case 3:
                quantity=managerEmployees.size();
                for (Manager employee : managerEmployees) {
                    mes+=employee.getMonthSalary();
                    ye+=employee.getYearSalary();
                }
                break;
            case 4:
                quantity=executiveEmployees.size();
                for (Executive employee : executiveEmployees) {
                    mes+=employee.getMonthSalary();
                    ye+=employee.getYearSalary();
                }
                break;
            default:
                System.out.println("This group is not exist");
                return;
        }
        System.out.println("| Quantity of employees: "+quantity+" || summ month salary: "+mes+" || summ year salary: "+
                ye+" || average month salary: "+mes/quantity+" || average year salary: "+ye/quantity+" |");
    }
}
