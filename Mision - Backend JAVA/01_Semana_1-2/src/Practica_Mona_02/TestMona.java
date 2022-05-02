package Practica_Mona_02;

public class TestMona {
    public static void main(String[] args) {
        // Hulatocat
        Hulatocat monaHula = new Hulatocat ("Hulatocat", "Falda y ukelele");
        monaHula.showMessage();
        monaHula.hulaDance( );
        monaHula.playUkelele();

        // Scubatocat
        Scubatocat monaScuba = new Scubatocat ( "Scuba Diving", "Equipo de buceo y traje de baño", 24 );
        monaScuba.showMessage();
        monaScuba.startScubaDiving();
        monaScuba.activateMaximumSpeed();

        // SaintNictocat
        SaintNictocat monaSanta = new SaintNictocat("SaintNictocat", "Gorro rojo, traje de Santa y regalos"
                        , 15.3, 13);
        monaSanta.showMessage();
        monaSanta.entrgarRegalos();

        // Spidertocat
        Spidertocat spiderMona = new Spidertocat("Spidertocat", "Traje color rojo y azul con rayas negras simulando telarañas, una araña negra en el centro y una araña roja en la espalda.");
        spiderMona.showMessage();
        spiderMona.startWallcrawling();
        spiderMona.activateSpiderSenseAlert();
        spiderMona.throwSpiderWeb();


    }
}
