package org.tasks;

import java.util.List;

public interface IFood {
    void promptMethod();
    String addFood(Food food);
    void deleteFood(Food food, int id);
    String updateFood(Food food, int id);
    void displayFood();
}
