package list;

import java.util.AbstractList;

public class ForwardLinkedList <E> extends AbstractList {
    private Container root;
    private Container lastChild;

    public void addFront(E data)
    {
        Container a = new Container();
        a.data = data;

        if(root == null)
        {
            root = a;
            lastChild = a;
        }
        else {
            a.next = root;
            root = a;
        }
    }

    public void addBack(E data) {
        Container a = new Container();
        a.data = data;
        if (lastChild == null)
        {
            root = a;
            lastChild = a;
        } else {
            lastChild.next = a;
            lastChild = a;
        }
    }

    public void print()
    {
        Container t = root;
        while (t != null)
        {
            System.out.print(t.data + " ");
            t = t.next;


        }
        System.out.print("\n");
    }

    public void delete(E data)
    {
        if(root == null)
            return;

        if (root == lastChild) {
            root = null;
            lastChild = null;
            return;
        }

        if (root.data == data) {
            root = root.next;
            return;
        }

        Container t = root;
        while (t.next != null) {
            if (t.next.data == data) {
                if(lastChild == t.next)
                {
                    lastChild = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }


    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        int count = 0;
        if(root != null){
            count++;
            while(root.next != null){
                count++;
                root = root.next;
            }
        }else{
            return 0;
        }
        return count;
    }
}
