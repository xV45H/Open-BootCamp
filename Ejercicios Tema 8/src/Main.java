public class Main {
    public static void main(String[] args) {

    Persona persona = new Persona();

    persona.setNombre("Alexis");
    System.out.println("Mi nombre es " + persona.getNombre());

    persona.setEdad(24);
    System.out.println("Mi edad es " + persona.getEdad());

    persona.setTelefono(123456789);
    System.out.println("Mi numero telefonico es " + persona.getTelefono());

    }

}
class Persona{
    private String nombre;
    private int edad;
    private int telefono;

// telefono
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return  this.telefono;
    }

// edad
    public void setEdad (int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
//nombre
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}