package ven;

public enum Coin {
    PENNY(1), NICKEL(5),  DIME(10), QUARTER(25), DOLLAR(100);

    private int value;

    Coin(int value){
        this.value = value;
    }

    public static int[] parseCoins(String coins){
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];
        for(int index=0;index<numberCoinsInText.length;index++){
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }

    public int getValue(){
        return this.value;
    }
}
