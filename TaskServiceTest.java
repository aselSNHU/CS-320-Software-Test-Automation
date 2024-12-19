package TaskTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import TaskPackage.Task;
import TaskPackage.TaskService;

 public class TaskServiceTest {
    
   
    @Test
    
    public void testAddTask() {
    	TaskService taskService = new TaskService();
        Task task = new Task("123456", "Task 1", "Description 1");
        taskService.addTask(task);
        assertEquals(task.getTaskID(), "123456");
               
}
    @Test
    
    public void testUpdateName() {
    	TaskService taskService = new TaskService();
    	Task task = new Task ("456456", "Task 2", "Description 2");
    	taskService.addTask(task);
    	taskService.updateTaskName("456456", "Task 3");
    	assertEquals("Task 3", taskService.getTask("456456").getName());
    }
    @Test
    public void testUpdateDescription() {
    	TaskService taskService = new TaskService();
    	Task task = new Task ("456457", "Task 3", "Description 3");
    	taskService.addTask(task);
    	taskService.updateTaskDescription("456457", "Description 4");
    	assertEquals("Description 4", taskService.getTask("456457").getDescription());
    }
    
    @Test
    public void testDeleteTask() {
    	TaskService taskService = new TaskService();
    	Task task = new Task("123456", "Task 1", "Description 1");
    	taskService.addTask(task);
    	taskService.deleteTask("123456");
    	assertNull(taskService.getTask("123456"));
    	
    }
 }