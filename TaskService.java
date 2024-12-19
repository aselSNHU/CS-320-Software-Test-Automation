package TaskPackage;
import java.util.*;


public class TaskService {
    private final Map<String, Task> tasks;

    public TaskService() {
        this.tasks = new HashMap<>();
    }

    public void addTask(Task task) {
        tasks.put(task.getTaskID(), task);
    }

    public void deleteTask(String taskID) {
        tasks.remove(taskID);
    }

    public void updateTaskName(String taskID, String newName) {
        Task task = tasks.get(taskID);
        if (task != null) {
            task.setName(newName);
        }
    }

    public void updateTaskDescription(String taskID, String newDescription) {
        Task task = tasks.get(taskID);
        if (task != null) {
            task.setDescription(newDescription);
        }
    }

    public Task getTask(String taskID) {
        return tasks.get(taskID);
    }
}

	

    


	



	
    

