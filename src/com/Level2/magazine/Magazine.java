package com.Level2.magazine;

public class Magazine {
    Cashier c1 = new Cashier("Cashier #1", this);
    Cashier c2 = new Cashier("Cashier #2", this);
    Cashier c3 = new Cashier("Cashier #3", this);

    private int allMoney = 0, margin = 0;

    {
        c1.start();
        c2.start();
        c3.start();
        try {
            c1.join();
            c2.join();
            c3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public int getAllMoney(){
        return allMoney;
    }

    public int getMargin() {
        return margin;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney += allMoney;
    }

    public void setMargin(int margin) {
        this.margin += margin;
    }
}
