package list;

import java.util.AbstractList;

public class ForwardLinkedList <T> extends AbstractList {

    private Container<T> root;

    public void addUp(T newValue){
        if(root == null){
            root = new Container<T>(newValue);
            return;
        }

        Container<T> newObject = new Container<T>(newValue);
        newObject.next = root;
        root = newObject;
    }

    public void addBack(T newValue){

        // проверяем корневой, если пустой, значит новый элемент будет корневым
        if(root == null){
            root = new Container<T>(newValue);
            return;
        }

        // если дошли сюда, значит корневой есть, осталось найти последний и в него добавить ссылку на новый
        // создадим переменную, которая будет хранить элемент последней итерации
        // изначально последним елементом является рут
        // затем в цикле мы найдем последний элемент
        Container<T> lastChild = root;



        // смотрим, если у lastchild есть дочерний элемент, то мы заменяем значение ластчайлд на значение его дочернего
        // и так до тех пор пока не дойдет до элемента у которого не будет дочерних, он и будет последним
        while(lastChild.next != null){
            lastChild = lastChild.next;
        }


        // записываем в последний элемент сслыку на новый
        lastChild.next = new Container<T>(newValue);

    }


    public void print(){
        Container<T> current = root;

        while(current.next != null){
            System.out.println(current.value);
            current = current.next;
        }

        System.out.println(current.value);
        System.out.println("\n ");
    }

    public void delete(int index){

        if(index == 0){
            if(root != null){
                root = root.next;
            }
            return;
        }

        Container<T> Parent = this.getContainer(index - 1);
        Container<T> Inheritor = this.getContainer(index + 1);

        Parent.next = null;

        if(Inheritor != null){
            Parent.next = Inheritor;
        }

    }

    public Container<T> getContainer(int index) {

        int i = 0;
        Container<T> current = root;

        while(current.next != null){
            if(i == index) {
                return current;
            }
            i++;
            current = current.next;
        }

        return current;
    }

    @Override
    public Object get(int index) {

        int i = 0;
        Container<T> current = root;

        while(current.next != null){
            if(i == index) {
                return current.value;
            }
            if(current.next == null && i + 1 != index) return null;
            i++;
            current = current.next;
        }

        return current.value;
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
