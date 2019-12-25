package com.Level2.magazine;

public class Cashier extends Thread {

    private BuyerList buyerList = new BuyerList();
    Magazine magazine;
    private int cashierApparat = 0;

    public Cashier(String s, Magazine magazine) {
        super(s);
        this.magazine = magazine;
    }

    @Override
    public void run() {
        while (buyerList.getBuyerListSize() > 0) {
            Buyer buyer = buyerList.getLastBuyer();

            if (buyer != null) {

                while (buyer.getProductListSize() > 0) {
                    Product product = buyer.getLastProduct();

                    if (product != null) {

                        cashierApparat += product.getCost();

                        magazine.setAllMoney(product.getCost());
                        magazine.setMargin(product.getMargin());

                        System.out.printf("%s have %d dollars. The magazin has %d dollars of which %d margin\n",
                                currentThread().getName(), cashierApparat, magazine.getAllMoney(), magazine.getMargin());

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else return;
                }
            } else return;
        }
    }

}

