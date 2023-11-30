public class MyLinkedList<T> {
    private Node<T> head;

    public MyLinkedList() {
        this.head = null;
    }

    public void add(T data) {
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

    public void delete(int index) {
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
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
// 노드 출력
        myList.printList();


// 노트 삭제
        myList.delete(2);
// 노드 출력
        myList.printList();
    }

}
