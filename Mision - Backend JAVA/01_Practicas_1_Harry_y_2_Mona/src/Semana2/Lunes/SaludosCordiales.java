package Semana2.Lunes;

abstract class Hola{
    //clase que saluda con dos metodos uno que sabemos como nos lo dará y el otro que desconocemos como lo hace
    void saludar(){
        System.out.println("Hola,  ¿cómo estás?, te ves bien eh");
    }

    //No sabemos como saluda
    abstract void saludo();
    /*void show();  // No lo acepta, no sabe que es abstracto */
}

interface Mostrar{
    //indicamos como será el segundo saludo
    //Nos dice por donde, pero no nos dice como
    // TODOS los metodos son abstractos
    void show();
    abstract void  despide();
}

public class SaludosCordiales implements Mostrar{
    public void show(){
        System.out.println("Hola, ¿como estas?, espero no del todo mal ....");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();
        saludo1.despide();

    }

    @Override
    public void despide() {
        System.out.println("Gracias, no");
    }
}
