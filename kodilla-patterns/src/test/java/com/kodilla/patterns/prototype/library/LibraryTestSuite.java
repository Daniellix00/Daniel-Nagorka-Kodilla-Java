package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.library.Book;
import com.kodilla.patterns.library.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("Biblioteka1");
        Book ksiazka1 = new Book("Pies","Adam", LocalDate.of(2000,12,10));
        Book ksiazka2 = new Book("Kot", "Paweł", LocalDate.of(2001,11,1));
        Book ksiazka3 = new Book("Ryba", "Wojtek", LocalDate.of(2010,1,20));
        library.getBooks().add(ksiazka1);
        library.getBooks().add(ksiazka2);
        library.getBooks().add(ksiazka3);
        //making a shallow clone of object library
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Biblioteka2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //When
        library.getBooks().remove(ksiazka1);
        //Then
        System.out.println(library);
        System.out.println(deepClonedLibrary);
        assertEquals(2,library.getBooks().size());
assertEquals(2, clonedLibrary.getBooks().size());
assertEquals(3,deepClonedLibrary.getBooks().size() );
assertEquals(clonedLibrary.getBooks(), library.getBooks());
assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
