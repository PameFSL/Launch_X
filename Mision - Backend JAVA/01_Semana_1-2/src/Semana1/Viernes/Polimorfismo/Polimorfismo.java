package Semana1.Viernes.Polimorfismo;
class Bike2{
    void run(){
        System.out.println("running .....");
    }
}


public class Polimorfismo extends  Bike2 {
    @Override
    void run() {
        System.out.println("correr class polimorfismo");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Polimorfismo();
        bike2.run();
    }
}
