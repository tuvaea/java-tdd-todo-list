package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    public class Task{

    }

    ArrayList<Task> todoList = new ArrayList<>();

    public Boolean addTask(String taskName){
        return true;
    }

    public String getTasks(ArrayList<Task> todoList){
        return "Todo list is empty";
    }

}
