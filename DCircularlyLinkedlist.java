
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DCircularlyLinkedlist {
    Node head = null;
    Node tail = null;
    private int size = 0;

    void insert_begin(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.prev=tail;
            node.next = head;
            head = node;
        }
        tail.next = head;
        size++;
    }

    void insert_end(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.prev=tail;
            tail.next = node;
            tail = node;
            
        }
        tail.next = head;
        size++;
    }

    void insertAtIndex(int index, int data) {
        if (index == 0) {
            insert_begin(data);
        } else if (index >= size) {
            insert_end(data);
        } else {
            Node temp = head;
            while (index > 1 && temp != null) {
                temp = temp.next;
                index--;
            }
            Node node = new Node(data);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    void display() {
        Node temp = head;
        do {
            if (temp == tail) {
                System.out.print(temp.data + " ");
                break;
            }
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    int deleteAtBegin() {
        int res = head.data;
        head = head.next;
        tail.next = head;
        head.prev=tail;
        size--;
        return res;

    }
    int deleteAtEnd(){
        int res = tail.data;
        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
        size--;
        return res;
    }
    int deleteAtIndex(int index,int data){
        if(index == 0){
            return deleteAtBegin();
        }
        else if(index>=size){
            return deleteAtEnd();
        }
        else{
            Node temp = head;
            while(index>1 && temp!=null){
                temp = temp.next;
                index--;
            }
            int res = temp.next.data;
            temp.next = temp.next.next;
            size--;
            return res;
        }
    }
    int max(){
        Node temp = head;
        int max = head.data;
        do {
            if (temp.data>max) {
                max = temp.data;
            }
            temp = temp.next;
        } while (temp != head);
        return max;
    }
    
    int min() {
        Node temp = head;
        int min = head.data;
        do {
            if (temp.data < min) {
                min = temp.data;
            }
            temp = temp.next;
        } while (temp != head);
        return min;
    }

    public static void main(String[] args) {
        DCircularlyLinkedlist list = new DCircularlyLinkedlist();
        list.insert_begin(10);
        list.insert_begin(20);
        list.insert_begin(30);
        list.insert_end(40);
        list.insert_end(50);
        list.insertAtIndex(2, 100);
        list.display();
        System.out.println("Max: "+list.max());
        System.out.println("Min: "+list.min());
        System.out.println("Deleted: "+list.deleteAtBegin());
        System.out.println("Deleted: "+list.deleteAtEnd());
        list.display();
        System.out.println("Deleted: "+list.deleteAtIndex(2, 100));
        list.display();
    }
}
