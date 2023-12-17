package com.aswindev.thehungrydeveloper;

import androidx.annotation.NonNull;

public class Dish {
    String title, description;
    int price;

    Dish(String title, String description, int price) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
