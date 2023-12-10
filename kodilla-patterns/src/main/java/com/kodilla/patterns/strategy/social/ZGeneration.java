package com.kodilla.patterns.strategy.social;

public class ZGeneration extends  User{

    public ZGeneration(String name, SocialPublisher socialPublisher) {
        super(name);
        this.socialPublisher  = new SnapchatPublisher();
    }
}
