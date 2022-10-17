package hilos;
// Hilo creado extendiendo la clase Thread
public class HiloThread extends Thread {

    private String nombre;

    // Constructor por defecto
    public HiloThread() {
        // con este this (y un solo argumento) llamo al constructor con parametro de la claase
        this("Hilo Thread");
    }

    // Le ponemos un constructor para asignarle un nombre
    public HiloThread(String nb) {
        this.nombre = nb;
    }

    // Es necesario sobreescribir el metodo run
    @Override
    public void run() {
        // Imprimimos el nombre 5 veces (hilo Thread)
        for (int i = 1; i <= 20; i++) {
            System.out.println(nombre);
        }
    }

}
