
package utspbo;


public class komputer {
     private CPU cpu;
    
    public komputer (CPU cpu){
    this.cpu=cpu;
    }
    
    public komputer(){
    }
    
    public void memasang (CPU cpu){
    this.cpu=cpu;
    System.out.println("CPU: "+this.cpu.getCPUData()+ " GHz"+" dipasang");
    }
    
    public void mencabut (CPU cpu){
    //this.cpu=cpu;
    System.out.println("Spesifikasi: "+this.cpu.getCPUData()+ "AMD"+" GHz");
    }
    
    public void cetakInfo(){
        System.out.println("Spesifikasi: "+this.cpu.getCPUData()+" GHz");
    
    }
}
