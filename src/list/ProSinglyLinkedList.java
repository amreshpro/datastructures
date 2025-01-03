package list;

/**
 * add()
 * delete(int value) and deleteAtIndex(int index)
 * pop() or deleteAtLast
 * insertAfterNode(Node t, int data)
 * insertBeforeNode(Node t, int data)
 * push() or insertAtLast()
 * display() or print()
 **/

class SinglyLinkedList {
    public class Node {
        int data;
        Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    SinglyLinkedList() {
        this.head = null;

    }

    SinglyLinkedList(int data) {
        head.next = new Node(data);

    }

    void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;

        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            System.out.println("Added Successfully");

        }

    }

    void pop() {
        if (this.head == null) {
            System.out.println("Empty List ");
        } else if (this.head.next == null) {
            this.head = null;
            System.out.println("Deleted from last successfully");
        } else {
            Node temp = this.head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            System.out.println("Deleted from last successfully");

        }

    }

    void insertAfterNode(Node temp, int data) {
        if (temp == null) {
            System.out.println("Targeted Node is null");
            return;
        }
        Node newNode = new Node(data);
        Node afterNode = temp.next;
        temp.next = newNode;
        newNode.next = afterNode;
        System.out.println("Inserted After Node Successfully");

    }

    void insertBeforeNode(Node temp, int data) {
        if (temp == null) {
            System.out.println("Empty List");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp;
        Node start = this.head;

        while (start.next != temp) {
            start = start.next;
        }
        start.next = newNode;
        System.out.println("Inserted After Node Successfully");


    }

    void deleteAtValue(int data) {
        // empty list
        // only one item
        if (this.head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {

            if (temp.next.data == data) {
                temp.next = temp.next.next;
                System.out.println("Deleted Successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("No value found to delete");

    }

    void display() {
        if (this.head != null) {
            Node temp = this.head;
            while (temp != null) {
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
        } else {
            System.out.println("Empty List");
        }
        System.out.println();
    }

}

public class ProSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList slist = new SinglyLinkedList();
        slist.add(1);
        slist.add(2);
        slist.add(3);
        slist.add(4);
        slist.add(5);
        slist.add(6);
        slist.add(7);
        slist.display();
        slist.pop();
        slist.pop();
        slist.display();
        SinglyLinkedList.Node secondNode = slist.head.next;
        slist.insertAfterNode(secondNode, 99);
        slist.display();
        slist.insertAfterNode(secondNode, 33);
        slist.display();
        slist.deleteAtValue(3);
        slist.display();

    }
}
