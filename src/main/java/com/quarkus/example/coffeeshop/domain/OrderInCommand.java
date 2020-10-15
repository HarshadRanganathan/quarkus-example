package com.quarkus.example.coffeeshop.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RegisterForReflection
public class OrderInCommand {

    private String id;

    private List<LineItem> beverages;

    private List<LineItem> kitchenOrders;

    public OrderInCommand() {
    }

    public OrderInCommand(String id, List<LineItem> beverages, List<LineItem> kitchenOrders) {
        this.id = id;
        this.beverages = beverages;
        this.kitchenOrders = kitchenOrders;
    }

    public void addBeverage(LineItem favFoodLineItem){
        if(this.beverages == null) this.beverages = new ArrayList<LineItem>();
        this.beverages.add(favFoodLineItem);
    }

    public void addKitchenOrder(LineItem favFoodLineItem){
        if(this.kitchenOrders == null) this.kitchenOrders = new ArrayList<LineItem>();
        this.kitchenOrders.add(favFoodLineItem);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<LineItem> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<LineItem> beverages) {
        this.beverages = beverages;
    }

    public List<LineItem> getKitchenOrders() {
        return kitchenOrders;
    }

    public void setKitchenOrders(List<LineItem> kitchenOrders) {
        this.kitchenOrders = kitchenOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderInCommand that = (OrderInCommand) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(beverages, that.beverages) &&
                Objects.equals(kitchenOrders, that.kitchenOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, beverages, kitchenOrders);
    }

    @Override
    public String toString() {
        return "OrderInCommand{" +
                "id='" + id + '\'' +
                ", beverages=" + beverages +
                ", kitchenOrders=" + kitchenOrders +
                '}';
    }
}
