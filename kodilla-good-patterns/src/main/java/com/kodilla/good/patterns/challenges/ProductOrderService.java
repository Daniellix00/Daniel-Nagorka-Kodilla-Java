package com.kodilla.good.patterns.challenges;


public class ProductOrderService {
    private  InfoOrder infoOrder;
    private Create create;
    private  ServiceOrder serviceOrder;

    public ProductOrderService(InfoOrder infoOrder, Create create, ServiceOrder serviceOrder) {
        this.infoOrder = infoOrder;
        this.create = create;
        this.serviceOrder = serviceOrder;

    }
    public void  processOrder(String user, String product){
System.out.println("Zamowiony produkt "+product+ "przez"+user);
infoOrder.userInformation(user);
create.createOrder(user,product);
boolean zamowiona = serviceOrder.order(user, product);
if(zamowiona){
    System.out.println("Zamowienie przebiegło pomyslnie");
}
else {
    System.out.println("Wystapil blad, zamow ponownie");
}
    }
    public static void main(String[] args) {
       ProductOrderService productOrderService = new ProductOrderService(
               user -> System.out.println("Informacja dla uzytkownika " + user + " o utworzeniu zamowienia."),
               (user, product) -> System.out.println("Utworzono zamowienie na produkt" + product + " przez uzytkownika " + user),
               (user, product) -> {
                   System.out.println("Zamowiony produkt " + product + " dla uzytkownika" + user);
                   return true;
               }
       );
        productOrderService.processOrder("Adam Kowalski", "Playstation 5");
    }

       }