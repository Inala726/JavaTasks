package org.tasks.ContactTask;

import org.tasks.Food;

public interface IContact {
    void promptMethod();
    String addContact(Contact contact);
    void deleteContact(int id);
    String updateContact(Contact contact, int id);
    void searchContact(Contact contact, int id);
}
