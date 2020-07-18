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
        ForwardLinkedList forwardLinkedList = new ForwardLinkedList();
        forwardLinkedList.addBack(1.0);
        forwardLinkedList.addBack(2);
        forwardLinkedList.addBack("brrr");
        forwardLinkedList.addFront(6);

        forwardLinkedList.print();

        forwardLinkedList.delete(3);
        forwardLinkedList.print();

        System.out.println(forwardLinkedList.size());


        System.out.println();
    }
}
