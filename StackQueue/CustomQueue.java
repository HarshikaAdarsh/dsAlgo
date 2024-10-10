package StackQueue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0 ;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){

        this.data = new int[size];
    }
    public boolean isFull(){

        return end == data.length  ;
    }
    private boolean isEmpty(){

        return end ==  0 ;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item; // this means first it assign the value and then do end++
        // it is similar to
        // data[end] = item;
        // end++;

        return true;
    }

    // remove element in queue

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];
        // shift element to left by one
        for(int i = 1 ; i < end ; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    // display the item at front
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    // display the item
    public void display(){
        for(int i = 0 ; i < end ; i++){
            System.out.print(data[i] + " <-");
        }
        System.out.println("END");
    }
}
