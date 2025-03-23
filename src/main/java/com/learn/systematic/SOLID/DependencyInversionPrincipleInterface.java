package com.learn.systematic.SOLID;

public interface DependencyInversionPrincipleInterface {

    public class DebitCard{
        public void doTransaction(int amount){
            System.out.println("tx done with DebitCard");
        }
    }

    public class CreditCard{
        public void doTransaction(int amount){
            System.out.println("tx done with CreditCard");
        }
    }

    public class ShoppingMall {
        private DebitCard debitCard;
        public ShoppingMall(DebitCard debitCard) {
            this.debitCard = debitCard;
        }
        public void doPayment(Object order, int amount){              debitCard.doTransaction(amount);
        }
        public static void main(String[] args) {
            DebitCard debitCard=new DebitCard();
            ShoppingMall shoppingMall=new ShoppingMall(debitCard);
            shoppingMall.doPayment("some order",5000);
        }
    }

    //tightly coupled with debit card

    //user have credit card

    //Solution -----------


    public interface BankCardDIP {
        public void doTransaction(int amount);
    }


    public class CreditCardDIP implements BankCardDIP{
        public void doTransaction(int amount){            System.out.println("tx done with CreditCard");
        }
    }

    public class DebitCardDIP implements BankCardDIP{
        public void doTransaction(int amount){
            System.out.println("tx done with DebitCard");
        }
    }

    public class ShoppingMallDIP {
        private BankCardDIP bankCard;

        public ShoppingMallDIP(BankCardDIP bankCard) {
            this.bankCard = bankCard;
        }

        public void doPayment(Object order, int amount) {
            bankCard.doTransaction(amount);
        }

        public static void main(String[] args) {
            BankCardDIP bankCard = new CreditCardDIP();
            ShoppingMallDIP shoppingMall1 = new ShoppingMallDIP(bankCard);
            shoppingMall1.doPayment("do some order", 10000);
        }

    }



}
