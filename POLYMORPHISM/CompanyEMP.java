//Employee polymorphism with Bonus rule.
package POLYMORPHISM;

import java.util.Scanner;

class Employee1 {
    double baseSalary;

    Employee1() {
    } // default constructor

    Employee1(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    double calculateSalaryemp() {
        return baseSalary;
    }
}

class Manager1 extends Employee1 {
    @Override
    double calculateSalaryemp() {
        return baseSalary + (0.2 * baseSalary);
    }
}

class Intern extends Employee1 {
    @Override
    double calculateSalaryemp() {
        return baseSalary;
    }
}

class Developer extends Employee1 {
    double projectBonus;

    @Override
    double calculateSalaryemp() {
        return baseSalary + projectBonus;
    }
}

class CompanyEMP {
    double totalSalary(Employee1[] employees1) {
        double total = 0;
        for (int i = 0; i < employees1.length; i++) {
            total += employees1[i].calculateSalaryemp();
        }
        return total;
    }

    public static void main(String XYZ[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter no of employees:");
        int n = sc.nextInt();
        Employee1[] employees1 = new Employee1[n];
        int i = 0;
        while (i < n) {
            System.out.println("Enter type 1=Manager");
            System.out.println("Enter type 2=Intern");
            System.out.println("Enter type 3=Developer");
            int type = sc.nextInt();
            switch (type) {
                case 1: {
                    employees1[i] = new Manager1();
                    System.out.println("Enter the Base Salary of Employee:");
                    employees1[i].baseSalary = sc.nextDouble();
                    break;
                }
                case 2: {
                    employees1[i] = new Intern();
                    System.out.println("Enter the Stiped");
                    employees1[i].baseSalary = sc.nextDouble();
                    break;
                }
                case 3: {
                    Developer d = new Developer();
                    System.out.println("Enter the base salary:");
                    d.baseSalary = sc.nextDouble();
                    System.out.println("Enter the projectBonus of Developer:");
                    d.projectBonus = sc.nextDouble();
                    employees1[i] = d;
                    break;
                }
                default: {
                    System.out.println("Enterd Choice or type is default!");
                    i--;
                    break;
                }
            }
            i++;
        }
        CompanyEMP obj = new CompanyEMP();
        double total = obj.totalSalary(employees1);

        System.out.println("Total Salary of all employees: " + total);
    }
}