package Semana2.Lunes;

abstract class  Mountain {
    Mountain (){
        //Cada que se cree una de montaña nos mostrará el mensaje
        System.out.println("Se he creado una bicicleta de montaña\n");
    }
    abstract void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("cambiando color a rojo");
    }
}


class Magistroni extends Mountain{
    //Traes un metodo abstracto y se necesita implementar lo que hace
    void  cambiarVelocidad(){
        System.out.println("Se deben desbloquear las perillas del manubrio primero");
    }

}

public class Bicicleta {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bici1 = new Magistroni();

        Bicicleta bici2 = new Bicicleta();

        bici1.cambiarVelocidad();
        bici1.cambiarColor();

        bici2.cambiarVelocidad();
    }

}
