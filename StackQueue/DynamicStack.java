package StackQueue;

// Everything in DynamicStack will be same except for push
// now everything will be same as stack but we want to use push of dynamicStack class and not of the parent class then we will use override
public class DynamicStack extends CustomStack{
     public DynamicStack(){
         super(); // it will call CustomStack()
     }
    public DynamicStack( int size ){
        super(size);  // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous item in new data
            for(int i=0 ; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }

        // at this point we know that array is not full so we can insert item norally
        //insert item normally
        return super.push(item); 


    }
}
