package hilos;
// Hilo creado implementando la interfaz Runnable
public class HiloRunnable implements Runnable {

    @Override
    public void run() {
        // imprimimos 5 veces que es el hilo runnable
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo Runnable");
        }
    }
}
