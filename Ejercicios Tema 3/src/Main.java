public class Main {
    public static void main(String[] args) {
suma(40, 10, 50);
Coche miCoche = new Coche();
miCoche.AgregarPuerta();
System.out.println("El coche Tiene"+" "+ miCoche.Puertas +" "+"Puertas");
    }
    public static void suma(int a, int b, int c){
        int total;
        total = a + b +c;
        System.out.println(total);
    }
}
class Coche {
    public int Puertas =4;
    public void AgregarPuerta(){
        this.Puertas++;
    }
}