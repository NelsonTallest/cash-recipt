/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Ebsuvilla
 */
public class Developer  extends Employee{
    
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Developer coding...");
    }
    
}
