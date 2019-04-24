/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author acer
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Intel intel1 = new Intel(3);
        AMD amd1 = new AMD(3);
        komputer komputer1 = new komputer(amd1);
      
        komputer1.cetakInfo();
        komputer1.memasang(intel1);
        komputer1.mencabut(amd1);
        komputer1.cetakInfo();
                
    
    }
    
}
