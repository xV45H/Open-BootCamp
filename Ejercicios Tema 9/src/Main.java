public class Main {
    public static void main(String[] args) {

    Cliente cliente = new Cliente();
    Trabajador trabajador = new Trabajador();

    cliente.nombre = "Alexis";
    cliente.edad = 24;
    cliente.telefono = 123456789;
    cliente.credito = 10000.24;
    System.out.println("El cliente " + cliente.nombre + " Tiene la edad de " + cliente.edad +" , su telefono es " + cliente.telefono + "con un credito de "
    + cliente.credito);

    trabajador.nombre = "Luis";
    trabajador.edad = 35;
    trabajador.telefono =123456789;
    trabajador.Salario = 5000.35;
    System.out.println("El trabjador " + trabajador.nombre + " Tiene la edad de " + trabajador.edad +" , su telefono es " + trabajador.telefono + "con un salario de "
            + trabajador.Salario);

    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;

}
class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona{
    double Salario;
}