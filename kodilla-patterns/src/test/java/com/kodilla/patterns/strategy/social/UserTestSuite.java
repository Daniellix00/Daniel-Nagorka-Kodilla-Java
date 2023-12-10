package com.kodilla.patterns.strategy.social;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
    //Given
    User adam = new Millenials("Adam", new FacebookPublisher());
    User wojtek = new ZGeneration("Wojtek", new SnapchatPublisher());
    User pawel = new YGeneration("Paweł", new TwitterPublisher());
    //When
        String adamMedia = adam.sharePost();
        System.out.println("Adam " + adamMedia );
        String wojtekMedia = wojtek.sharePost();
        System.out.println("Wojtek " + wojtekMedia);
        String pawelMedia = pawel.sharePost();
        System.out.println("Pawel " + pawelMedia);
    //Then
        assertEquals("Facebook", adamMedia);
        assertEquals("Snapchat", wojtekMedia);
        assertEquals("Twitter", pawelMedia);
    }
@Test
    void testIndividualSharingStrategy(){
      //Given
    User adam = new Millenials("Adam", new FacebookPublisher());
    //When
    String adamMedia = adam.sharePost();
    System.out.println("Adam " + adamMedia);
    adam.setSocialPublisher(new TwitterPublisher());
    adamMedia = adam.sharePost();
    System.out.println("New Adam " + adamMedia);
    //Then
    assertEquals("Twitter", adamMedia);
    }
}
