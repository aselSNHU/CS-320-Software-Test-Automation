package ContactsPackage;
import java.util.*;

public class Contacts {
	
private String firstName;
private String lastName;
private String number;
private String address;
private final String contactID;

public Contacts(String firstName, String lastName, String number, String address) {
	
	this.contactID = number;
     this.firstName = firstName;
     this.lastName = lastName;
     this.number = number;
     this.address = address;
 }



public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	if(firstName==null || firstName.isEmpty()) {
		this.setLastName("NULL");
	}else if((firstName.length()<=10) && (firstName.length()>0)) {
		this.setFirstName(firstName);
	}else {
		System.out.println("The first name can not be null or longer than 10 characters.");
		}
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	if(lastName==null || lastName.isEmpty()) {
		this.setLastName("NULL");
	}else if((lastName.length()<=10) && (lastName.length()>0)) {
		this.setLastName(lastName);
	}else {
		System.out.println("The last name can not be null or longer than 10 characters.");
}
}
public String getNumber() {
	return number;
}

public void setNumber(String number) {
	if(number.length()==10) {
		this.setNumber(number);
	}else {
		System.out.println("The phone number nust be 10 digits and can not not be a null value.");
}
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	if(address==null || address.isEmpty()) {
		this.setAddress("NULL");
	}else if(address.length()==30 || address.length()<30) {
		this.setAddress(address);
	}else {
		System.out.println("The address can not be a null value or longer than 30 characters.");
	}
}

public String getContactID() {
	return contactID;
}


}
