public class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Buenos días, mi nombre es " + nombre + ". Encantado de saludarle.");
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Emma");
        p1.saludar();
    }
}