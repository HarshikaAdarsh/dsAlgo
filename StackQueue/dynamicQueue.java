package StackQueue;

public class dynamicQueue extends  circularQueue{
    public dynamicQueue(){
        super();
    }
    public dynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean isFull() {
        return super.isFull();
    }

    @Override

    public boolean insert(int item) {
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous item in new data
            for(int i=0 ; i < data.length; i++){
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        // at this point we know that array is not full so we can insert item norally
        //insert item normally
        return super.insert(item);
    }
}
