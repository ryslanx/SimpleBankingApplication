package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();
    public static void main(String[] args) {
        boolean quit = false;
        showListOfOptions();
        while (!quit) {
            System.out.println("Please specify the number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 0:
                    quit = true;
                    System.out.println("Exiting the application...");
                    break;
                case 1:
                    showCustomers();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    createNewBranch();
                    break;
            }
        }
    }

    public static void showListOfOptions() {
        System.out.println("There are 4 options:");
        System.out.println("0 - quit the application");
        System.out.println("1 - show all the customers in a particular branch(using the name of this branch)");
        System.out.println("2 - add a customer to the branch");
        System.out.println("3 - add a transaction for the customer");
        System.out.println("4 - create a new branch");
    }

    public static void createNewBranch() {
        System.out.println("Please specify the branch name: ");
        String branchName = scanner.nextLine();
        scanner.nextLine();
        bank.createNewBranch(branchName);
    }

    public static void showCustomers() {
        System.out.println("Please specify the branch name: ");
        String branchName = scanner.nextLine();
        bank.showAListOfCustomers(branchName);
    }

    public static void addCustomer() {
        System.out.println("Please specify the branch name:");
        String branchName = scanner.nextLine();
        System.out.println("Please specify the customer's name: ");
        String customerName = scanner.nextLine();
        System.out.println("Please specify the initial transaction");
        Double doubleValue = scanner.nextDouble();
        bank.addACustomerToBranch(branchName, customerName, doubleValue);
    }

    public static void addTransaction() {
        System.out.println("Please specify the branch name:");
        String branchName = scanner.nextLine();
        System.out.println("Please specify the customer's name: ");
        String customerName = scanner.nextLine();
        System.out.println("Please specify the initial transaction");
        Double doubleValue = scanner.nextDouble();
        bank.addATransaction(branchName, customerName, doubleValue);
    }
}





















 //   String[] strArray = new String[10];
//	    int[] intArray = new int[10];
//        ArrayList<String> arrList = new ArrayList<>();
//        arrList.add("TIm");
//
//        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
//        intClassArrayList.add(new IntClass(45));
//        Integer integer = 45;
//        Double doubleValue = 45.45;
//
//        ArrayList<Integer> arrList2 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            arrList2.add(i);
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i + " ---> " + arrList2.get(i));
//        }
//
//        Integer myIntValue = 56;
//        int myInt = myIntValue; // myInt.intValue(); that's actually what it is doing
//        ArrayList<Double> arrayDouble = new ArrayList<>();
//        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
//            arrayDouble.add(dbl);
//        }
//
//        for (int i = 0; i<arrayDouble.size(); i++) {
//            double value = arrayDouble.get(i).doubleValue();
//            System.out.println(i + " ----> " + value);
//        }
