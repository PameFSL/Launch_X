package Semana2.Viernes;

public class TestJoin extends Thread{
    @Override
    public void run() {
        for(int i = 1; i<=5 ; i++){
            try{
                Thread.sleep(500);

            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestJoin t1 = new TestJoin(),
                t2 = new TestJoin(),
                t3 = new TestJoin();
        showDetails (t1,t2,t3);

        t1.start();
        try{
            t1.join(1500);
            t1.setName("LaunchX");
            t1.setPriority(MAX_PRIORITY);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        t2.start();
        t3.start();

        showDetails (t1,t2,t3);
    }
    public static void showDetails (TestJoin t1, TestJoin t2, TestJoin t3){
        System.out.println("Hilo 1: "+t1.getName()+ " Estado: "+ t1.getState() + " Id: "+ t1.getId()
                +" Prioridad: " +t1.getPriority());
        System.out.println("Hilo 2: "+t2.getName()+ " Estado: "+ t2.getState() + " Id: "+ t2.getId()
                +" Prioridad: " +t2.getPriority());
        System.out.println("Hilo 3: "+t3.getName()+ " Estado: "+ t3.getState() + " Id: "+ t3.getId()
                +" Prioridad: " +t3.getPriority());
    }
}
