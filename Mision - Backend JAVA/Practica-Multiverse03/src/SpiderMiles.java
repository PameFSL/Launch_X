public class SpiderMiles extends PersonajeSpiderverse implements  ActionCallbacksM {

    public SpiderMiles (){}

    public SpiderMiles ( String spiderman, String nombre, String tierraOrigen ) {
        super(spiderman, nombre, tierraOrigen);
    }


        public void spiderweb(Screen s) {
            s.cls(); //Limpia la pantalla
            s.repaint();
            s.out(showMessage(), "Candara", 24, Colors.HighBlue);
            s.showImage("img/07_Spiderweb-Miles.gif");
            s.setBounds(200,100,1100,900);
        }


    @Override
    public void wallcrawling(Screen s) {
        s.cls(); //Limpia la pantalla
        s.repaint();
        s.out(showMessage(), "Candara", 24, Colors.HighBlue);
        s.showImage("img/05_Wallcrawling_miles.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void run(Screen s) {
        s.cls(); //Limpia la pantalla
        s.repaint();
        s.out(showMessage(), "Candara", 24, Colors.HighBlue);
        s.showImage("img/06_run-Miles.gif");
        s.setBounds(200,100,1100,900);
    }
}
