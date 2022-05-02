package Semana2.Viernes;

public class MultiTask extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea uno");
    }

  /*  public static void main(String[] args) {
        MultiTask t1 = new MultiTask(),
                  t2 = new MultiTask(),
                 t3= new MultiTask();
        t1.start();
        t2.start();
        t3.start();
    }*/
}


class MultiTasking implements Runnable{
    @Override
    public void run() {
        System.out.println("Tarea 1 runnable");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiTasking());
        Thread t2 = new Thread(new MultiTasking());

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        t1.start();
        t2.start();

        task1.start();
        task2.start();
    }
}

class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println( " Tarea A runnable");
    }
}


class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println( " Tarea B runnable");
    }
}