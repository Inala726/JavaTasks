package org.tasks.file;

public class File {
    private int id;
    private String fullName;
    private double salary;
    private String rank;
    private PENALTY status;

    public File(String fullName, double salary, String rank, PENALTY status) {
        this.fullName = fullName;
        this.salary = salary;
        this.rank = rank;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public PENALTY getStatus() {
        return status;
    }

    public void setStatus(PENALTY status) {
        this.status = status;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", rank='" + rank + '\'' +
                ", status=" + status +
                '}';
    }
}
