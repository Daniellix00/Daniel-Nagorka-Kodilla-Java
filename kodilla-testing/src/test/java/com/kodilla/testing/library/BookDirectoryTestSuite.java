package com.kodilla.testing.library;
import  org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
 class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [3]
        List<Book> resultListOfBooks = new ArrayList<>();                                // [4]
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
        resultListOfBooks.add(book1);                                                    // [9]
        resultListOfBooks.add(book2);                                                    // [10]
        resultListOfBooks.add(book3);                                                    // [11]
        resultListOfBooks.add(book4);                                                    // [12]
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);// [13]

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");        // [14]

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
        List<Book> resultListOf0Books = new ArrayList<>();                           // [2]
        List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
        List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))                    // [5]
                .thenReturn(resultListOf15Books);                                             // [6]
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                    // [7]
                .thenReturn(resultListOf0Books);                                              // [8]
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                   // [9]
                .thenReturn(resultListOf40Books);                                             // [10]

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
        // Then

        assertEquals(0, theListOfBooks0.size());                                         // [14]
        assertEquals(15, theListOfBooks15.size());                                       // [15]
        assertEquals(0, theListOfBooks40.size());                                        // [16]
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);               // [3]

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [4]

        // Then
        assertEquals(0, theListOfBooks10.size());                                     // [5]
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    void testListBooksInHandsOf(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
// When
       Mockito.when(libraryDatabaseMock.listBooksInHandsOf(Mockito.any())).thenReturn(List.of());

        //then
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(new LibraryUser("Daniel", "Nagórka",  "0002"));
        assertEquals(0, theListOfBooks0.size());
    }
    @Test
    void testListBooksInHandsOf1(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        Book ksiazka = new Book ("Title", "Author", 2020);
        List<Book> listaKsiazek = new ArrayList<>();
        listaKsiazek.add(ksiazka);
    LibraryUser uzytkownik = new LibraryUser("Daniel", "Nagórka", "0001");

     //When
        Mockito.when(libraryDatabaseMock.listBooksInHandsOf(uzytkownik)).thenReturn(listaKsiazek);
        //Then
        List<Book>theListOfBooks1 = bookLibrary.listBooksInHandsOf(uzytkownik);
        assertEquals(1, theListOfBooks1.size());

    }
    @Test
    void testListBooksInHandsOf5(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        Book ksiazka1 = new Book ("Title1", "Author1", 2020);
        Book ksiazka2 = new Book ("Title2", "Author2", 2019);
        Book ksiazka3 = new Book ( "Title3", "Author3", 2018);
        Book ksiazka4 = new Book ( "Title4", "Author4", 2017);
        Book ksiazka5 = new Book ( "Title5", "Author5", 2016);
        List<Book>listaKsiazek = new ArrayList<>();
        listaKsiazek.add(ksiazka1);
        listaKsiazek.add(ksiazka2);
        listaKsiazek.add(ksiazka3);
        listaKsiazek.add(ksiazka4);
        listaKsiazek.add(ksiazka5);
        LibraryUser uzytkownik = new LibraryUser("Daniel", "Nagórka", "0001");
   //When
        Mockito.when(libraryDatabaseMock.listBooksInHandsOf(uzytkownik)).thenReturn(listaKsiazek);
   //Then
        List<Book>theListOfBooks5 = bookLibrary.listBooksInHandsOf(uzytkownik);
        assertEquals(5, theListOfBooks5.size());
    }

}