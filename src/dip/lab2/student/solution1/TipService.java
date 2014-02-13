/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2.student.solution1;

/**
 *
 * @author gcorcoran
 */
public class TipService {
    
    public TipService(ServiceQuality quality, TipCalculator calc){
        System.out.println("The tip is " +calc.getTip(quality.getRate()));
    }
    
}
