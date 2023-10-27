import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        String title;
        String author;
        String isbn;
        String publicationDate;
        String genre;

        System.out.println("Añadir un libro: ");
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Introduce el Título: ");
        book.setTitle(title = scanner.nextLine());

        System.out.println("Introduce el Autor: ");
        book.setAuthor(author = scanner.nextLine());

        System.out.println("Introduce el ISBN: ");
        book.setIsbn(isbn = scanner.nextLine());

        System.out.println("Introduce la fecha de publicacion: ");
        book.setPublicationDate(publicationDate = scanner.nextLine());

        System.out.println("Introduce el Genero: ");
        book.setGenre(genre = scanner.nextLine());


        System.out.println("ISBN: " +book.getIsbn());
        System.out.println("Titulo: " +book.getTitle());
        System.out.println("Autor: " +book.getAuthor());
        System.out.println("Genero: " +book.getGenre());
        System.out.println("Fecha de publicacion: " +book.getPublicationDate());

    }
}