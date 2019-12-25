package com.Level2.magazine;

import java.util.ArrayList;
import java.util.List;

public class BuyerList {

    private static List<Buyer> buyerList = new ArrayList<>();

    {
        for (int i = 0; i < (int) (Math.random() * 10 + 1); i++) {
            buyerList.add(new Buyer());
        }
    }

    public Buyer getLastBuyer() {

        if (getBuyerListSize() > 1) {
            Buyer buyer = buyerList.get(buyerList.size() - 1);
            buyerList.remove(buyerList.size() - 1);

            return buyer;
        } else return null;
    }

    public int getBuyerListSize() {
        return buyerList.size();
    }
}
