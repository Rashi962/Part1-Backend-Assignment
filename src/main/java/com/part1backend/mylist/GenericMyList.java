package main.java.com.part1backend.mylist;
import java.util.Arrays;

public class GenericMyList<G> {
    private static final int INITIAL_CAPACITY=100;
    private G[] elements;
    private int size=0;

    //@SuppressWarnings("unchecked")
    public GenericMyList() {
        elements=(G[]) new Object[INITIAL_CAPACITY];
    }

    //Adding new value to the list
    public void add(G value) {
        ensureCapacity();
        elements[size++]=value;
    }

    //Deleting an element by index
    public void deleteByIndex(int index) {
        if(index<0 || index>=size) {
            throw new IndexOutOfBoundsException("index out of bounds: "+index);
        }
        System.arraycopy(elements, index+1, elements, index, size-index-1);
        size--;
    }
    //Deleting an element by value
    public void deleteByValue(G value) {
        for(int i=0;i<size;i++) {
            if(elements[i].equals(value)) {
                deleteByIndex(i);
                return;
            }
        }
        System.out.println("value not found"+value);
    }
    
    //Retrieve value by index
    public G getValue(int index) {
        if(index<0 || index>=size) {
            throw new IndexOutOfBoundsException("index out of bounds "+index);
        }
        return elements[index];
    }

    private void ensureCapacity() {
        if(size==elements.length) {
            elements=Arrays.copyOf(elements, elements.length*2);
        }
    }
    public void print() {
        for(int i=0;i<size;i++) {
            System.out.println(elements[i]+" ");
        }
        System.out.println();
    }
    //custom class example
    public static class Employee {
        private String id;
        private String name;

        public Employee(String id, String name) {
            this.id=id;
            this.name=name;
        }
        @Override
        public String toString() {
            return "emp{id='"+id+"',name='"+name+"'}";
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Employee emp = (Employee) obj;
            return id.equals(emp.id);
        }
    }
    public static void main(String[] args) {
        GenericMyList<Integer> intList=new GenericMyList<>();
        intList.add(5);
        intList.add(10);
        intList.add(15);
        intList.add(20);
        intList.print();

        intList.deleteByValue(15);
        intList.print();

        //String List
        GenericMyList<String> stringList=new GenericMyList<>();
        stringList.add("Quinbay");
        stringList.add("Technologies");
        stringList.add("Pvt. Ltd.");
        stringList.print();
        
        stringList.deleteByIndex(2);
        stringList.print();

        // Custom Class Example
        GenericMyList<Employee> empList = new GenericMyList<>();
        empList.add(new Employee("E1", "A"));
        empList.add(new Employee("E2", "B"));
        empList.print();

        empList.deleteByValue(new Employee("E1", "A")); 
        empList.print();

    }
}
