package com.quarkus.example.coffeeshop.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.Objects;

@RegisterForReflection
public class FavFoodLineItems {

    private String item;

    private String itemId;

    private int quantity;

    public FavFoodLineItems() {
    }

    public FavFoodLineItems(String item, String itemId, int quantity) {
        this.item = item;
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavFoodLineItems that = (FavFoodLineItems) o;
        return quantity == that.quantity &&
                Objects.equals(item, that.item) &&
                Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, itemId, quantity);
    }

    @Override
    public String toString() {
        return "FavFoodLineItems{" +
                "item='" + item + '\'' +
                ", itemId='" + itemId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
