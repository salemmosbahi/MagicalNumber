/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicalnumber;

/**
 *
 * @author stuart
 */
public class DisplayMagicalNumber {
    
    public void displayMagicalNumber(int pIMin, int pIMax) {
        
        if (pIMin == pIMax) {
            
            display("The two integers are equal");
            
        } else if (pIMin > pIMax) {
            
            magicalNumber(pIMax,pIMin);
            
        } else {
            
            magicalNumber(pIMin,pIMax);
            
        }
    }
    
    public void magicalNumber(int pIMin, int pIMax) {
        
        display("****-->Start<--****");
        
        int tIDisplay = pIMin;
        while (tIDisplay <= pIMax) {
            
            if (((tIDisplay % 3) == 0) && ((tIDisplay % 5) == 0)) {
                display("H"); display("S");
            } else if ((tIDisplay % 3) == 0) {
                display("H");
            } else if ((tIDisplay % 5) == 0) {
                display("S");
            } else {
                display(tIDisplay + "");
            }
            tIDisplay++;
        }
        
        display("****-->End<--****");
    }
    
    public void display(String pSMsg) {
        
        System.out.println(pSMsg);
    }
}
