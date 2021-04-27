package org.structural;

import org.junit.Test;
import org.structural.prototype.Book;
import org.structural.prototype.CD;
import org.structural.prototype.Item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrototypeTest {
    @Test
    public void itShouldBePossibleToCloneACd(){
        //Given
        CD cd = new CD();
        cd.setDuration(56);
        cd .setTitle("Holy Land");
        cd.setPrice(15);
        Item target = cd;

        //When
        Item result = target.clone();

        //Then
        assertTrue(result.getClass().isAssignableFrom(CD.class));
        CD resultCd = (CD)result;
        assertEquals(resultCd.getDuration(),cd.getDuration());
        assertEquals(resultCd.getTitle(),cd.getTitle());
        assertEquals(resultCd.getPrice(),cd.getPrice());
    }

    @Test
    public void itShouldBePossibleToCloneABook(){
        //Given
        Book book = new Book();
        book.setPages(56);
        book .setTitle("Clean Code");
        book.setPrice(24);
        Item target = book;

        //When
        Item result = target.clone();

        //Then
        assertTrue(result.getClass().isAssignableFrom(Book.class));
        Book resultBook = (Book)result;
        assertEquals(resultBook.getPages(),book.getPages());
        assertEquals(resultBook.getTitle(),book.getTitle());
        assertEquals(resultBook.getPrice(),book.getPrice());
    }
}
