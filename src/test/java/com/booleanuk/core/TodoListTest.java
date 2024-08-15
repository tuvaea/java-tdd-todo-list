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
        Assertions.assertEquals("Todo list is empty", todoList.getTasks(todoList.todoList));

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

}
