package Semana1.Viernes;

public class MountainBike {
    //psvm
    public static void main(String[] args) {
        show();
    }

    public static void  show(){
        Bike b = new Bike("Azul", 6);
        System.out.println("Color: "+ b.getColor());
        System.out.println("Velocidad: "+ b.getVelocidad());
    }

}
