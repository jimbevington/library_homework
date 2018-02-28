import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int bookCount(){
        return this.books.size();
    }

    public boolean hasCapacity(){
        return bookCount() < this.capacity;
    }

    public void addBook(Book book){
        if (hasCapacity()) {
            this.books.add(book);
        }
    }

    public Book removeBook(Book book){
//        get the index of the specified book
        int index = this.books.indexOf(book);
//        return the book if it exists
        if (index > -1) {
            return this.books.remove(index);
        }
//        or return null
        return null;
    }

}
