import list.ForwardLinkedList;
import string.StringFormatter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("_____________________________");
        List<String> strings = Arrays.asList("jjhbdx1", "2jghfj", "dd3vggf4");
        StringFormatter.format(strings);

        System.out.println("\nTask 2");
        System.out.println("_____________________________");
        ForwardLinkedList<Integer> list = new ForwardLinkedList<Integer>();
        list.addBack(1);
        list.addUp(10);
        list.addBack(2);
        list.addBack(3);
        list.addBack(4);
        list.print();

        list.delete(1);
        list.print();

        System.out.println("\nSize: " + list.size());


    }
}
