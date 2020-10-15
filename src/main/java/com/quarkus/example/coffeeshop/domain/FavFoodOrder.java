package com.quarkus.example.coffeeshop.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.List;
import java.util.Objects;

@RegisterForReflection
public class FavFoodOrder {

    private String customerName;

    private String orderId;

    private List<FavFoodLineItems> favFoodLineItems;

    public FavFoodOrder() {
    }

    public FavFoodOrder(String customerName, String orderId, List<FavFoodLineItems> favFoodLineItems) {
        this.customerName = customerName;
        this.orderId = orderId;
        this.favFoodLineItems = favFoodLineItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<FavFoodLineItems> getFavFoodLineItems() {
        return favFoodLineItems;
    }

    public void setFavFoodLineItems(List<FavFoodLineItems> favFoodLineItems) {
        this.favFoodLineItems = favFoodLineItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavFoodOrder that = (FavFoodOrder) o;
        return Objects.equals(customerName, that.customerName) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(favFoodLineItems, that.favFoodLineItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, orderId, favFoodLineItems);
    }

    @Override
    public String toString() {
        return "FavFoodOrder{" +
                "customerName='" + customerName + '\'' +
                ", orderId='" + orderId + '\'' +
                ", favFoodLineItems=" + favFoodLineItems +
                '}';
    }
}
