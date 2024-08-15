package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class TodoListExtensionTest {
    @Test
    public void testGetTaskById() {
        TodoListExtension todoList = new TodoListExtension();

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");

        Assertions.assertEquals("Test task 2", todoList.getTaskById(2));
    }
    @Test
    public void testEditTaskName() {
        TodoListExtension todoList = new TodoListExtension();

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");

        Assertions.assertEquals("Task name changed.", todoList.editTaskName(2, "Edited name"));
        Assertions.assertEquals("Edited name", todoList.getTaskById(2));
    }

    @Test
    public void testChangeStatus() {
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertEquals("Task not found.", todoList.setCompletedById(2));

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");
        Assertions.assertEquals("Task status is now 'Completed'.", todoList.setCompletedById(2));

        Assertions.assertEquals("Task status is now 'Incomplete'.", todoList.setUncompletedById(2));
    }

    @Test
    public void testGetCreationDateTime() {
        TodoListExtension todoList = new TodoListExtension();

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        String timeNow = LocalDateTime.now().withNano(0).withSecond(0).toString();
        todoList.addTask("Test task 3");

        Assertions.assertEquals(timeNow, todoList.getCreationDateTime(2));
    }
}
