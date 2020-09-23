package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> doubleList = new ArrayList<>();

    public Customer(String name, Double firstTransaction) {
        this.name = name;
        this.doubleList.add(firstTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getDoubleList() {
        return doubleList;
    }

    public boolean addTransaction(Double doubleValue) {
        if (doubleList.add(doubleValue)) {
            return true;
        }
        return false;
    }
}
