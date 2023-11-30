/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 11
 */
public class BMI {
    
    static void CalculateBMI(float weight, float height){
        float bmi = (100 * 100 * weight) / (height * height);
        
        System.out.println("\nYour BMI value : " + bmi);
        
        if(bmi <= 18.5)
            System.out.println("You are underweight");
        else if(bmi <=22.9)
            System.out.println("You are normal");
        else if(bmi <= 24.9)
            System.out.println("You are risk to overweight");
        else if(bmi <= 29.9)
            System.out.println("You are overweight");
        else
            System.out.println("You are obese");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("BMI CALCULATOR");
        System.out.print("Enter your height (cm) : ");
        float height = sc.nextFloat();
        System.out.print("Enter your weight (kg) : ");
        float weight = sc.nextFloat();
        
        CalculateBMI(weight, height);
    }
    
}
