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
public class Subtraction extends AbstractCalculation{

    @Override
    public double calculation(double x, double y) {
        return x-y;
    }
    
    
}
