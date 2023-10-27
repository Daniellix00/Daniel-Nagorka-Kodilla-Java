package com.kodilla.testing.forum.statistics;

public class UserCalculate {
    int liczbaUzytkownikow;
    int liczbaPostow;
    int liczbaKom;
    double srednialiczbaPostowUzytkownika;
    double srednialiczbaKomUzytkownika;
    double liczbaKomNaPost;

    public int getLiczbaUzytkownikow() {
        return liczbaUzytkownikow;
    }

    public int getLiczbaPostow() {
        return liczbaPostow;
    }

    public int getLiczbaKom() {
        return liczbaKom;
    }

    public double getLiczbaPostowUzytkownika() {
        return srednialiczbaPostowUzytkownika;
    }

    public double getLiczbaKomUzytkownika() {
        return srednialiczbaKomUzytkownika;
    }

    public double getLiczbaKomNaPost() {
        return liczbaKomNaPost;
    }

    public double getSrednialiczbaPostowUzytkownika() {
        return srednialiczbaPostowUzytkownika;
    }

    public double getSrednialiczbaKomUzytkownika() {
        return srednialiczbaKomUzytkownika;
    }

    public  void calculateAdvStatistics(Statistics statistics){
     liczbaUzytkownikow = statistics.usersNames().size();
   liczbaPostow = statistics.postsCount();
   liczbaKom = statistics.commentsCount();
if (liczbaUzytkownikow > 0){
    srednialiczbaPostowUzytkownika = (double) liczbaPostow/ liczbaUzytkownikow;
    srednialiczbaKomUzytkownika = (double) liczbaKom/liczbaUzytkownikow;
}
else {
    srednialiczbaKomUzytkownika = 0;
    srednialiczbaKomUzytkownika = 0;
}
if(liczbaPostow > 0) {
    liczbaKomNaPost = (double) liczbaKom / liczbaPostow;
}
else{
        liczbaKomNaPost = 0;
}


    }

    }


