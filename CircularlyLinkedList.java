
class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CircularlyLinkedList {
    Node head=null;
    Node tail=null;
    private int size=0;
    void insert_begin(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
        tail.next = head;
        size++;
    }

    void insert_end(int data){
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        tail.next=head;
        size++;
    }
    void insertAtIndex(int index,int data){
        if(index==0){
            insert_begin(data);
        }
        else if(index>=size){
            insert_end(data);
        }
        else{
            Node temp = head;
            while(index>1 && temp!=null){
                temp = temp.next;
                index--;
            }
            Node node = new Node(data);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }
    void display(){
        Node temp = head;
        do{if(temp==tail){
                System.out.print(temp.data + " ");
                break;
            }
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }while(temp!=head);
        System.out.println();
    }
    int deleteAtBegin(){
        int res = head.data;
        head = head.next;
        tail.next=head;
        return res;
        
    }
    public static void main(String[] args) {
        CircularlyLinkedList cll = new CircularlyLinkedList();
        cll.insert_begin(10);
        cll.insert_begin(20);
        cll.insert_begin(30);
        cll.insert_end(40);
        cll.insert_end(50);
        cll.insertAtIndex(2, 100);
        cll.display();
        System.out.println(cll.deleteAtBegin());
        cll.display();

    }
}
