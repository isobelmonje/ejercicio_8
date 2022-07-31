public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(5);
        persona.setNombre("Jai");
        persona.setTelefono("656-898-465");
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int i) {
        this.edad = i;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String persona) {
        this.nombre = persona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }

}