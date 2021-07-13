package ven;

public class SimpleCalculator implements Calculator{

    @Override
    public int calculateTotal(CoinBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public CoinBundle calculateChange(int amountMoneyToReturn) {
        CoinBundle change = new CoinBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;
        change.number100CentsCoins = remainingAmount / Coin.DOLLAR.getValue();
        remainingAmount = remainingAmount % Coin.DOLLAR.getValue();

        change.number25CentsCoins = remainingAmount / Coin.QUARTER.getValue();
        remainingAmount = remainingAmount % Coin.QUARTER.getValue();

        change.number10CentsCoins = remainingAmount / Coin.DIME.getValue();
        remainingAmount = remainingAmount % Coin.DIME.getValue();

        change.number5CentsCoins = remainingAmount / Coin.NICKEL.getValue();
        remainingAmount = remainingAmount % Coin.NICKEL.getValue();

        change.number1CentsCoins = remainingAmount / Coin.PENNY.getValue();


        return change;
    }
}
