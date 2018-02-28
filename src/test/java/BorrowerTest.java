import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower1;
    private Library library;
    private Book book1;

    @Before
    public void before(){
        borrower1 = new Borrower();
        library = new Library(5);
        book1 = new Book(Genre.CODING_MANUAL);
    }

    @Test
    public void canCountCollection(){
        assertEquals(0, borrower1.collectionCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
        borrower1.addBook(library, book1);
        assertEquals(1, borrower1.collectionCount());
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook__noBooks(){
        borrower1.addBook(library, book1);
        assertEquals(0, borrower1.collectionCount());
        assertEquals(0, library.bookCount());
    }
}
