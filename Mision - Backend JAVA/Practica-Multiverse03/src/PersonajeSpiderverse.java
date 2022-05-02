public class PersonajeSpiderverse {

    private String spiderman;
    private String nombre;
    private  String tierraOrigen;
    private String habilidades;

    PersonajeSpiderverse (){}

    PersonajeSpiderverse ( String spiderman, String nombre, String tierraOrigen){
        this.spiderman = spiderman;
        this.nombre = nombre;
        this.tierraOrigen = tierraOrigen;
        this.habilidades = "Fuerza sobrehumana, Velocidad, Agilidad, Resistencia, Factor de curación, Sentido arácnido  y Piel adherente" ;
    }

    // ------- Inicio setters ---------------
    public boolean setSpiderman(String spiderman) {
        if (!spiderman.isEmpty()){
            this.spiderman = spiderman;
            return true;
        } else
            return false;
    }

    public boolean setNombre (String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }
        else
            return false;
    }

    public  boolean setTierraOrigen (String tierraOrigen){
        if (!tierraOrigen.isEmpty()){
            this.tierraOrigen = tierraOrigen;
            return true;
        } else
            return false;
    }

    public boolean setHabilidades (String habilidades){
        if (!habilidades.isEmpty()){
            this.habilidades = habilidades;
            return true;
        } else
            return false;
    }

    // ------- fin setters ---------------


    // ------- Inicio getters ---------------
    public String getSpiderman(){ return spiderman; }
    public String getNombre (){ return nombre; }
    public String getTierraOrigen(){return tierraOrigen;}
    public String getHabilidades(){return habilidades;}
    // ------- fin getters ---------------

    public String showMessage(){
        return "Spiderman: " + spiderman +
                "\nNombre: " + nombre +
                "\nTierra Origen: " + tierraOrigen +
                "\nHabilidades: " +habilidades +"\n \n";
    }
}
