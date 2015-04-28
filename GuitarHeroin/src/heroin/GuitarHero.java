package heroin;
import java.util.ArrayList;
public class GuitarHero {

	 public static void main(String[] args) {
		 String piano = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/'?";
	     ArrayList<GuitarString> buff = new ArrayList<GuitarString>();
		 for(int i=0; i<piano.length(); i++)
		 {
			double frequency =  (440*Math.pow(1.05956, i-24));
			 buff.add(new GuitarString(frequency));
		 }
	        // the main input loop
		 double sample = 0.0;
		 int musicBox= 0;
	        while (true) {
	        	int place=-1;
	        	final int beat = 12500;
	            // check if the user has typed a key, and, if so, process it
	        	String key="";
	        	for(int q = 0; q<piano.length(); q++)
	        	{
	        		if(buff.get(q).sample()>0)
	        		{
	        			sample=  buff.get(q).sample();
	        		}
	        		//System.out.println(sample);
	        	}
	        	/*if(musicBox==(8*beat))
            	{
            		key="q";
            	}*/
            /*	if(musicBox==(5*beat))
            	{
            		key="2";
            	}
            	if(musicBox==(7*beat))
            	{
            		key="w";
            	}*/
            	place = piano.indexOf(key);
	               if(place>=0)
	               {
	                	buff.get(place).pluck();
	            
	               }
	               buff.get(0).pluck();
            	musicBox++;
	            if (StdDraw.hasNextKeyTyped()) {
	 
	                // the user types this character
	            	key="";
	                key+= StdDraw.nextKeyTyped();
	               place = piano.indexOf(key);
	               if(place>=0)
	               {
	                	buff.get(place).pluck();
	                	System.out.println("Plucked");
	            
	               }
	                
	                // pluck the corresponding string
	            //    if (key == 'a') { stringA.pluck(); }q
	            //    if (key == 'c') { stringC.pluck(); }
	            }

	            // compute the sup`erposition of the samples	
	          //  double sample = stringA.sample() + stringC.sample();
	           
	            // send the result to standard audio
	            
	            
	            
	           // System.out.println(a);
	          //  System.out.println("I work");
	           // System.out.println();
	            StdAudio.play(sample);
	            if(place>=0)
	            {
	            buff.get(place).tic();
	            }
	            

	            // advance the simulation of each guitar string by one step
	         
	           
	      }
	    }
	
		 }
		 
	 


