package com.Strategy;

import org.springframework.stereotype.Service;

@Service
public class CardService {

    public void createProduct(String id){
        CardService useStrategy = new CardService();
        switch(id){
            case "0":
                useStrategy.perform(Strategy.CREATE_GIFTCARD);
                break;
            case "1":
                useStrategy.perform(Strategy.CREATE_BONUS);
                break;
            case "2":
                useStrategy.perform(Strategy.CREATE_VOUCHER);
                break;
            default:
                System.out.print("Not valid input");
        }
    }

    private void perform(Strategy strategy){
        strategy.execute();
    }
}
