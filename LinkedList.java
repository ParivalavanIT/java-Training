class Node{
    int data ;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    } 
} 
class LList{
    Node head;
    public LList(){
        this.head=null;
    }
    public void append(int data){
        Node newNode =new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node last = head;

        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;

    }
    public void show(){
        Node current=head;
        if(current == null){
            System.out.println("First insert the data");
        }
        while(current != null){
            if(current.next==null){
                System.out.println(current.data);
            }else{
                System.out.print(current.data + " --> ");
            }
            current=current.next;
        }
        
    }
    public void search(int key){
        Node current = head;
        if(current ==null ){
            System.out.println("Your list is empty");
        }
        while(current != null){
            if(current.data==key){
                System.out.println("Element found");
                return;
            }
            else{
                current = current.next;
            }
        }
        System.out.println("Element not found");
    }
}
public class LinkedList {
    public static void main(String[] args) {
        LList linkedList = new LList();
        linkedList.show();

        linkedList.append(10);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);
        linkedList.append(60);
        linkedList.append(70);
        linkedList.append(80);
        linkedList.search(40);

        linkedList.show();

    }
    
}
