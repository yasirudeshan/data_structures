public class Stack {
    private int top;
    private int maxSize;
    private int[] Arr;

    Stack(int size){
        maxSize = size;
        Arr = new int[size];
        top = -1;
    }

    public void push(int num) {
        if (top == maxSize - 1)
            System.out.println("Stack is Full");
        else
            Arr[++top] = num;
    }

    public void pop(){
        if(top == -1)
            System.out.println("Stack is Empty");
        else
            System.out.println(Arr[top--]);
    }

    public void peek(){
        if (top == -1)
            System.out.println("Stack is Empty");
        else
            System.out.println(Arr[top]);
    }

    public void displayStack(){
        for(int i = 0; i <= top; i++){
            System.out.print(Arr[i] + " ");

        }
        System.out.println("");
    }
}
