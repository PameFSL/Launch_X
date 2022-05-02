package Semana2.Lunes;



//Para realizar una clase abstracta debemos de concentrarnos en que hace
abstract class Sombra{

    // Si no agregamos abstrac, nos marcará warning ya que no se ha definido nada
     abstract void dibujarSombra();

}
class  Arma extends Sombra{
    void dibujarSombra(){
        System.out.println("Dibujando sombra en el arma color azul");
    }
}

public class Personaje extends Arma{
    public static void main(String[] args) {
        Sombra flecha = new Personaje();
        Sombra arco = new Arma();

        // Dibuja sombra blanca
        flecha.dibujarSombra();
        //Dibuja sombra azul
        arco.dibujarSombra();
    }
    void dibujarSombra(){
        System.out.println("Dibuja sombra blanca");
    }
}
