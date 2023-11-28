package com.kodilla.good.patterns.food2dor;

public class OrderProcess {
    private  DostawcaInfo dostawcaInfo;
    private  OrderInfo orderInfo;

    public OrderProcess(DostawcaInfo dostawcaInfo, OrderInfo orderInfo) {
        this.dostawcaInfo = dostawcaInfo;
        this.orderInfo = orderInfo;
    }


    public void process( String dostawca, int ilosc, String rodzaj){
        System.out.println( "Zamowienie dla firmy:" + dostawcaInfo.dostawcaInfo(dostawca) + "Rodzaj zamowienia" + orderInfo.orderInfo(ilosc,rodzaj));
    }
}
