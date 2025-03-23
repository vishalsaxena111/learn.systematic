package com.learn.systematic.SOLID;

public interface InterfaceSegregationPrincipleInterface {

    //do not force any client to implement an interface which is irrelevant to them

    public interface UPIPayments {

        public void payMoney();

        public void getScratchCard();

       // public void getCashBackAsCreditBalance();  /// can be accepted only with g-pay not with phone-pay

    }

    public interface CashbackManager{
        public void getCashBackAsCreditBalance();
    }

    //Now we can remove getCashBackAsCreditBalance from UPIPayments interface .
}
