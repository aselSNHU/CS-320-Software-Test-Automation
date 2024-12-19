package ContactsPackage;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ContactService {
	
	private Map<String, Contacts> contacts;

	public void addContact(Contacts contact) {
        contacts.put(contact.getContactID(), contact);
    }

    public void deleteContact(String contactID) {
        contacts.remove(contactID);
    }

    public void updateFirstName(String contactID, String newFirstName) {
        Contacts contact = contacts.get(contactID);
        
    }

    public void updateLastName(String contactID, String newLastName) {
        Contacts contact = contacts.get(contactID);
        ;
        }
    

    public void updatePhone(String contactID, String newPhone) {
        Contacts contact = contacts.get(contactID);
       
        
    }

    public void updateAddress(String contactID, String newAddress) {
        Contacts contact = contacts.get(contactID);
       
}
}