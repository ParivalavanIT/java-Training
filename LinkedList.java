class Node{
    int data ;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    } 
} 
class LList{
    Node head = null;
    Node tail = null;
    private static int size = 0;

    // Insert the elements at the end of the linked list
    void insert_end(int data){
        Node node = new Node(data); // creating new node
        if(head==null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }

    // Insert the elements at the begining of the linked list
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
        size++;
    }

    // Insert the elements at the particulat index of the linked list
    void insert_index(int data, int index){
        if(index == 0){
            insert_begin(data);
        }
        else if(index >= size){
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

    int delete(int index){
        int val = -1;
        if(index == 0){
            val = head.data;
            head = head.next;
        }else if(index >= size){
            return -1;
        }else{
            
        }
        size--;
        return val;
    }

    int freq(int key){
        Node temp = head;
        int count =  0;
        while(temp!=null){
            if(temp.data == key){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            if(temp==tail){
            System.out.print(temp.data );
            return;
            }
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
       
    }
    
    void display_rev(){
        display_rev(head);
        System.out.println("null");
    }

    void display_rev(Node curr){
        if(curr == null){
            return;
        }
        
        display_rev(curr.next);
        System.out.print(curr.data + " -> ");
    }
    
}
public class LinkedList {
    public static void main(String[] args) {
        LList linkedList = new LList();

        linkedList.insert_end(1);
        linkedList.insert_end(2);
        linkedList.insert_end(1);
        linkedList.insert_end(1);
        linkedList.insert_end(4);
        linkedList.insert_end(5);
        linkedList.display();
        System.out.println("\n"+linkedList.freq(1));
        int deletednum = linkedList.delete(2);
        linkedList.display();
        

    }
    
}
