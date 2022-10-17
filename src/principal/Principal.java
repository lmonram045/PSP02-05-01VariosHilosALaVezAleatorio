package principal;

import hilos.HiloRunnable;
import hilos.HiloThread;

public class Principal {
    public static void main(String args[]) {
        // Creamos 2 hilos del tipo HiloThread usando sus 2 constructores
        HiloThread hiloThread1 = new HiloThread("Hilo 1");
        HiloThread hiloThread2 = new HiloThread();

        // Creamos hilo Runnable
        Thread hiloRunnable = new Thread(new HiloRunnable());

        // ejecutamos los 3 hilos

        hiloThread1.start();
        hiloThread2.start();
        hiloRunnable.start();
    }
}
