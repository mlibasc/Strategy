package com.Strategy;

import com.Strategy.products.Bonus;
import com.Strategy.products.GiftCard;
import com.Strategy.products.Voucher;

public enum Strategy {

    CREATE_GIFTCARD{
        @Override
        void execute(){
            System.out.println("Creating giftcard");
            GiftCard giftCard = new GiftCard();
        }
    },
    CREATE_BONUS{
        @Override
        void execute() {
            System.out.println("Creating bonus card");
            Bonus bonus = new Bonus();
        }
    },
    CREATE_VOUCHER{
        @Override
        void execute(){
            System.out.println("Creating voucher");
            Voucher voucher = new Voucher();
        }
    };
    abstract void execute();
}
