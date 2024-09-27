package org.tasks.BudgetTS;

import java.util.Scanner;

import static java.lang.Double.isNaN;

public class BudgetImplementation implements IBudget {
    double balance= 0 ;
    Scanner scanner = new Scanner(System.in);
    String intro = "Please enter initial balance: ";

    @Override
    public void addBalance() {
        System.out.println(intro);
        balance = scanner.nextDouble();

//        Empty value or negative
        if (isNaN(balance) || balance == 0){
            System.out.println("Please insert a valid number");
        }
    }

    @Override
    public int addBudget(Budget structure, int balance) {
        return 0;
    }

    @Override
    public String addIncome(Budget structure) {
        return "";
    }
}
