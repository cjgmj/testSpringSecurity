package com.cjgmj.testSpringSecurity.service;

import java.util.List;

import com.cjgmj.testSpringSecurity.entity.Contact;
import com.cjgmj.testSpringSecurity.model.ContactModel;

public interface ContactService {

	public abstract ContactModel addContact(ContactModel contactModel);

	public abstract List<ContactModel> listAllContacts();

	public abstract Contact findContactById(int id);

	public abstract ContactModel findContactByIdModel(int id);

	public abstract void removeContact(int id);

}
