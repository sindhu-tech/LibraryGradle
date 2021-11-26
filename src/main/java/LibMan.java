
import java.util.Scanner;


public class LibMan {

    // static String filename=null;
    static Library lib = new Library();
    static Boolean running = true;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] agrs) {
        int ch;
        while (running) {
            System.out.println("1.Add the Book");
            System.out.println("2.Display the Book");
            System.out.println("3.Search the Book");
            System.out.println("4.Update the Book");
            System.out.println("5.Delete the Book");
            System.out.println("6.Exit");
            System.out.println("Enter your choice:");
            int choice = scan.nextInt();
            try {
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        lib.displayBook();
                        break;
                    case 3:
                        System.out.println("1.Search by Book Name");
                        System.out.println("2.Search by Author Name");
                        System.out.println("Enter choice:");
                        ch = scan.nextInt();
                        switch (ch) {
                            case 1:
                                lib.searchBook();
                                break;
                            case 2:
                                lib.searchAuthor();
                        }
                        break;
                    case 4:
                        lib.updateBook();
                        addBook();
                        break;
                    case 5:
                        System.out.println("1.delete by Book Name");
                        System.out.println("2.delete by Author Name");
                        System.out.println("Enter choice:");
                        ch = scan.nextInt();
                        switch (ch) {
                            case 1:
                                lib.deleteByName();
                                break;
                            case 2:
                                lib.deleteByAuthor();
                        }
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid input:");
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
   /* private static void loadLibrary(){
        FileInputStream fis=null;
        ObjectInputStream in=null;
        File file=new File("Library.txt");
        if(file.exists()) {
            try {
                fis = new FileInputStream(file);
                in=new ObjectInputStream(fis);
                lib=(Library)scan.readObject();
                fis.close();
                in.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("\nThe file doesnt exist");
        }
    }

    private static void writeLibrary(){
        FileOutputStream fos=null;
        ObjectOutputStream out=null;
        File file=new File("Library.txt");
        if(file.exists()) {
            try {
                fos = new FileOutputStream(file);
                out=new ObjectOutputStream(fos);
                out.writeObject(lib);
                fos.close();
                out.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("\nThe file doesnt exist");
        }
    }
    */


    public static void addBook() {
        int bookId;
        String bookName;
        String authorName;
        boolean i = lib.bookFound();
        if (!i) {
            System.out.println("Book doesn't exist.Add the Book");
            System.out.println("Enter Book ID:");
            bookId = scan.nextInt();
            System.out.println("Enter Book Name:");
            bookName = scan.next();
            System.out.println("Enter Author Name:");
            authorName = scan.next();

            Book b = new Book(bookId, bookName, authorName);
            lib.addBook(b);
        } else {
            System.out.println("Book is already exist");
        }


    }

}


