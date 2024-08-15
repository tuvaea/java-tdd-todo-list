package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAddTask() {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask("Test task 1"));
    }
}
