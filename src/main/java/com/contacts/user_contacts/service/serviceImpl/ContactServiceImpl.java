package com.contacts.user_contacts.service.serviceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contacts.user_contacts.entity.Contact;
import com.contacts.user_contacts.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	//here we will create some dummy data in list
	List <Contact> list = Arrays.asList(
			new Contact(1L, "gp@gmail.com", "Ganesh Parmar", 1201L),
			new Contact(2L, "gunjanp@yahoo.com", "Gunjan Parmar", 1202L),
			new Contact(3L, "y2j@orkut.com", "Yash Parmar", 1203L),
			new Contact(4L, "ganeshp@techm.com", "GaneshP", 1201L)
			);
	
	@Override
	public List<Contact> getContactsOfUsers(long userId) {
		
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
