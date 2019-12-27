package vending;

public enum Coin {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25), DOLLAR(100), DOLLAR2(200);
    private int denomination;
    private Coin(int denomination){
        this.denomination = denomination;
    } public int getDenomination(){
        return denomination;
    }
}

