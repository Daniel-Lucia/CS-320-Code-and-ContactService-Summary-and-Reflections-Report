package Contact_Service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	private String testFirstName = "Daniel";
	private String testLastName = "Lucia";
	private String testPhoneNumber = "9098355035";
	private String testPhoneTwo = "1111111111";
	private String testAddress = "1234 Fake St. Middle, NoWhere";
	private String testAddressTwo = "5678 NoWhere St. Middle, Fake";

	@Test
	void addContactTest() throws Exception {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		Assertions.assertEquals(service.getlistOfContact().get(0).getFirstName(), testFirstName);
		Assertions.assertEquals(service.getlistOfContact().get(0).getLastName(), testLastName);
		Assertions.assertEquals(service.getlistOfContact().get(0).getPhoneNumber(), testPhoneNumber);
		Assertions.assertEquals(service.getlistOfContact().get(0).getAddress(), testAddress);
	}
	
	//Test to confirm values are set correctly
	@Test
	void newContactTest() {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		Assertions.assertNotNull(service.getlistOfContact().get(0).getContactID());
		Assertions.assertNotEquals("INITIAL", service.getlistOfContact().get(0).getContactID());
	}

	@Test
	void newContactFirstNameTest() {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		Assertions.assertNotNull(service.getlistOfContact().get(0).getFirstName());
		Assertions.assertEquals(testFirstName,  service.getlistOfContact().get(0).getFirstName());
	}
	
	@Test
	void newContactLastNameTest() {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		Assertions.assertNotNull(service.getlistOfContact().get(0).getLastName());
		Assertions.assertEquals(testLastName, service.getlistOfContact().get(0).getLastName());
	}
	
	@Test
	void newContactPhoneTest() {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		Assertions.assertNotNull(service.getlistOfContact().get(0).getPhoneNumber());
		Assertions.assertEquals(testPhoneNumber, service.getlistOfContact().get(0).getPhoneNumber());
	}
	
	@Test
	void newContactAddressTest() {
		ContactService service = new ContactService(); 
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		Assertions.assertNotNull(service.getlistOfContact().get(0).getAddress());
		Assertions.assertEquals(testAddress, service.getlistOfContact().get(0).getAddress());
	}
	
	@Test
	void searchForContactTest() {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		Assertions.assertNotNull(service.getlistOfContact().get(0).getContactID());
		Assertions.assertEquals(service.searchForContact(service.getlistOfContact().get(0).getContactID()), service.getlistOfContact().get(0));
	}
	
	//Test update function for Values
	@Test
	void updateFirstNameTest() {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		service.updateFirstName(service.getlistOfContact().get(0).getContactID(), testLastName);
		Assertions.assertEquals(service.getlistOfContact().get(0).getFirstName(), testLastName);
	}
	
	@Test
	void updateLastNameTest() {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		service.updateLastName(service.getlistOfContact().get(0).getContactID(), testFirstName);
		Assertions.assertEquals(service.getlistOfContact().get(0).getLastName(), testFirstName);
	}
	
	@Test
	void updatePhoneTest() {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		service.updatePhone(service.getlistOfContact().get(0).getContactID(), testPhoneTwo);
		Assertions.assertEquals(service.getlistOfContact().get(0).getPhoneNumber(), testPhoneTwo);
	}
	
	@Test
	void updateAddressTest() {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		service.updateAddress(service.getlistOfContact().get(0).getContactID(), testAddressTwo);
		Assertions.assertEquals(service.getlistOfContact().get(0).getAddress(), testAddressTwo);
	}
				
	//Delete Contact Test
	@Test
	void deleteContactTest() throws Exception {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress); 
		service.deleteContact(service.getlistOfContact().get(0).getContactID());
		Assertions.assertEquals(service.getlistOfContact().size(),0);
	}
	
	//Unique ID Test
	@RepeatedTest(4)
	void UuidTest() {
		ContactService service = new ContactService();
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		service.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		assertEquals(3, service.getlistOfContact().size());
		assertNotEquals(service.getlistOfContact().get(0).getContactID(),
		service.getlistOfContact().get(1).getContactID());
		assertNotEquals(service.getlistOfContact().get(0).getContactID(),
		service.getlistOfContact().get(2).getContactID());
		assertNotEquals(service.getlistOfContact().get(1).getContactID(),
		service.getlistOfContact().get(2).getContactID());
	}
	
}//End of Class
