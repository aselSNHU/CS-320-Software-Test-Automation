package TaskPackage;
import java.util.*;


public class Task {
	
	private final String taskID;
	private String name;
	private String description;
	
	
public Task (String taskID, String name, String description) {

	this.name =  name;
	this.description = description;
	this.taskID = taskID;
}
public String getTaskID() {
	return taskID;
}

public String getName() {
	return name;
}


public void setName(String name) {
	if (name==null || name.length()>20) 
		throw new IllegalArgumentException("Invalid name");
	this.name=name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	if (description==null || description.length()>50) 
		throw new IllegalArgumentException("Invalid description");
	this.description=description;
}


	
}





