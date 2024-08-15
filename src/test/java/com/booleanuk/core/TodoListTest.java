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
        Assertions.assertEquals("Todo list is empty.", todoList.getTasks(todoList.todoList));

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");

        ArrayList<String> test = new ArrayList<>();
        test.add("Test task 1");
        test.add("Test task 2");
        test.add("Test task 3");
        // Test if todo list is not empty
        Assertions.assertEquals(test.toString(), todoList.getTasks(todoList.todoList));
    }

    @Test
    public void testChangeStatus() {
        TodoList todoList = new TodoList();
        todoList.addTask("Test task 1");
        Assertions.assertEquals("Task status changed.", todoList.changeStatus("Test task 1"));

    }

    @Test
    public void testGetCompletedTasks() {
        TodoList todoList = new TodoList();

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");
        Assertions.assertEquals("No completed tasks in todo list.", todoList.getCompletedTasks(todoList.todoList));

        todoList.changeStatus("Test task 1");

        Assertions.assertEquals("[Test task 1]", todoList.getCompletedTasks(todoList.todoList));
    }

    @Test
    public void testGetUncompletedTasks() {
        TodoList todoList = new TodoList();

        todoList.addTask("Test task 1");
        todoList.changeStatus("Test task 1");

        Assertions.assertEquals("No uncompleted tasks in todo list.", todoList.getUncompletedTasks(todoList.todoList));

        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");

        ArrayList<String> test = new ArrayList<>();
        test.add("Test task 2");
        test.add("Test task 3");

        Assertions.assertEquals(test.toString(), todoList.getUncompletedTasks(todoList.todoList));
    }

    @Test
    public void testSearchTask() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals("Task not found.", todoList.searchTask("Test task 1"));

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");


        Assertions.assertEquals("[Test task 1]", todoList.searchTask("Test task 1"));
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
    public void testRemoveTask() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals("Task not found.", todoList.removeTask("Test task 1"));

        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");


        Assertions.assertEquals("Task removed from todo list.", todoList.removeTask("Test task 1"));
    }



}
