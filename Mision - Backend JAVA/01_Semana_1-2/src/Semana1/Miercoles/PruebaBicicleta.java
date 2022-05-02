package Semana1.Miercoles;

public class PruebaBicicleta {

    public static void main (String[] args){
        def();
    }

    public static void  def(){
        // Se crea un objeto utilizando la clase bicicleta
        // Utiliza el constructor por omision
        Bicicleta biciMountain = new Bicicleta();

        //Se inicializa el objeto
        biciMountain.setColor("red");
        biciMountain.setPins(6);
        biciMountain.setRodada(13);
        biciMountain.setVelocidad(120.3);

        //Obtiene los valores del objeto y crea mensaje
        String msg = "\nCaracteristicas de la bici de montaña: \n";
        msg += "\nColor: " +biciMountain.getColor();
        msg += "\nVelocidad: " +biciMountain.getVelocidad();
        msg += "\nRodada: " +biciMountain.getRodada();
        msg += "\nPins: " +biciMountain.getPins()+"\n";

        //sout
        System.out.print(msg);
    }

}
