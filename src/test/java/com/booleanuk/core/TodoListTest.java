package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void testAddTask() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Test task 1"));
    }

    @Test
    public void testGetTasks(){
        TodoList todoList = new TodoList();
        // Test if todo list is empty
        Assertions.assertEquals("Todo list is empty.", todoList.getTasks());

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");

        ArrayList<String> test = new ArrayList<>();
        test.add("Test task 1");
        test.add("Test task 2");
        test.add("Test task 3");
        // Test if todo list is not empty
        Assertions.assertEquals(test.toString(), todoList.getTasks());
    }

    @Test
    public void testChangeStatus() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("Task not found.", todoList.setCompleted("Test task 1"));
        todoList.addTask("Test task 1");
        Assertions.assertEquals("Task status is now 'Completed'.", todoList.setCompleted("Test task 1"));

        Assertions.assertEquals("Task status is now 'Incomplete'.", todoList.setUncompleted("Test task 1"));

    }

    @Test
    public void testGetCompletedTasks() {
        TodoList todoList = new TodoList();

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");
        Assertions.assertEquals("No completed tasks in todo list.", todoList.getCompletedTasks());

        todoList.setCompleted("Test task 1");

        Assertions.assertEquals("[Test task 1]", todoList.getCompletedTasks());
    }

    @Test
    public void testGetUncompletedTasks() {
        TodoList todoList = new TodoList();

        todoList.addTask("Test task 1");
        todoList.setCompleted("Test task 1");

        Assertions.assertEquals("No uncompleted tasks in todo list.", todoList.getUncompletedTasks());

        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");

        ArrayList<String> test = new ArrayList<>();
        test.add("Test task 2");
        test.add("Test task 3");

        Assertions.assertEquals(test.toString(), todoList.getUncompletedTasks());
    }

    @Test
    public void testSearchTask() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals("Task not found.", todoList.searchTask("Test task 1"));

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");


        Assertions.assertEquals("Task 'Test task 1' is Incomplete", todoList.searchTask("Test task 1"));
    }

    @Test
    public void testRemoveTask() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals("Task not found.", todoList.removeTask("Test task 1"));

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");


        Assertions.assertEquals("Task removed from todo list.", todoList.removeTask("Test task 1"));
    }

    @Test
    public void testGetTasksAscending() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals("Todo list is empty.", todoList.getTasksAscending());

        todoList.addTask("C task 1");
        todoList.addTask("A task 2");
        todoList.addTask("F task 3");

        ArrayList<String> test = new ArrayList<>();
        test.add("A task 2");
        test.add("C task 1");
        test.add("F task 3");

        Assertions.assertEquals(test.toString(), todoList.getTasksAscending());
    }

    @Test
    public void testGetTasksDescending() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals("Todo list is empty.", todoList.getTasksDescending());

        todoList.addTask("C task 1");
        todoList.addTask("A task 2");
        todoList.addTask("F task 3");

        ArrayList<String> test = new ArrayList<>();
        test.add("F task 3");
        test.add("C task 1");
        test.add("A task 2");

        Assertions.assertEquals(test.toString(), todoList.getTasksDescending());
    }

}
