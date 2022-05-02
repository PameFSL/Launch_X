package Practica_Mona_02;

public class Hulatocat extends Mona {

    public Hulatocat (){}

    public  Hulatocat (String role, String accesorio){
        super( role, accesorio);
    }

    public void hulaDance (){
        System.out.println( "\n" +super.getNombre() + " " +super.getRole() +
                            " bailando Mele No Lilo");
    }

    public void playUkelele (){
        System.out.println(  super.getNombre() + " " + super.getRole() +
                            " tocando ukelele");
    }

}
