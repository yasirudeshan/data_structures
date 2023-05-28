public class LinkedList {
    private Link first;
    private Link current;

    LinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return(first == null);
    }

    public void displayList(){
        current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
    }

    public boolean find(int id){
        while(current != null){
            if (current.iData == id)
                return true;
            else
                current = current.next;
        }
        return false;
    }

    public void insertFirst(int id){
        Link l1 = new Link(id);
        l1.next = first;
        first = l1;
    }

    public void insertMiddle(int key ,int id){
        Link l1 = new Link(id);
        current  = first;
        while(current != null){
            if(current.iData == key){
                l1.next = current.next;
                current.next = l1;
            }
            else
                current = current.next;
        }

    }



}
