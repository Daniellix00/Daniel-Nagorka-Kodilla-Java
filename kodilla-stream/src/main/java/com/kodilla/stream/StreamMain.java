package com.kodilla.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.stream.Collectors;
public class StreamMain {
   public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> forumResult = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser ->forumUser.getBirthdate().getYear()<2004 )
                .filter(forumUser -> forumUser.getPosts()>0)
                .collect(Collectors.toMap(ForumUser::getiD,ForumUser ->ForumUser));
        System.out.println("elementy: " + forumResult.size());
        forumResult.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
    }
    }

