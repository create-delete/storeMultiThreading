package com.Level2.magazine;

import java.util.ArrayList;

public class Buyer {

    ArrayList<Product> productsList = new ArrayList<>();

    {
        for(int i = 0; i < (int) (Math.random() * 10 + 1) ; i++) {
            productsList.add(new Product());
        }
    }

    public Product getLastProduct () {

        if(getProductListSize() >= 1) {
            Product product = productsList.get(productsList.size() - 1);
            productsList.remove(productsList.size() - 1);

            return product;
        } else return null;
    }

    public int getProductListSize(){
        return productsList.size();
    }
}
