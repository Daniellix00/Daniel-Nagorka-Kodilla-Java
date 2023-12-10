package com.kodilla.patterns.strategy.social;

public class Millenials extends  User{
    public Millenials(String name, SocialPublisher socialPublisher) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
