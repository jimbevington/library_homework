import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int collectionCount(){
        return this.collection.size();
    }

    public void addBook(Library library, Book book){
        Book borrowed = library.removeBook(book);
//        add the book if it exists (is not null)
        if (borrowed != null) {
            this.collection.add(borrowed);
        }
    }
}
