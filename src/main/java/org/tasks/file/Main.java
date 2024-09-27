package org.tasks.file;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<File> employeeList = new ArrayList<>();
        FileImpl fileImpl = new FileImpl(employeeList);

        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Employee");
            System.out.println("2. Calculate Salary");
            System.out.println("3. Write to File");
            System.out.println("4. Display output");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter employee details:");

                    System.out.print("Full Name: ");
                    String fullName = scanner.nextLine();

                    System.out.print("Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Rank: ");
                    String rank = scanner.nextLine();

                    System.out.println("Select employee penalty status:");
                    System.out.println("1 - NO_PENALTY");
                    System.out.println("2 - TRUANCY");
                    System.out.println("3 - LATE");
                    System.out.println("4 - OTHER");

                    int statusInput = scanner.nextInt();
                    PENALTY status = getStatusFromInput(statusInput);

                    File employee = new File(fullName, salary, rank, status);
                    fileImpl.addEmployee(employee);
                    break;

                case 2:
                    System.out.print("Enter employee ID to calculate salary: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine();

                    File foundEmployee = findEmployeeById(empId, employeeList);
                    if (foundEmployee != null) {
                        fileImpl.calculateSalary(foundEmployee);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter filename to write to: ");
                    String writeFilename = scanner.nextLine();

                    for (File emp : employeeList) {
                        fileImpl.writeToFile(emp, writeFilename);
                    }
                    break;

                case 4:
                    fileImpl.displayOutput();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        }

        scanner.close();
    }

    private static File findEmployeeById(int id, ArrayList<File> employeeList) {
        for (File employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
    public static PENALTY getStatusFromInput(int input) {
        switch (input) {
            case 1: return PENALTY.NO_PENALTY;
            case 2: return PENALTY.TRUANCY;
            case 3: return PENALTY.LATE;
            case 4: return PENALTY.OTHER;
            default:
                System.out.println("Invalid choice, defaulting to NO_PENALTY.");
                return PENALTY.NO_PENALTY;
        }
    }
}
