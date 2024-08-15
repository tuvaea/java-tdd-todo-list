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
        return "Todo list is empty.";
    }

    public String changeStatus(String taskName){
        return "Task status changed.";
    }

    public String getCompletedTasks(ArrayList<Task> todoList){
        return "No completed tasks in todo list.";
    }

    public String getUncompletedTasks(ArrayList<Task> todoList){
        return "No uncompleted tasks in todo list.";
    }

    public String searchTask(String taskName){
        return "Task not found.";
    }

    public String removeTask(String taskName){
        return "Task not found.";
    }

    public String getTasksAscending(){
        return "Todo list is empty.";
    }

    public String getTasksDescending(){
        return "Todo list is empty.";
    }

}
