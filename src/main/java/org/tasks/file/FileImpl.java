package org.tasks.file;

import org.tasks.ContactTask.Contact;

import java.io.*;
import java.util.ArrayList;

public class FileImpl implements IFile {
    private ArrayList<File> employeeList;
    private static int idCounter = 1;

    public FileImpl(ArrayList<File> employeeList) {
        this.employeeList = employeeList ;
    }

    @Override
    public void addEmployee(File employee) {
        employee.setId(idCounter++);
        employeeList.add(employee);
        if (employee == null) {
            System.out.println("Unable to add employee, please fill in the field.");
        } else {
            System.out.println("Employee added successfully.");
        }
    }

    @Override
    public void calculateSalary(File employee) {
        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        if (employee.getStatus() == PENALTY.TRUANCY) {
            employee.setSalary(employee.getSalary() - 10000);
        } else if (employee.getStatus() == PENALTY.NO_PENALTY) {
            employee.setSalary(employee.getSalary());
        } else if (employee.getStatus() == PENALTY.OTHER) {
            employee.setSalary(employee.getSalary() - 6500);
        } else if (employee.getStatus() == PENALTY.LATE) {
            employee.setSalary(
                    employee.getSalary() - 12000
            );
        }
        System.out.println("Salary updated for the employee.");
    }

    @Override
    public void writeToFile(File employee, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(employee.getId() + "," + employee.getFullName() + "," + employee.getSalary() + ","
                    + employee.getRank() + "," + employee.getStatus());
            writer.newLine();
            System.out.println("Employee data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }


    @Override
    public void displayOutput() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        // Print table header
        System.out.println(String.format("%-10s %-20s %-10s %-10s %-15s", "ID", "Full Name", "Salary", "Rank", "Status"));
        System.out.println("--------------------------------------------------------------------------------");

        for (File employee : employeeList) {
            System.out.println(String.format("%-10d %-20s %-10.2f %-10s %-15s",
                    employee.getId(), employee.getFullName(), employee.getSalary(),
                    employee.getRank(), employee.getStatus()));
        }
    }
}
