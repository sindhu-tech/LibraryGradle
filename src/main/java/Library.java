
import java.util.*;

public class Library{

    Scanner scan=new Scanner(System.in);
     List<Book> collection=new ArrayList<>();
    /*public Library(){

        List<Book> collection=new ArrayList<Book>();
    }*/



    public boolean  bookFound() {
        System.out.println("Enter name of the book:");
        String title = scan.next();
        System.out.println("Enter name of the author:");
        String author = scan.next();

        for (int i=0;i<collection.size();i++) {
            if (title.equalsIgnoreCase(collection.get(i).getBookName()) && author.equalsIgnoreCase(collection.get(i).getAuthorName())){
                return true;
            }
        }
        return false;
    }

    public void addBook(Book book){
        collection.add(book);
    }


    public  void displayBook() {
        System.out.println("Book ID\t\tBook Name\t\tAuthor Name\t\t");
        int size=collection.size();
        for(int i=0;i<size;i++){
            System.out.println(collection.get(i).getBookId()+"\t\t\t"+collection.get(i).getBookName()+"\t\t\t"+collection.get(i).getAuthorName());
        }

    }

    public  void searchBook(){
        System.out.println("Enter title of the book:");
        String title=scan.next();
        System.out.println("Book Id\t\tBook Name\t\t AuthorName");
        for(int i=0;i<collection.size();i++){
            if(title.equalsIgnoreCase(collection.get(i).getBookName())){
                System.out.println(collection.get(i).getBookId()+"\t\t\t"+collection.get(i).getBookName()+"\t\t\t"+collection.get(i).getAuthorName());
            }
            else{
                System.out.println("No Book found");
            }
        }
    }

    public  void searchAuthor(){
        System.out.println("Enter author of the book:");
        String author=scan.next();
        System.out.println("Book Id\t\tBook Name\t\t AuthorName");
        for(int i=0;i<collection.size();i++){
            if(author.equalsIgnoreCase(collection.get(i).getAuthorName())){
                System.out.println(collection.get(i).getBookId()+"\t\t\t"+collection.get(i).getBookName()+"\t\t\t"+collection.get(i).getAuthorName());
            }
            else{
                System.out.println("No Book found");
            }
        }
    }

    public void deleteByName(){
        System.out.println("Enter title of the book:");
        String title=scan.next();
        boolean success=false;

        for(int i=0;i<collection.size();i++) {
            if (title.equalsIgnoreCase(collection.get(i).getBookName())) {
                collection.remove(i);
                System.out.println("Book removed Successfully");
                success = true;
            }
        }
        if(!success){
            System.out.println("Could not remove");
        }
    }

    public void deleteByAuthor(){
        System.out.println("Enter author name:");
        String name=scan.next();
        boolean success=false;

        for(int i=0;i<collection.size();i++) {
            if (name.equalsIgnoreCase(collection.get(i).getAuthorName())) {
               // collection.remove(collection.indexOf(Book));
                collection.remove(i);
                System.out.println("Book removed Successfully");
                success = true;
            }
        }
        if(!success){
            System.out.println("Could not remove");
        }
    }

    public void updateBook(){
        System.out.println("Enter title of the book:");
        String title=scan.next();
        for(int i=0;i<collection.size();i++){
            if(title.equalsIgnoreCase(collection.get(i).getBookName())){
                collection.remove(i);
            }
            }

    }




    /*@Override
    public String toString() {
        String total="\n";
        //
        for(int i=0;i<collection.size();i++){
            Book b=collection.get(i);
            total=total+b.toString();
        }

        return total;
       /* return "Library{" +
                "collection=" + collection +
                '}';

        */
}



