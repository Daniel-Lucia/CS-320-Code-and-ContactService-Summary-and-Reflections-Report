package Contact_Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {
	final private List<Contact> listOfContact = new ArrayList<>();

	//Creates Contact ID Randomly
	public String newUniqueId() {
		return UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));

	}

	//Getter for List
	public List<Contact> getlistOfContact() {
		return listOfContact;
	}

	//Search for Contact
	public Contact searchForContact(String id){
		int index = 0;
		Contact localList = null;
		while (index < listOfContact.size()) {
			if (id.equals(listOfContact.get(index).getContactID())) {
				localList = listOfContact.get(index);
			}
			index++;
		}
		return localList;
	}
	
	//Add New Contact
	public void addContact(String firstName, String lastName, String phone, String address) {
		Contact contact = new Contact(newUniqueId(), firstName, lastName, phone, address);
		listOfContact.add(contact);
	}

	//Delete Contact
	public void deleteContact(String id) throws Exception {
		listOfContact.remove(searchForContact(id));
	}

	//Update First Name
	public void updateFirstName(String contactid, String firstName){
		searchForContact(contactid).setFirstName(firstName);
	}
	
	//Update Last Name
	public void updateLastName(String contactid, String lastName){
		searchForContact(contactid).setLastName(lastName);
	}
	
	//Update Phone Number
	public void updatePhone(String contactid, String phone){
		searchForContact(contactid).setPhoneNumber(phone);
	}
	
	//Update Address
	public void updateAddress(String contactid, String address){
		searchForContact(contactid).setAddress(address);
	}
} //End of Class