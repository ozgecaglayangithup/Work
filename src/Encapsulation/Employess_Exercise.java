package Encapsulation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Employess_Exercise {
    public static void main(String[] args) {


        /*
        Create 3 companies
        Name, address, phoneNumber
        Tesla, California, 123
        USBank, Minnesota, 000
        Verizon, Texas , 111
        Create 10 employees
         */


        Company c1 = new Company("Tesla", "California", "123");
        Company c2 = new Company("USBank" , "Minnesota", "000");
        Company c3 = new Company("Verizon", "Texas", "111");

        /*
        Create 10 employees
        fullName, jobPosition, age, company

        */

        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Andrii","Developer", 25, c1),
                new Employee("Yildiz","System Architect", 23, c2),
                new Employee("Malek","Developer", 30, c3),
                new Employee("Saeed","Manager",35 ,c3),
                new Employee("Samir", "Tester",20, c2),
                new Employee("Viktoriya", "Designer",30 ,c1),
                new Employee("Ibrahim", "Designer",27 ,c1),
                new Employee("Jeremiah", "Scrum Master", 21 , c2),
                new Employee("Olena","Tester", 29, c3),
                new Employee("Yoanna","Tester", 23, c1)
        ));

/*
Write a program to find and report below information

Employee numbers for each company
Tesla = 4
UsBank = 3
Verizon = 3

Employee numbers for each position

Tester = 3
Developer= 2
Manager = 1
Designers = 2
System Architect =  1
Scrum Master = 1

Find youngest
Youngest tester = Samir with the age of 20
Youngest developer = Andrii with the age of 25
Youngest designer = Ibrahim with the age of 27

Find the company
Manager = Saeed works at Verizon
System Architect = Yildiz works at USBank
Scrum Master = Jeremiah works at USBank



 */

        int teslaEmployees = 0 , usBankemployees = 0, verizonEmployees = 0;
        int tester = 0,  developer = 0, manager = 0, designers = 0, systemArch = 0, scrumMaster = 0;


        Employee managerEmployee = null;
        Employee systemArchitectEmployee = null;
        Employee scrumMasterEmployee = null;

        Employee youngestDev = new Employee();
        Employee youngestTester = new Employee();
        Employee youngestDesigner = new Employee();

        youngestDev.setAge(Integer.MAX_VALUE);
        youngestDesigner.setAge(Integer.MAX_VALUE);
        youngestTester.setAge(Integer.MAX_VALUE);

        for (Employee employee : employees) {

            if (employee.getJobPosition().equals("Tester") && employee.getAge() < youngestTester.getAge()) youngestTester = employee;
           else if (employee.getJobPosition().equals("Developer") && employee.getAge() < youngestDev.getAge()) youngestDev = employee;
           else if (employee.getJobPosition().equals("Designer") && employee.getAge() < youngestDesigner.getAge()) youngestDesigner = employee;

           // Second way

            youngestTester = employees.stream().filter(
                    e -> e.getJobPosition().equals("Tester")).min(Comparator.comparingInt(Employee::getAge)).get();
            youngestDev = employees.stream().filter(
                    e -> e.getJobPosition().equals("Developer")).min(Comparator.comparingInt(Employee::getAge)).get();
            youngestDesigner = employees.stream().filter(
                    e -> e.getJobPosition().equals("Designer")).min(Comparator.comparingInt(Employee::getAge)).get();





           if (employee.getCompany().getName().equals("Tesla")) teslaEmployees++;
            else if (employee.getCompany().getName().equals("USBank")) usBankemployees++;
            else verizonEmployees++;

            switch (employee.getJobPosition()) {
                case "Tester":
                    tester++;
                    break;
                case "Developer":
                    developer++;
                    break;
                case "Manager":
                    manager++;
                    break;
                case "Designer":
                    designers++;
                    break;
                case "System Architect":
                    systemArch++;
                    break;
                default:
                    scrumMaster++;
                    break;
            }

           if (employee.getJobPosition().equals("Manager")) managerEmployee = employee;
           else if (employee.getJobPosition().equals("System Architect")) systemArchitectEmployee = employee;
           else if (employee.getJobPosition().equals("Scrum Master")) scrumMasterEmployee = employee;
        }
        System.out.println("Employee numbers for each company");
        System.out.println("Tesla = " + teslaEmployees);
        System.out.println("USBank = " + usBankemployees);
        System.out.println("Verizon = " + verizonEmployees);

        System.out.println("Employee numbers for each position");
        System.out.println("Tester = " + tester);
        System.out.println("Developer = " + developer);
        System.out.println("Manager = " + manager);
        System.out.println("Designer = " + designers);
        System.out.println("System Architecture = " + systemArch);
        System.out.println("Scrum Master = " + scrumMaster);

        System.out.println("Find the company");
        System.out.println(scrumMasterEmployee.getJobPosition() + " = " + scrumMasterEmployee.getFullName() + " works at " + scrumMasterEmployee.getCompany().getName());
        System.out.println(systemArchitectEmployee.getJobPosition() + " = " + systemArchitectEmployee.getFullName() + " works at " + systemArchitectEmployee.getCompany().getName());
        System.out.println(managerEmployee.getJobPosition() + " = " + managerEmployee.getFullName() + " works at " + managerEmployee.getCompany().getName());


        System.out.println("Find the youngest");

        System.out.println(youngestTester);
        System.out.println(youngestDesigner);
        System.out.println(youngestDev);




    }
}
