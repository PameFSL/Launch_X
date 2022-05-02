package Semana2.Viernes;
/*
public class HilosT extends Thread{

    // Entra el estado runnable, establecemos accion del hilo. (¿Que se va a hacer? )
    public void run(){
        System.out.println("El hilo se está ejecutando ");
    }

    public void start(){
        // Inicia la ejecicion del hilo
        // JVM llama al metodo run del hilo
    }

    sleeep detiene de manera temporal el numero especificado
    join () - Espera a que el hilo se muera
    getpriority: Regresa la prioridad del hilo
    getname: Obtiene el nombre del hilo
    currentThreat - Referencia al hilo que se está ejecutando
    getId - regresa id del hilo
    isAlive: pregunta si sigue vivo


    public static void main(String[] args) {
        // Comienza el ciclo de vida de mi hilo
        HilosT hilo = new HilosT(); // Entra a state new

        hilo.start(); //Espera ejecución y se manda a llamar el metodo run
    }
}
        */


class HilosR implements Runnable {
    public void run(){
        System.out.println("El hilo de runnable esta corriendo");


    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }
}