package Contact_Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

	private String testContactID = "1234567890";
	private String testFailID = "12345678901234567890";
	private String testFirstName = "Daniel";
	private String testLastName = "Lucia";
	private String testFailName = "John Jacob Jingle-hiemer Schmit";
	private String testPhone = "9098355035";
	private String testShortPhone = "1";
	private String testLongPhone = "09876543210987654321";
	private String testAddress = "1234 Fake St. Middle, Nowhere";
	private String testFailAddress = "This address is much to long at 34";

	// Test Getters
	@Test
	void testGetContactId() {
		Contact contact = new Contact(testContactID, testFirstName, testLastName, testPhone, testAddress);
		assertEquals(testContactID, contact.getContactID());
	}
	
		
	@Test	
	void testGetFirstName() {
		Contact contact = new Contact(testContactID, testFirstName, testLastName, testPhone, testAddress);
		assertNotNull(contact.getFirstName());
		assertEquals(testFirstName, contact.getFirstName());
	}
		
	@Test
	void testGetLastName() {
		Contact contact = new Contact(testContactID, testFirstName, testLastName, testPhone, testAddress);
		assertNotNull(contact.getLastName());
		assertEquals(testLastName, contact.getLastName());	
	}
		
	@Test
	void testGetPhone() {
		Contact contact = new Contact(testContactID, testFirstName, testLastName, testPhone, testAddress);
		assertNotNull(contact.getPhoneNumber());			assertEquals(testPhone, contact.getPhoneNumber());
	}
		
	@Test
	void testGetAddress() {
		Contact contact = new Contact(testContactID, testFirstName, testLastName, testPhone, testAddress);			
		assertNotNull(contact.getAddress());
		assertEquals(testAddress, contact.getAddress());
	}
	
	//Test Setters
	@Test
	void testSetContactID() {
		Contact contact = new Contact(testContactID, testFirstName, testLastName, testPhone, testAddress);
		contact.setContactID(testContactID);
		assertEquals(testContactID, contact.getContactID());
	}

	@Test
	void testSetFirstName() {
		Contact contact = new Contact(testContactID, testFirstName, testLastName, testPhone, testAddress);
		contact.setFirstName(testFirstName);
		assertEquals(testFirstName, contact.getFirstName());
	}

	@Test
	void testSetLastName() {
		Contact contact = new Contact(testContactID, testFirstName, testLastName, testPhone, testAddress);
		contact.setLastName(testLastName);
		assertEquals(testLastName, contact.getLastName());
	}

	@Test
	void testSetPhone() {
		Contact contact = new Contact(testContactID, testFirstName, testLastName, testPhone, testAddress);
		contact.setPhoneNumber(testPhone);
		assertEquals(testPhone, contact.getPhoneNumber());
	}
	
	@Test
	void testSetAddress() {
		Contact contact = new Contact(testContactID, testFirstName, testLastName, testPhone, testAddress);
		contact.setAddress(testAddress);
		assertEquals(testAddress, contact.getAddress());
	}

	//Test Fail case
	@Test
	void testFailID() {	
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(testFailID, testFirstName, testLastName, testPhone, testAddress), "Invalid ID");
		Assertions.assertEquals("Invalid ID", thrown.getMessage());
	}
	
	@Test
	void testFailFirstName() {
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(testContactID, testFailName, testLastName, testPhone, testAddress), "Invalid First Name"); 
		Assertions.assertEquals("Invalid First Name", thrown.getMessage());
	}
	
	@Test
	void testFailLastName() {
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(testContactID, testFirstName, testFailName, testPhone, testAddress), "Invalid Last Name");
		Assertions.assertEquals("Invalid Last Name", thrown.getMessage());
	}
	
	@Test
	void testFailShortPhone() {
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(testContactID, testFirstName, testLastName, testShortPhone, testAddress), "Invalid Phone Number");
		Assertions.assertEquals("Invalid Phone Number", thrown.getMessage());
	}
	
	@Test
	void testFailLongPhone() {
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(testContactID, testFirstName, testLastName, testLongPhone, testAddress), "Invalid Phone Number");
		Assertions.assertEquals("Invalid Phone Number", thrown.getMessage());
	}
	
	@Test
	void testFailAddress() {
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(testContactID, testFirstName, testLastName, testPhone, testFailAddress), "Invalid Address Length");
		Assertions.assertEquals("Invalid Address Length", thrown.getMessage());			
	}
				
	//Test Null
	@Test			
	void testNullID() {		
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(null, testFirstName, testLastName, testPhone, testAddress), "Invalid ID");
		Assertions.assertEquals("Invalid ID", thrown.getMessage());
	}
				
	@Test			
	void testNullFirstName() {
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(testContactID, null, testLastName, testPhone, testAddress), "Invalid First Name");
		Assertions.assertEquals("Invalid First Name", thrown.getMessage());
	}
				
	@Test
	void testNullLastName() {		
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(testContactID, testFirstName, null, testPhone, testAddress), "Invalid Last Name");
		Assertions.assertEquals("Invalid Last Name", thrown.getMessage());
	}
	
	@Test
	void testNullPhone() {
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(testContactID, testFirstName, testLastName, null, testAddress), "Invalid Phone Number");
		Assertions.assertEquals("Invalid Phone Number", thrown.getMessage());
	}
	
	@Test
	void testNullAddress() {
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(testContactID, testFirstName, testLastName, testPhone, null), "Invalid Address Length");
		Assertions.assertEquals("Invalid Address Length", thrown.getMessage());
	}

}//End of Class
	