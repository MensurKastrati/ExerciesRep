package com.company;

public class ListaArray {
    private Object[] list;
    private int start=0;

    ListaArray(){
        list = new Object[10];
    }
    ListaArray(int length){
        list = new Object[length];
    }

    public int size() {
        //ktu deri te para jo null
        //foreach jo null
        return  start;
    }

    public boolean Add(Object o) {
        list[start++]=o;
        return  true;
    }
    public void trimToSize() {
        Object[] newList = new Object[size()];
        newList[0]=list[0];// deri sa ka size
        list=newList;

    }

    public  Object get(int index){
        return list[index];
    }

}
