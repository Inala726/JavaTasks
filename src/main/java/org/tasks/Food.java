package org.tasks;

public class Food {
    private int id;
    private String foodName;

    public Food(int id, String foodName) {
        this.id = id;
        this.foodName = foodName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public String setFoodName(String foodName) {
        this.foodName = foodName;
        return foodName;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                '}';
    }

}
