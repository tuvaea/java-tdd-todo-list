package com.booleanuk.core;

import java.util.*;

public class TodoList {

    public static class Task{
        public String taskName;
        public String taskStatus;
    }

    ArrayList<Task> todoList = new ArrayList<>();

    public Boolean addTask(String taskName){
        Task task = new Task();
        task.taskName=taskName;
        task.taskStatus="Incomplete";
        this.todoList.add(task);
        return true;
    }

    public String getTasks(){
        if (!this.todoList.isEmpty()){
            ArrayList<String> taskNames = new ArrayList<>();
            for (Task task : todoList) {
                taskNames.add(task.taskName);
            }
            return taskNames.toString();
        }else {
            return "Todo list is empty.";
        }
    }

    public String setCompleted(String taskName){
        Task task = new Task();
        task.taskStatus = "Completed";
        task.taskName = taskName;

        for (int i=0;i<todoList.size();i++){
            if (taskName.equals((todoList.get(i)).taskName)){
                todoList.set(i, task);
                return "Task status is now 'Completed'.";
            }
        }
        return "Task not found.";
    }

    public String setUncompleted(String taskName){
        Task task = new Task();
        task.taskStatus = "Incomplete";
        task.taskName = taskName;

        for (int i=0;i<todoList.size();i++){
            if (taskName.equals((todoList.get(i)).taskName)){
                todoList.set(i, task);
                return "Task status is now 'Incomplete'.";
            }
        }
        return "Task not found.";
    }

    public String getCompletedTasks(){
        ArrayList<String> completedTasks = new ArrayList<>();
        for (Task task : todoList) {
            if (task.taskStatus.equals("Completed")) {
                completedTasks.add(task.taskName);
            }
        }
        if (!completedTasks.isEmpty()){
            return completedTasks.toString();
        }else {
            return "No completed tasks in todo list.";
        }
    }

    public String getUncompletedTasks(){
        ArrayList<String> uncompletedTasks = new ArrayList<>();
        for (Task task : todoList) {
            if (task.taskStatus.equals("Incomplete")) {
                uncompletedTasks.add(task.taskName);
            }
        }
        if (!uncompletedTasks.isEmpty()){
            return uncompletedTasks.toString();
        }else {
            return "No uncompleted tasks in todo list.";
        }
    }

    public String searchTask(String taskName){
        for (Task task : todoList) {
            if (taskName.equals(task.taskName)) {
                return "Task '" + taskName + "' is " + task.taskStatus;
            }
        }
        return "Task not found.";
    }

    public String removeTask(String taskName) {
        for (int i = 0; i < todoList.size(); i++) {
            if (taskName.equals((todoList.get(i)).taskName)) {
                todoList.remove(i);
                return "Task removed from todo list.";
            }
        }
        return "Task not found.";
    }

    public String getTasksAscending(){
        if (!this.todoList.isEmpty()){
            ArrayList<String> taskNames = new ArrayList<>();
            for (Task task : todoList) {
                taskNames.add(task.taskName);
            }
            Collections.sort(taskNames);
            return taskNames.toString();
        }else {
            return "Todo list is empty.";
        }
    }

    public String getTasksDescending(){
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        if (!this.todoList.isEmpty()){
            ArrayList<String> taskNames = new ArrayList<>();
            for (Task task : todoList) {
                taskNames.add(task.taskName);
            }
            taskNames.sort(reverseComparator);
            return taskNames.toString();
        }else {
            return "Todo list is empty.";
        }
    }

}
