
package taller;

public class Pintor extends Thread {
    private final Taller taller;

    public Pintor(Taller taller, String name) {
        super(name);
        this.taller = taller;
    }    
    

    @Override
    public void run() {
        while (taller.getDescampado() > 0) {
            //mientras existan coches en el descampado
            taller.pintar(this.getName());
        }
        System.out.println(this.getName() + " finaliza turno al acabarse los coches.");
    }
    
}
