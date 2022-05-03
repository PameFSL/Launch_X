package Semana1.Viernes;

class Persona{
    int id;
    String nombre;

    Persona (int id, String nombre){
        this.nombre = nombre;
        this.id = id;
    }
}


//la clase empleado va a estender todo lo que tiene la clase persona
//El empleado
public class Empleado extends Persona {

   double salario;

   Empleado(int id, String nombre, double salario){
       super(id, nombre);
       this.salario = salario;
   }

   void display (){
       System.out.println(id +" "+nombre +" "+ salario);
   }
}

class TestPersonaEmpleado {
    public static void main(String[] args) {
        Empleado e = new Empleado(1, "david", 50000 );
        e.display();
    }
}

