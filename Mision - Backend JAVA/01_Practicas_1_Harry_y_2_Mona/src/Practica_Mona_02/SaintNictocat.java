package Practica_Mona_02;

public class SaintNictocat extends Mona {
    private double largoBarba;
    private int regalosXminuto;


    public SaintNictocat (){}

    public SaintNictocat (String role, String accesorio){
        super( role, accesorio);
    }

    public SaintNictocat (String role, String accesorio, double largoBarba, int regalosXminuto ){
        super( role, accesorio);
        this.largoBarba = largoBarba;
        this.regalosXminuto = regalosXminuto;
    }

    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("Largo barba: "+largoBarba+ "\n" + "Regalos entregados por minuto: "
                           + regalosXminuto + " regalos/minuto");
    }

    public void entrgarRegalos(){
        System.out.println("\nComienza la entrega de regalos :D ");
    }

}
