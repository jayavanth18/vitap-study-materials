import static java.lang.System.exit;

class StackUsingLinkedlist {

    private class Node {

        int data;
        Node next; 
    }

    Node top;

    StackUsingLinkedlist()
    {
        this.top = null;
    }

    // Using this function we will be pushing elements into the stack
    public void push(int x) 
    {

        Node temp = new Node();

        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        temp.data = x;

        temp.next = top;

        top = temp;
    }

    // Using this function we will be checking whether the stack is empty or not
    public boolean isEmpty()
    {
        return top == null;
    }

    // using this function we will return the top element of the stack
    public int peek()
    {

        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Using this function we will pop the top element of the stack
    public void pop() 
    {

        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        top = (top).next;
    }

    // this function will be used to display the items of the stack
    public void display()
    {

        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {

                System.out.printf("%d->", temp.data);

                temp = temp.next;
            }
        }
    }
}

class ssll {
    public static void main(String[] args)
    {

        StackUsingLinkedlist stk = new StackUsingLinkedlist();

        stk.push(4);
        stk.push(3);
        stk.push(2);
        stk.push(1);
        stk.push(154);
        stk.push(126);
        stk.push(178);
        stk.push(192);
        stk.push(100);
        stk.push(146);
        stk.push(178);
        stk.push(168);
        stk.push(158);

        stk.display();

        System.out.printf("\nTop element is %d\n", stk.peek());
        System.out.println("Stack after popping 2 times");
        //stk.pop();
        //stk.pop();

        stk.display();

        System.out.printf("\nTop element is %d\n", stk.peek());
    }
}