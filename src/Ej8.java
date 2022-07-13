public class Ej8{
public static void main(String[] args){
Persona persona = new Persona();

persona.setEdad(20);
persona.setNombre("Agustina");
persona.setTelefono(354774619);
System.out.println("Mi nombre es:"+persona.getNombre());
System.out.println("Edad:"+persona.getEdad());
System.out.println("Mi número de telefono es:"+persona.getTelefono());

        //Para practicar la encapsulación:
        //Crear clase Persona.
        //Crear variables las privadas edad, nombre y telefono de la clase Persona.
        //Crear gets y sets de cada propiedad.
        //Crear un objeto persona en el main.
        //Utiliza los gets y sets para darle valores a las propiedades edad, nombre
        //y telefono, por último muéstralas por consola
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}