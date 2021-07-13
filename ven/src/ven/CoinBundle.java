package ven;

public class CoinBundle {
    public int number1CentsCoins;
    public int number5CentsCoins;
    public int number10CentsCoins;
    public int number25CentsCoins;
    public int number100CentsCoins;

    public CoinBundle(int... enteredCoins) {
        this.number1CentsCoins = enteredCoins[0];
        this.number5CentsCoins = enteredCoins[1];
        this.number10CentsCoins = enteredCoins[2];
        this.number25CentsCoins = enteredCoins[3];
        this.number100CentsCoins = enteredCoins[4];

    }


    public int getTotal(){
        int total = 0;
        total = total+this.number1CentsCoins*Coin.PENNY.getValue();
        total = total+this.number5CentsCoins*Coin.NICKEL.getValue();
        total = total+this.number10CentsCoins*Coin.DIME.getValue();
        total = total+this.number25CentsCoins*Coin.QUARTER.getValue();
        total = total+this.number100CentsCoins*Coin.DOLLAR.getValue();
        return total;
    }
}
