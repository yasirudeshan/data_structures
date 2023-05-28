public class Link {
    public int iData;
    public Link next;

    Link(int id){
        iData = id;
        next = null;
    }

    public void displayLink(){
        System.out.println(iData);
    }
}
