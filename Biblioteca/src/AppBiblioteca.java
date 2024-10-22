import com.biblioteca.mantener.*;
import java.util.Scanner;


public class AppBiblioteca {
    private Libro libro;
    public static void main(String[] args) throws Exception {
        AppBiblioteca biblioteca = new AppBiblioteca();
        biblioteca.cargar();
        biblioteca.imprimir();
        
    }

    public void cargar() {
        Scanner sc = new Scanner(System.in);
        libro = new Libro();
        System.out.println("Digite el codigo del Libro");
        libro.setCodigo(sc.nextInt());
        System.out.println("Digite el Nombre del Libro");
        libro.setNombre(sc.nextLine());
        sc.nextLine();
        System.out.println("Digite la edicion del Libro");
        libro.setEdicion(sc.nextInt());
        System.out.println("Digite el año del Libro");
        libro.setAñoPublicacion(sc.nextInt());


        Autor autor = new Autor();
        System.out.println("Digite el codigo del Autor");
        autor.setCodigo(sc.nextInt());
        System.out.println("Digite el nombre del Libro");
        autor.setNombre(sc.nextLine());
        sc.nextLine();

        libro.setAutor(autor);




    }

    public void imprimir() {
        System.out.println(libro);

    }
}
