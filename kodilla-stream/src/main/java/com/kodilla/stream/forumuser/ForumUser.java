package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int iD;
    private  final String username;
    private final char sex;
    private final LocalDate birthdate;
    private final int posts;

    public ForumUser(int iD, String username, char sex, LocalDate birthdate, int posts) {
        this.iD = iD;
        this.username = username;
        this.sex = sex;
        this.birthdate = birthdate;
        this.posts = posts;
    }

    public int getiD() {
        return iD;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "iD=" + iD +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", posts=" + posts +
                '}';
    }
}
