public class Stack {
    private int[] Stack;
    private int top;
    private int size;
    private int length;
    public Stack(int data) {
        Stack = new int[data];
        length=0;
        top = -1;
        size = data;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            Stack[top] = data;
            length++;
        }
    }

    void pop() {
        if (!isEmpty()) {
            top--;
            length--;
        } else {
            System.out.println("Stack is empty");
        }
    }

    Boolean isEmpty() {
        return (top == -1);
    }

    Boolean isFull() {
        return (top == size - 1);
    }

    void display() {
        int temp = top;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            while(temp>-1){
                if(temp==0){
                System.out.print(Stack[temp--]);
                break;
                }
                System.out.print(Stack[temp--] + "-->");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is not Empty");
        }
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.display();
        if (stack.isFull()) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }
        stack.pop();
        if (stack.isFull()) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }
        stack.display();
        System.out.println(stack.length);
    }
}
