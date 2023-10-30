package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public final class  Forum {
    private final List<ForumUser> uzytkownicy = new ArrayList<>();
    public Forum() {
        uzytkownicy.add(new ForumUser(0001, "Daniellix", 'm', LocalDate.of(2000, 9, 25), 100));
        uzytkownicy.add(new ForumUser(0002, "Ala001", 'k', LocalDate.of(2001, 10, 23), 50));
        uzytkownicy.add(new ForumUser(0003, "Kamil2003", 'm', LocalDate.of(1999, 1, 12), 12));
        uzytkownicy.add(new ForumUser(0004, "Paweł2005", 'm', LocalDate.of(2005, 9, 12), 32));
        uzytkownicy.add(new ForumUser(0005, "Krystian1987", 'm', LocalDate.of(1987, 4, 10), 89));
    }
public List<ForumUser>getList(){
    return new ArrayList<>(uzytkownicy);
        }
    }

