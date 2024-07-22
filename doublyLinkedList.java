class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class doublyLinkedList {
    Node head = null;
    Node tail = null;
    public static int size = 0;

    void addAtStart(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    void addAtEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    void addAtPos(int data, int pos) {
        if (pos == 0) {
            addAtStart(data);
        } else if (pos >= size) {
            addAtEnd(data);
        } else {
            Node node = new Node(data);
            Node temp = head;
            while (pos > 1 && temp != null) {
                temp = temp.next;
                pos--;
            }
            node.prev = temp;
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            if (temp == tail) {
                System.out.print(temp.data + " --> null");
                break;
            } else {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
        }
    }

    void display_rev() {
        display_rev(head);
        System.out.println("null");
    }

    void display_rev(Node curr) {
        if (curr == null) {
            return;
        }

        display_rev(curr.next);
        System.out.print(curr.data + " -> ");
    }

    int deleteStart() {
        int data = head.data;
        head = head.next;
        size--;
        return data;

    }

    int deleteAtIndex(int index) {
        Node temp ;
        int data=0;
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (index == 0) {
            data=head.data;
            head = head.next;
        }
        return data;
    }

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        dll.addAtStart(10);
        dll.addAtStart(20);
        dll.addAtStart(30);
        dll.addAtEnd(40);
        dll.addAtEnd(50);
        dll.addAtEnd(60);
        dll.addAtPos(70, 3);
        dll.display();
        System.out.println();
        dll.display_rev();
        int deletedNum = dll.deleteStart();
        System.out.println(deletedNum);
        dll.display();
    }
}
