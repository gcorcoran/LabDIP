/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author Pip
 */
public interface TipCalculator {

    ServiceQuality getServiceQuality();

    double getTip();

    void setBill(double billAmt);

    
    
}
