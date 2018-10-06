package com.cjgmj.testSpringSecurity.converter;

import org.springframework.stereotype.Component;

import com.cjgmj.testSpringSecurity.entity.Contact;
import com.cjgmj.testSpringSecurity.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {

	public Contact contactModelToContact(ContactModel contactModel) {
		Contact contact = new Contact();
		contact.setId(contactModel.getId());
		contact.setCity(contactModel.getCity());
		contact.setFirstname(contactModel.getFirstname());
		contact.setLastname(contactModel.getLastname());
		contact.setTelephone(contactModel.getTelephone());
		return contact;
	}

	public ContactModel contactToContactModel(Contact contact) {
		ContactModel contactModel = new ContactModel();
		contactModel.setId(contact.getId());
		contactModel.setCity(contact.getCity());
		contactModel.setFirstname(contact.getFirstname());
		contactModel.setLastname(contact.getLastname());
		contactModel.setTelephone(contact.getTelephone());
		return contactModel;
	}

}
