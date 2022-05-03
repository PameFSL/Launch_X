package Semana1.Miercoles;

// Clase para definir un objeto de tipo bicicleta
public class Bicicleta {
    // Se crean variables para almacenar los valores de las caracteristicas
    // (propiedades del objeto)
    public int pins, rodada;
    public double velocidad;
    public String color;

    //Metodos
    public double getVelocidad( ) { return velocidad; }
    public int getPins () { return pins; }
    public int getRodada(){ return rodada; }
    public String getColor(){return color;}

    public boolean setPins(int pins){
        if (pins>0){
            this.pins = pins;
            return true;
        } else
            return false;
    }

    public boolean setRodada(int rodada){
        if (rodada>0){
            this.rodada = rodada;
            return true;
        } else
            return false;
    }

    public boolean setVelocidad (double velocidad) {
        if (velocidad >= 0 ) {
            this.velocidad = velocidad;
            return true;
        } else
            return false;
    }


    public boolean setColor (String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        } else
            return false;
    }

    // ----- Fin de clase pura -----------

    public String printState(){
        return "pins: "+ pins +"\n"+
                "rodada: "+ rodada +"\n"+
                "velocidad: " +velocidad +"\n" +
                "color: " + color;
    }

}
