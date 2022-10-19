package com.ltp.contacts.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltp.contacts.pojo.Contact;

@Repository
public class ContactRepository {

    private List<Contact> contacts = Arrays.asList(
      new Contact("123", "Jon Snow", "413932913"),
      new Contact("456", "Tyrion Lanister", "651654481"),
      new Contact("789", "The Hound", "458231814")
    );

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public void saveContact(Contact contact) {
        contacts.add(contact);
    }

    public void updateContact(int index, Contact contact) {
        contacts.set(index, contact);
    }

    public void deleteContact(int index) {
        contacts.remove(index);
    }

}
