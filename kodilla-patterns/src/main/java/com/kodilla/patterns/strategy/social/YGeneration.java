package com.kodilla.patterns.strategy.social;

public class YGeneration extends User{
    public YGeneration(String name, SocialPublisher socialPublisher) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
