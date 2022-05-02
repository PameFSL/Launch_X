public class SpiderWoman extends PersonajeSpiderverse implements ActionCallbacksM {

    public SpiderWoman(){}
    public SpiderWoman ( String spiderman, String nombre, String tierraOrigen ){
        super(spiderman, nombre, tierraOrigen);
    }

    public void spiderweb(Screen s) {
        s.cls(); //Limpia la pantalla
        s.repaint();
        //s.setVisible(true);
        s.out(showMessage(), "Impact", 24, Colors.magenta);
        s.showImage("img/02_Spiderweb.gif");
        //s.setBounds(200,100,1100,900);
    }

    public void wallcrawling(Screen s) {
        s.cls(); //Limpia la pantalla
        s.repaint();
        s.out(showMessage(), "Impact", 24, Colors.magenta);
        s.showImage("img/Wallcrawling.gif");
        s.setBounds(200,100,1100,900);

    }

    public void run(Screen s) {
        s.cls(); //Limpia la pantalla
        s.repaint();
        s.out(showMessage(), "Impact", 24, Colors.magenta);
        s.showImage("img/03_run.gif");
        s.setBounds(200,100,1100,900);
    }

}
