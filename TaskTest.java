package TaskTests;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import TaskPackage.Task;
public class TaskTest {
	
	@Test
	public void testTaskTests() {
		Task tasks = new Task("2", "Emma Lee", "Employee database");
		
		assertNotNull(tasks);
		
		assertEquals("Emma Lee", tasks.getName());
		assertEquals("Employee database", tasks.getDescription());
		assertEquals("2", tasks.getTaskID());
		
	}

}
