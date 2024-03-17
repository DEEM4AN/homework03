package homework03;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<T> implements Iterable<T>{

    private LinkedList<T> linkedList;
    public MyLinkedList() {
        this.linkedList = new LinkedList<>();
    }

    @Override
    public Iterator<T> iterator() {
        return linkedList.iterator();
    }

    public void addElement(T element) {
        linkedList.add(element);
    }

    public void deleteElement(T element) {
        linkedList.remove(element);
    }

    public T getElement (int number) {
        return linkedList.get(number);
    }
}
