package Practica_Mona_02;

public class Spidertocat extends Mona{

    public Spidertocat(){}

    public Spidertocat(String role, String accesorios ){ super(role, accesorios);}

    public  void  activateSpiderSenseAlert(){
        System.out.println("Spider sense activado. Cuidado!!! ");
    }

    public void startWallcrawling(){
        System.out.println( "\n" + super.getNombre() + " " +super.getRole() + " Comenzará a trepar por la pared");
    }

    public void throwSpiderWeb(){
        System.out.println( super.getNombre() + " " +super.getRole() + " Lanza telaraña");
    }


}
