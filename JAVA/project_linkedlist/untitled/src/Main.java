public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));

        myLinkedList.delete(1);

        for (Integer data:myLinkedList) {
            System.out.println(data);
        }

        System.out.println("myStack");

        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());

        System.out.println("-------------------------------");

        System.out.println("문제 : ");
        for (Integer data:myStack) {
            System.out.println(data);
        }

        System.out.println("-------------------------------");

        System.out.println("myQueue");

        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.enQueue("일");
        myQueue.enQueue("이");
        myQueue.enQueue("삼");

        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());


    }
}