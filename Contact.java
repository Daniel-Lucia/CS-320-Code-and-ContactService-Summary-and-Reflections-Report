package Contact_Service;

public class Contact {
	private String contactID; //length <= 10
	private String firstName; //length <= 10
	private String lastName; //length <= 10
	private String phone; //length <= 10
	private String address; //length <= 30
	
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		
		//Checks Contact ID
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		//Checks First Name
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		//Checks Last Name
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		//Checks Phone Number
		if(phone == null || phone.length()>10 || phone.length()<10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		//Checks Address
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address Length");
		}
		
		this.setContactID(contactID);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phone);
		this.setAddress(address);
	}

	//Getters
	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}//End of Getters
	
	//Setters
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}//End of Setters
	
}//End of Class