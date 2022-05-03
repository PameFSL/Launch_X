package Semana1.Viernes;

public class Emp {
    double salario = 40000;
}

class Programadora extends Emp{
    int bono = 1000;

    // Se redefine el metodo main
    public void main (){
        Programadora fer = new Programadora();
        System.out.println("El salario de la programadora es: " + fer.salario);

        System.out.println("El bono de la programadora es "+ fer.bono);
    }

    void mensaje(){
        System.out.println("soy programadora");
        main();
    }
}



//Clase principal: Web ya tiene salario, bono. Tiene main y mensaje ya que es extends
class Web extends Programadora{
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }
}