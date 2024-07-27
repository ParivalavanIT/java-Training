public class Queue1 {
    private int[] Queue;
    private int front;
    private int rear;
    private int size;
    public Queue1(int size){
        Queue = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }
    void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            if(front==-1){
                front = 0;
            }
            Queue[++rear] = data;
        }
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            front++;
        }
    }
    void display(){
        int temp = front;
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            System.out.print("Queue elements: ");
            while(temp<=rear){
                System.out.print(Queue[++temp] + " ");
            }
            System.out.println();
        }
    }
    Boolean isEmpty(){
        return front==-1;
    }
    Boolean isFull(){
        return (rear==size-1);
    }
    public static void main(String[] args) {
        Queue1 queue = new Queue1(10);
        if(queue.isEmpty()){
            System.out.println("Queue is Empty");
        }
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        queue.dequeue();
        queue.display();
    }
    
}
