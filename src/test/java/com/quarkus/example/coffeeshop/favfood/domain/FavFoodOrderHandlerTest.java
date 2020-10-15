package com.quarkus.example.coffeeshop.favfood.domain;

import com.quarkus.example.coffeeshop.domain.FavFoodLineItem;
import com.quarkus.example.coffeeshop.domain.FavFoodOrder;
import com.quarkus.example.coffeeshop.domain.LineItem;
import com.quarkus.example.coffeeshop.domain.OrderInCommand;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FavFoodOrderHandlerTest {
    @Test
    public void testHandleOrder() {

        FavFoodOrder favFoodOrder = new FavFoodOrder();
        favFoodOrder.setCustomerName("Spock");
        favFoodOrder.setOrderId(UUID.randomUUID().toString());
        favFoodOrder.setFavFoodLineItems(
                new ArrayList<>(
                        Arrays.asList(
                                new FavFoodLineItem(UUID.randomUUID().toString(), "COFFEE_BLACK",  1)
                        )));

        OrderInCommand expectedOrderInCommand = FavFoodOrderHandler.handleOrder(favFoodOrder);

        assertEquals(1, expectedOrderInCommand.getBeverages().size());
        LineItem beverage = expectedOrderInCommand.getBeverages().get(0);
        assertEquals("COFFEE_BLACK", beverage.getItem());
    }
}
