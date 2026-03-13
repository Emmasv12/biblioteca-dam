public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Libro("1984", "George Orwell"));
        biblioteca.agregarLibro(new Libro("Don Quijote", "Cervantes"));

        System.out.println("Catálogo de la biblioteca:");
        biblioteca.mostrarLibros();
    }

}
