import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book();
        book2 = new Book();
        book3 = new Book();
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBooks(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canHaveCapacity(){
        assertTrue(library.hasCapacity());
    }

    @Test
    public void canReachCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
        library.removeBook(book1);
        assertEquals(0, library.bookCount());
    }

}
