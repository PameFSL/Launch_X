package Practica_Harry_01;

public class TestMago {
    public static void main(String[] args) {
        Mago Harry = new Mago("Harry Potter", "Gryffindor" ,
                "Dementor", "Ciervo", 'M' );
        Harry.imprimeAtributos();

        Mago Snape = new Mago("Severus Snape", 'M',
                "Slytherin","Lord Voldemort");
        Snape.imprimeAtributos();

        Mago Sybill = new Mago("Sybill Trelawney", "Ravenclaw", "incorpóreo", 'F');
        Sybill.imprimeAtributos();

        Mago Cedric = new Mago ("Cedric Diggory", 'H' , "Hufflepuff");
        Cedric.imprimeAtributos();

        Mago Artemisia = new Mago("Artemisia Lufkin");
        Artemisia.imprimeAtributos();

        Mago Empy = new Mago ();
        Empy.imprimeAtributos();
    }
}
