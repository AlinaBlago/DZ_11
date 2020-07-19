package list;

public class Container <E> {
    public E value;
    public Container<E> next;

    public Container(E value) {
        this.value = value;
        this.next = null;
    }
}
