package com.contacts.user_contacts.service;

import java.util.List;

import com.contacts.user_contacts.entity.Contact;

public interface ContactService {

	public List<Contact> getContactsOfUsers(long userId);
	
}
