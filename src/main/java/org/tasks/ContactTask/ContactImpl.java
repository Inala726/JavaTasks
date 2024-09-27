package org.tasks.ContactTask;

import org.tasks.Food;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactImpl implements IContact{
    ArrayList<Contact> contactList;
    int maxSize;
    Scanner scanner = new Scanner(System.in);


    @Override
    public void promptMethod() {
        System.out.println("Please enter list size: ");
        maxSize = scanner.nextInt();
        contactList = new ArrayList<>(maxSize);
    }

    @Override
    public String addContact(Contact contact) {
       if(contactList.size() < maxSize){
           String addName = scanner.nextLine();
           contact.setName(addName);
           String addEmail = scanner.nextLine();
           contact.setEmail(addEmail);
           String addNumber = scanner.nextLine();
           contact.setPhoneNumber(addNumber);
           var add = contactList.add(contact);
           if(!add){
               return "Unable to add contact successfully";
           }
       }
        return "contact added successfully";
    }

    @Override
    public void deleteContact(int id) {
        String delete = scanner.nextLine();
//        if()
    }

    @Override
    public String updateContact(Contact food, int id) {
        return "";
    }

    @Override
    public void searchContact(Contact contact, int id) {

    }
}
