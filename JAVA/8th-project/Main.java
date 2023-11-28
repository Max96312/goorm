import java.util.LinkedList;

class Node<T>{
    private T data;

    public Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }

    public T getData(){
        return data;
    }
}

    class MyLinkedList<T> extends LinkedList {
    }

    public Node<T> get(int index) {
        Node<T> findNode = head;
        for (int i = 0; i < index; i++) {
            findNode = findNode.next;
            if (findNode == null) {
                return new Node("입력된 index는 MyLinkedList의 범위를 초과하셨습니다.");
            }
        }
        return findNode;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}