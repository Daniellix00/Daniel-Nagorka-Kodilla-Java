package com.kodilla.patterns.library;
import java.util.HashSet;
import java.util.Set;
public final  class Library  extends Prototype<Library>{
    private String name;
    private  Set<Book> books = new HashSet<>();

    public Library( String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return  name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public Library shallowCopy() throws  CloneNotSupportedException{
        return  super.clone();
    }
    public  Library deepCopy() throws  CloneNotSupportedException{
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBooks : books) {
            Book clonedList = new Book(theBooks.getTitle(), theBooks.getAuthor(), theBooks.getPublicationDate());
            clonedLibrary.getBooks().add(clonedList);
        }
    return clonedLibrary;
    }}
