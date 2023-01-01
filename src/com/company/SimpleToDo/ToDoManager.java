package com.company.SimpleToDo;
// Klasa ToDoManager  ka me i menaxhu te gjitha punet qe kan te bejne me TODO
import java.util.ArrayList;

public class ToDoManager {

    // duhet te kete nje liste ku ruhet te gjitha ToDo Task
    // duhet te kete nje metode e cila shton todo
    //duhet te kete nje metonde e cila lexon nga todo
    //duhet te kete nje metode e cila fshine nga todo

    private ArrayList<String>todos;

    //kjo inicializohet ktu (String[] todos = new String[10];) ose brenda konstruktorit si ne vazhdim:

    public ToDoManager(){
        todos = new ArrayList<>(); //i rezervon 10 objekte String[] todos = new String[10];
    }

    public void add(String todoItem){
        todos.add(todoItem);
    }

    public String get(int index){
        return todos.get(index);
    }

    public void remove(int index){
        todos.remove(index);
    }

    public void remove(String todoItem){
        todos.remove(todoItem);
    }

    public boolean contains(String todoItem){
        return todos.contains(todoItem);
    }

    public ArrayList<String> getAll(){
        return todos;
    }


}
