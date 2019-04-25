
package utspbo;


public class main {

    
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
