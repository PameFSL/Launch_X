package Practica_Harry_01;

public class Mago {
    private String nombre, casa, boggart, patronus ;
    private char genero;


    /*------ Sobrecarga de contrucción ---------- */
    // Constructor por omision
    public Mago (){};

    public Mago (String nombre){
        this.nombre = nombre;
    }


    public Mago (String nombre, char genero, String casa){
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.patronus = "no value";
        this.boggart="no value";
    }

    public Mago (String nombre, String casa, String boggart){
        this.nombre = nombre;
        this.casa = casa;
        this.boggart = boggart;
    }


    public Mago (String nombre, char genero, String casa, String boggart){
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.boggart = boggart;
    }

    public Mago (String nombre, String casa, String patronus, char genero){
        this.nombre = nombre;
        this.casa = casa;
        this.genero = genero;
        this.patronus = patronus;
    }

    public Mago (String nombre, String casa, String boggart, String patronus){
        this.nombre = nombre;
        this.casa = casa;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public Mago (String nombre, String casa, String boggart, String patronus, char genero){
        this.nombre = nombre;
        this.casa = casa;
        this.boggart = boggart;
        this.patronus = patronus;
        this.genero = genero;
    }
    /*------ Fin Sobrecarga de contrucción ---------- */

    public String getNombre() { return nombre; }

    public char getGenero() { return genero; }

    public String getCasa () { return casa; }

    public String getBoggart() { return boggart; }

    public String getPatronus () { return patronus; }

    // Funcion para imprimir los valores

    public void imprimeAtributos (){
        System.out.println("************ Caracteristicas del mago ************");
        System.out.println (" Nombre: "+ nombre +
                            "\n Genero: " + genero +
                            "\n Casa: " + casa +
                            "\n Boggart: " + boggart +
                            "\n Patronus: " + patronus+ "\n");
    }

}

