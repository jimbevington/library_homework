import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before(){
        book1 = new Book(Genre.COMEDY);
    }

    @Test
    public void canGetGenre(){
        assertEquals(Genre.COMEDY, book1.getGenre());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Funny books to make you giggle.", book1.getDescriptionFromEnum());
    }
}
