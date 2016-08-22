/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FactoryPattern;
import com.leapfrog.FactoryPattern.abstractcalculation.abstractcalculate.AbstractCalculation;
import com.leapfrog.FactoryPattern.abstractcalculation.MathsGroup;
import java.util.Scanner;
/**
 *
 * @author Toshiba
 */
public class mathcalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first numbers:");
        double x=sc.nextDouble();
        System.out.println("Please enter second number");
        double y=sc.nextDouble();
        double total = 0;
        System.out.println("Please enter your choice:");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Power");
         System.out.println("5: Division");
        int choice=sc.nextInt();
        
        AbstractCalculation abs= MathsGroup.get(choice);
        
       
        if(abs!=null)
        {
            total=abs.calculation(x,y);
            
        }
        System.out.println(total);
        }

    }
    

