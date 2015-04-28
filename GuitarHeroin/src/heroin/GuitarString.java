package heroin;
import java.util.ArrayList;
import java.util.Random;
public class GuitarString {
	RingBuffer buff;  
	int numTimes;
    GuitarString(double frequency){
    	int N = (int)( 44000/frequency);
    	numTimes=0;
    	buff = new RingBuffer(N);
    } 
   /* GuitarString(ArrayList<double> init){
    	buff = init;
    }  */   // create a guitar string whose size and initial values are given by the array
    void pluck(){
    	while(!buff.isEmpty())
    	{
    		buff.dequeue();
    	}
    	while(!buff.isFull())
    	{
    		Random random = new Random();
    		buff.enqueue(random.nextDouble()-0.5);

    	}
    }                     // set the buffer to white noise
    void tic(){
    	numTimes++;
    	double first = buff.dequeue();
    	double second = buff.peek();
    	buff.enqueue((.5*(first+second))*.994);
    }                           // advance the simulation one time step
    double sample() {return buff.peek();}                        // return the current sample
    int time() {return numTimes;}                         // return number of tics
  	
    
}
