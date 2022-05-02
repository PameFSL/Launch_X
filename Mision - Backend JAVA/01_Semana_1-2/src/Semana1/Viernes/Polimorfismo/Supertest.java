package Semana1.Viernes.Polimorfismo;

 class Animal {
    String color = "BLANCO";
}


class Gato extends Animal{
    String color = "Cafe";
    void  printColor(){
        System.out.println( "Color gato: " +color);

        //Accede al valor de la clase padre
        System.out.println("Color animal: "+super.color);
    }
}

public class Supertest {
    public static void main(String[] args) {
        Gato gato1 = new Gato();
        gato1.printColor();
    }
}
