public class MyLinkedList<T> {
    private Node<T> head;

    public MyLinkedList() {
        this.head = null;
    }

    public void addAtTail(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.nextNode != null) {
            current = current.nextNode;
        }
        current.nextNode = newNode;
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.nextNode;
            return;
        }

        Node<T> current = head;
        Node<T> prev = null;
        int count = 0;

        while (current != null && count != index) {
            prev = current;
            current = current.nextNode;
            count++;
        }

        if (count == index && current != null) {
            prev.nextNode = current.nextNode;
        }
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.nextNode;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
// 노드 추가
        myList.addAtTail(1);
        myList.addAtTail(2);
        myList.addAtTail(3);
        myList.addAtTail(4);
// 노드 출력
        myList.printList();


// 노트 삭제
        myList.deleteAtIndex(2);
// 노드 출력
        myList.printList();
    }

}
