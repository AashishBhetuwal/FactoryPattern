/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FactoryPattern.abstractcalculation;

import com.leapfrog.FactoryPattern.abstractcalculation.abstractcalculate.AbstractCalculation;

/**
 *
 * @author Toshiba
 */
public class MathsGroup {
    
    public static AbstractCalculation get(int a){
        if(a==1)
        {
            return new Addition();
        }
        else if(a==2){
            return new Subtraction();
        }
        
        else if(a==3){
            return new multiplication();
        }
        else if(a==4){
            return new Power();
        }
        
        else if(a==5){
            return new Division();
        }
        
        else if(a==6)
        {
              return new exit();
        }
        
        return null;
    }
    
    
    
}
