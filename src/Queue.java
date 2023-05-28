public class Queue {
    private int front;
    private int rear;
    private int[] Arr;
    private int maxSize;
    private int nItems;

    Queue(int size){
        nItems = 0;
        maxSize = size;
        Arr = new int[size];
        front = 0;
        rear = -1;
    }

    public void insert(int num){

        if(!isFull()) {
            if(rear == maxSize - 1){
                rear = -1;
            }
            Arr[++rear] = num;
            nItems++;
        }
        else
            System.out.println("Queue is Full");
    }

    public void remove(){
        if(!isEmpty()){
            if(front == maxSize -1){
                front = 0;
            }
            System.out.println(Arr[front++]);
            nItems--;
        }
        else
            System.out.println("Queue is Empty");
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println(Arr[front]);
        }
    }

    public void displayQueue(){
        if(!isEmpty()){
            for(int i = front; i <= rear; i++){
                System.out.print(Arr[i] + " ");
            }
            System.out.println("");
        }
        else
            System.out.println("Queue is Empty");
    }

    public boolean isFull(){
        return(nItems == maxSize);
    }

    public boolean isEmpty(){
        return(nItems == 0);
    }
}
