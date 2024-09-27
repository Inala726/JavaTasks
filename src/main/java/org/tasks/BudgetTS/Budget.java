package org.tasks.BudgetTS;

public class Budget {
    private int id;
    private String expenseName;
    private int expenseValue;
    private String incomeName;

    public Budget(int id, String expenseName, int expenseValue, String incomeName) {
        this.id = id;
        this.expenseName = expenseName;
        this.expenseValue = expenseValue;
        this.incomeName = incomeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public int getExpenseValue() {
        return expenseValue;
    }

    public void setExpenseValue(int expenseValue) {
        this.expenseValue = expenseValue;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }
}
