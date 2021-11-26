

public class Book {

    private int bookId;
    private String bookName;
    private String authorName;

    public Book(int bookId,String bookName,String authorName){
        this.bookId=bookId;
        this.bookName=bookName;
        this.authorName=authorName;
    }

    public int getBookId(){
        return bookId;
    }

    public void setBookId(int bookId){
        this.bookId=bookId;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName=bookName;
    }

    public String getAuthorName(){
        return authorName;
    }

    public void setBookId(String authorName){
        this.authorName=authorName;
    }

    /*@Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }*/

}
