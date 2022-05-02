import java.util.Scanner;

public class TestSpiderverse {
    public static void main(String[] args) throws InterruptedException {

        Screen s = new Screen("Spiderverse");

        s.setVisible(true);
        // Define la posicion y dimensiones
        s.setBounds(200, 50, 880, 1000);

        SpiderWoman gwen = new SpiderWoman("Spider-Woman",
                "Gwendolyne Maxine Stacy",
                "Tierra-65");
    // 1er ataque gwen . pulsar enter para seguir
        gwen.spiderweb(s);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pulsa enter para continuar .....");

    // 2do ataque gwen . pulsar enter para seguir
        scanner.nextLine();
        gwen.wallcrawling(s);

        System.out.println("Pulsa enter para continuar .....");

     // 3er ataque gwen . pulsar enter para seguir
        scanner.nextLine();
        gwen.run(s);




        SpiderMiles miles = new SpiderMiles("Spider-Miles",
                "Miles Gonzalo Morales",
                "Tierra-1610");

        System.out.println("Pulsa enter para ver los ataques de miles .....");
        // 1er ataque miles . pulsar enter para seguir
        scanner.nextLine();

        miles.spiderweb(s);

        System.out.println("Pulsa enter para continuar .....");
        // 2do ataque miles pulsar enter para seguir
        scanner.nextLine();
        miles.wallcrawling(s);

        System.out.println("Pulsa enter para continuar .....");
        // 3er ataque miles . pulsar enter para seguir
        scanner.nextLine();

        miles.run(s);

    }
}
