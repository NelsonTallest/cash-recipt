/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Smith", 5000.0);
        Manager mgr1 = new Manager("Jane Doe", 8000.0);
        Developer dev1 = new Developer("Mark Johnson", 6000.0);

        Employee[] employees = { emp1, mgr1, dev1 };

        for (Employee employee : employees) { 
            System.out.println("Name: " + employee.getName());
            System.out.println("Salary: " + employee.getSalary());
            employee.work();
            System.out.println();
        }
    }
}