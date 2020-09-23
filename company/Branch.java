package com.company;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customerList = new ArrayList<>();
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void showListOfCustomers() {
        for (int i = 0; i < this.customerList.size(); i++) {
            System.out.println("1. " + customerList.get(i).getName());
        }
    }

    public boolean addNewCustomer(String name, Double firstTransaction) {
        if (checkIfCustomerExists(name) >= 0) {
            System.out.println("Sorry, this name already exists in our database. Please use another name.");
            return false;
        }
        Customer newCustomer = new Customer(name, firstTransaction);
        customerList.add(newCustomer);
        System.out.println("The customer " + newCustomer.getName() + " was successfully added.");
        return true;
    }

    private int checkIfCustomerExists(String name) {
        for (int i = 0; i < this.customerList.size(); i++) {
            if (customerList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }


    public boolean addTransaction(String name, Double transaction) {
        if (checkIfCustomerExists(name) >= 0) {
            int position = checkIfCustomerExists(name);
            Customer existingCustomer = customerList.get(position);
            if (existingCustomer.addTransaction(transaction)) {
                return true;
            }
        }
        return false;
    }
}
