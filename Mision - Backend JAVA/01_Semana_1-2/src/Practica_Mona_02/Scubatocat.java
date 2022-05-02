package Practica_Mona_02;

public class Scubatocat extends Mona{
    private float velocidad;

    public Scubatocat (){}

    public Scubatocat (String role, String accesorio){
        super( role, accesorio);
    }

    public Scubatocat (String role, String accesorio, float velocidad){
        super( role, accesorio);
        this.velocidad = velocidad;
    }

    public void startScubaDiving (){
        System.out.println( "\n" + super.getNombre() + " " +super.getRole() +
                " comienza buceo ...\nEntrando al agua ....");
    }

    public void activateMaximumSpeed (){
        System.out.println( super.getNombre() + " " +super.getRole() +
                " Activa maxima velocidad ");
    }

    public void showMessage(){
        super.showMessage();
        System.out.println("Velocidad al bucear: "+velocidad + " Km/h");
    }

}
