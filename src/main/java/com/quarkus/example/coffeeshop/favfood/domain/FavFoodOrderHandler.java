package com.quarkus.example.coffeeshop.favfood.domain;

import com.quarkus.example.coffeeshop.domain.FavFoodOrder;
import com.quarkus.example.coffeeshop.domain.LineItem;
import com.quarkus.example.coffeeshop.domain.OrderInCommand;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FavFoodOrderHandler {

    static final Set<String> beverages = new HashSet<>(Arrays.asList("CAPPUCCINO","COFFEE_BLACK","COFFEE_WITH_ROOM","ESPRESSO","ESPRESSO_DOUBLE","LATTE"));

    static final Set<String> food = new HashSet<>(Arrays.asList("CAKEPOP","CROISSANT","CROISSANT_CHOCOLATE","MUFFIN"));

    public static OrderInCommand handleOrder(final FavFoodOrder favFoodOrder){
        OrderInCommand orderInCommand = new OrderInCommand();

        favFoodOrder.getFavFoodLineItems().forEach(favFoodLineItem -> {
            if(beverages.contains(favFoodLineItem.getItem())){
                for(int i=0;i<favFoodLineItem.getQuantity();i++){
                    orderInCommand.addBeverage(new LineItem(favFoodLineItem.getItem(), favFoodOrder.getCustomerName()));
                }
            }else if(food.contains(favFoodLineItem.getItem())){
                for(int i=0;i<favFoodLineItem.getQuantity();i++){
                    orderInCommand.addKitchenOrder(new LineItem(favFoodLineItem.getItem(), favFoodOrder.getCustomerName()));
                }
            }
        });
        return orderInCommand;
    }
}
