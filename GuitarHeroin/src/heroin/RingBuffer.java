package heroin;
import java.util.ArrayList;
public class RingBuffer {
	ArrayList<Double> buff;
	int cap;
  public  RingBuffer(int capacity){
    	cap = capacity;
    	buff = new ArrayList<Double>();
    	for(int i = 0; i<cap; i++)
    	{
    		buff.add(0.0);
    	}
    }  
    int size(){return buff.size();}     
    int cap(){return cap;}
    boolean isEmpty(){return buff.size()<=0;}                 // is the buffer empty (size equals zero)?
    boolean isFull(){return buff.size()==cap;}                  // is the buffer full  (size equals capacity)?
    void enqueue(double x){
    	
    	if(!isFull())
    	{
    		buff.add(x);
    		//System.out.println(x);
    	}
    }         // add item x to the end
    double dequeue() throws IndexOutOfBoundsException{
    	
    	double hold = buff.get(0);
    	buff.remove(0);
    	return hold;
    	
    }                 // delete and return item from the front
    double peek(){return buff.get(0);}                    // return (but do not delete) item from the front
}
