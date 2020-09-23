package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branchArrayList = new ArrayList<>();

    public Bank() {
    }

    public boolean createNewBranch(String branchName) {
        Branch newBranch = new Branch(branchName);
        if (branchArrayList.add(newBranch)) {
            System.out.println("The branch " + newBranch.getBranchName() + " was successfully added");
            return true;
        }
        System.out.println("There was a mistake.");
        return false;
    }

    private int findBranchIndex(String branchName) {
        for (int i = 0; i< branchArrayList.size(); i++) {
            if (branchArrayList.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addACustomerToBranch(String branchName, String customerName, Double initialTransaction) {
        Branch branch = checkIfBranchExists(branchName);
        if (branch != null && branch.addNewCustomer(customerName, initialTransaction)) {
            return true;
        }
        System.out.println("Not added.");
        return false;
    }

    public boolean addATransaction(String branchName, String customerName, Double newTransaction) {
        Branch branch = checkIfBranchExists(branchName);
        if (branch.addTransaction(customerName, newTransaction)) {
            System.out.println("The transaction was added.");
            return true;
        }
        System.out.println("The transaction was unsuccessful");
        return false;
    }

    public Branch checkIfBranchExists(String branchName) {
        if (findBranchIndex(branchName) >= 0) {
            int position = findBranchIndex(branchName);
            return branchArrayList.get(position);
        }
        return null;
    }

    public void showAListOfCustomers(String branchName) {
        Branch branch = checkIfBranchExists(branchName);
        if (branch != null) {
            branch.showListOfCustomers();
        } else {
            System.out.println("The branch doesn't exist.");
        }
    }
}
