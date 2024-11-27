package main.java.com.part1backend.mylist;

import java.util.Arrays;

class myList {

    private int[] elements; //array for storing elements
    private int size;  //lists current size

    private static final int INITIAL_CAPACITY=100; //arrays' intial capacity

    public myList() {
        elements=new int[INITIAL_CAPACITY];
        size=0;
    }

    //Method to add a new value to the list
    public void add(int value) {
        ensureCapacity();
        elements[size++]=value; //adding value and increment size
    }

    //Method to delete element based on its index
    public boolean deleteAnIndex(int index) {
        if(index<0 || index>=size) {
            System.out.println("Invalid index:"+index);
            return false;
        }
        //to fill the gap shift elements to the left
        System.arraycopy(elements, index+1, elements, index, size-index-1);
        size--;
        shrinkCapacity();
        return true;
    }

    //Method to delete element based on its value
    public boolean deleteByValue(int value) {
        for(int i=0;i<size;i++) {
            if(elements[i]==value) {
                deleteAnIndex(i);
                return true;
            }
        }
        System.out.println("value not found"+value);
        return false;
    }

    //Method to retrieve value from a specific index
    public int getValue(int index) {
        if(index<0 || index>=size) {
            throw new IndexOutOfBoundsException("index out of bounds"+index);
        }
        return elements[index];
    }
    //Method for arrays enough capacity
    private void ensureCapacity() {
        if(size==elements.length) {
            elements=Arrays.copyOf(elements, elements.length*2);
        }
    }
    private void shrinkCapacity() {
        if(size<elements.length/4 && elements.length>INITIAL_CAPACITY) {
            elements=Arrays.copyOf(elements, elements.length/2);
        }
    }

    //Method to display
    public void display() {
        System.out.println("list: ");
        for(int i=0;i<size;i++) {
            System.out.println(elements[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        myList list=new myList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.display();

        list.deleteAnIndex(2);
        list.display();

        list.deleteByValue(10);
        list.display();

        System.out.println("element at index 0: "+list.getValue(0));
    }
}
