
package taller;

public class Main {

    public static void main(String[] args) {
        Taller taller = new Taller();
        Pintor juan = new Pintor(taller, "Juan");
        Pintor pepe = new Pintor(taller, "Pepe");
        Pintor manu = new Pintor(taller, "Manu");
        
        juan.start();
        pepe.start();
        manu.start();
    }
    
}
