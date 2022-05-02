package Semana1.Viernes;
/*
*   Overload: Sobrecarga (Puede ocurrir en una sola clase)
*   Override: Redefine (un metodo en la misma clase pero con diferente comportamiento)
*   Overwrite: Sobreescribe
* */


public class Bike {
    private int velocidad;
    private String color,marca;

    // -------- INICIO EJEMPLO Sobrecarga del constructor -------------------------------
    // Constructor por omision: Si se omite, no se puede utilizar Bike b = new Bike () , ya que nos pediría valores de inicio
    public Bike (){}

    public  Bike (String color){ this.color = color; }

    public Bike (String color, int velocidad) {
        this.color = color;
        this.velocidad = velocidad;
    }

    public Bike (String color, String marca, int velocidad) {
        this.color = color;
        this.velocidad = velocidad;
        this.marca = marca;
    }

    // -------- FIN EJEMPLO Sobrecarga del constructor -------------------------------

    public  int getVelocidad( ) {return velocidad;}

    public  String getMarca() {return  marca;}

    public String getColor(){return color;}



}
