
package taller;

import java.util.Random;

public class Taller {
    private static int descampado = 50;
    private static final Cabina cabina = new Cabina();
    private final Random random = new Random();
    
    public void pintar(String name) {
        //se especifica tiempo de trabajo
        int tiempo = random.nextInt(15000, 30001);
        synchronized (cabina) {
            System.out.println(name + " trabajando en la cabina");
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
            System.out.println("Finalizado el trabajo de pintura en " + (tiempo/1000) + " mins.");
            descampado--; // descontado vehiculo de la campa
            System.out.println("Quedan, " + descampado + " vehiculos por atender.");
        }
        desansar(tiempo, name);
    }
    
    public void desansar(int tiempo, String name) {
        try {
            System.out.println(name + " esta descansando " + (tiempo/1000) + " mins.");
            Thread.sleep(tiempo);
            System.out.println(name + " finaliza su tiempo de descanso.");
        } catch (InterruptedException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public int getDescampado() {
        return descampado;
    }
    
}
