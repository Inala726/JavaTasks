package org.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodImplementation implements IFood {
    ArrayList<String> favFood;
    int maxSize;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void promptMethod() {
        System.out.print("Enter the initial size for the favorite foods list: ");
        maxSize = scanner.nextInt();
        favFood = new ArrayList<>(maxSize);

    }

    @Override
    public String addFood(Food food) {
        if (favFood.size() < maxSize) {
            System.out.println("Enter fav foods");
            String foodName = scanner.nextLine();
            favFood.add(foodName);
        } else {
            return "Invalid item, list full";
        }
        return "Food item added successfully";
    }

    @Override
    public void deleteFood(Food food, int id) {
        if (food.getFoodName() == favFood.get(id)) {
            favFood.remove(food.getFoodName());
        }
        System.out.println( "Food item deleted successfully");
    }

    @Override
    public String updateFood(Food food, int id) {
        if (food.getFoodName() == favFood.get(id)) {
            System.out.println("Enter new food name: ");
            String newFoodName = scanner.nextLine();
            favFood.add(food.setFoodName(newFoodName));
        }
        return "Item successfully updated";
    }

    @Override
    public void displayFood() {
        favFood.forEach(System.out::println);
        ;
    }
}
