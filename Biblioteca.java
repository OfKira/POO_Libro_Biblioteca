public class Biblioteca {
    public static void main(String[] args) {
        System.out.println("--- Añadiendo 'Cien Años de Soledad' ---");
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, 496);

        System.out.println("Datos iniciales: " + libro1);
        System.out.println("Autor: " + libro1.getAutor());

        libro1.setAnioPublicacion(1970);
        libro1.prestar();

        System.out.println("Estado final: " + libro1);

        System.out.println("\n--- Añadiendo 'El Señor de los Anillos' ---");
        Libro libro2 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954, 1216);
        libro2.prestar();
    }
}
