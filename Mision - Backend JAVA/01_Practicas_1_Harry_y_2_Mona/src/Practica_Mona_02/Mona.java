package Practica_Mona_02;

public class Mona {
    private String nombre = "Mona";
    private int no_tentaculos = 5;
    private String role;
    private String accesorios;

    public Mona (){};

    public Mona ( String role, String accesorios ){
        this.role = role;
        this.accesorios = accesorios;
    }

    public String getNombre(){ return nombre; }

    public String getRole() { return  role; }

    public void  showMessage (){
        System.out.println("\n*********************************************** ");
        System.out.println("Nombre: "+nombre +"\nNo. tentaculos: " + no_tentaculos + "\nRole: " + role
                         + "\nAccesorios: " +accesorios);
    }

}
