package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) < 0) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(findContact(oldContact.getName()) < 0) {
            return false;
        } else {
            myContacts.set(findContact(oldContact), newContact);
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        if(findContact(contact.getName()) < 0) {
            return false;
        } else {
            myContacts.remove(findContact(contact.getName()));
            return true;
        }
    }

    public int findContact(Contact contact) {
        return (myContacts.contains(contact) ? myContacts.indexOf(contact) : -1);
    }

    public int findContact(String name) {
        for(Contact contact : myContacts) {
            if(contact.getName().equals(name)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String contact) {
        return (findContact(contact) < 0 ? null : myContacts.get(findContact(contact)));
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(Contact contact : myContacts) {
            System.out.println((myContacts.indexOf(contact)+1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}