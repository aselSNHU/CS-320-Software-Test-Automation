package Tests;
import org.junit.jupiter.api.Test;

import ContactsPackage.Contacts;

import static org.junit.jupiter.api.Assertions.*;


public class ContactTest {
    
    
    @Test
    public void testContactCreation() {
        Contacts contact = new Contacts("Alice", "Stewart", "1234567890", "123 Wright St");
        
      
        assertNotNull(contact);
        
        // Assert the values
        assertEquals("1234567890", contact.getContactID());
        assertEquals("Alice", contact.getFirstName());
        assertEquals("Stewart", contact.getLastName());
        assertEquals("1234567890", contact.getNumber());
        assertEquals("123 Wright St", contact.getAddress());
    }
}