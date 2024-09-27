package org.tasks.file;

public interface IFile {
    void addEmployee(File employee);
    void calculateSalary(File employee);
    void writeToFile(File employee, String filename);
    void displayOutput();
}
