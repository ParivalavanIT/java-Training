class Node{
    int data;
    Node prev ;
    Node next;
    public Node(int data){
        this.data = data;
        this.next= null;
        this.prev = null;
    }
}
public class Main{
    Node head = null;
    Node tail = null;
    private int size = 0;
    void insert_begin(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }
    void insert_end(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            Node temp = tail;
            temp.next = node;
            node.prev = temp;
            tail = node; 
        }
        size++;

    }
    void insert_index(int data, int index){
        if(index == 0){
            insert_begin(data);
        }else if(index>=size){
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
            node.prev = temp;
            temp.next.prev = node;
        }
        size++;
    }
    int deleteAtEnd(){
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        return temp.data;
    }

    int deleteAtBegin(){
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        return temp.data;
    }

    int get(int num){
        Node temp = head;
        int res=0;
        while(temp!=null && num>0){
            temp=temp.next;
            num--;
        }
        res=temp.data;
        return res;
        
    }
    Boolean isPresent(int data){
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    int numAt(int data){
        Node temp = head;
        int index=-1;
        if(isPresent(data)){
            index=0;
            while (temp != null) {
                if (temp.data == data) {
                    return index;
                }
                temp = temp.next;
                index++;
            }
        }
        
        return index;
    }
    void kill(){
        head=null;
        tail=null;
        size=0;
        System.out.println("\nList killed");
    }
    void display(){
        System.out.println();
        Node temp = head;
        if(head==null){
            System.out.println("List Empty");
        }
        while(temp!=null){
            if(temp.next == null){
                System.out.print(temp.data);
                return;
            }
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }
    void display_rev(){
        System.out.println();
        Node temp = tail;
        if(temp==null){
            System.out.println("List Empty");
        }
        while(temp!=head.prev){
            if(temp.prev == null){
                System.out.print(temp.data);
                return;
            }
            System.out.print(temp.data + " --> ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Main list = new Main();
        list.insert_begin(10);
        list.display();
        list.insert_begin(20);
        list.display();
        list.insert_begin(30);
        list.display();
        list.insert_begin(40);
        list.display();
        list.insert_begin(50);
        list.display();
        list.insert_begin(60);
        list.display();
        list.insert_begin(70);
        list.display();
        list.insert_begin(80);
        list.display();
        list.insert_begin(100);
        list.display();
        list.insert_end(900);
        list.display();
        list.insert_index(1200, 50);
        list.display();
        System.out.println();
        System.out.println(list.get(3));
        System.out.println(list.numAt(1200));
        list.display_rev();
        list.kill();
        list.display();
    }
}