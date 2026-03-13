public class Biblioteca {

    private Libro[] libros;
    private int contador;

    public Biblioteca() {
        libros = new Libro[10];
        contador = 0;
    }

    public void agregarLibro(Libro libro) {
        if (contador < libros.length) {
            libros[contador] = libro;
            contador++;
        }
    }

    public void mostrarLibros() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Catálogo completo de la biblioteca:");
            System.out.println(libros[i].getTitulo() + " - " + libros[i].getAutor());
        }
    }

    public void prestarLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (libros[i].getTitulo().equals(titulo)) {
                System.out.println("Libro prestado: " + titulo);
                return;
            }
        }
        System.out.println("Libro no encontrado");
    }

    public void devolverLibro(String titulo) {
        System.out.println("Libro devuelto: " + titulo);
    }


}
