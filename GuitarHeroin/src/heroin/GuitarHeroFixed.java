package heroin;

import java.util.ArrayList;

/*****************************************************************************
 *  Compilation:  javac GuitarHeroLite.java
 *  Execution:    java  GuitarHeroLite
 *  Dependencies: StdAudio.java StdDraw.java GuitarString.java
 *
 *  Plays two guitar strings (concert A and concert C) when the user
 *  types the lowercase letters 'a' and 'c', respectively in the 
 *  standard drawing window.
 *
 ****************************************************************************/

public class GuitarHeroFixed {

    public static void main(String[] args) {

    	String piano = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
	     ArrayList<GuitarString> buff = new ArrayList<GuitarString>();
		 for(int i=0; i<piano.length(); i++)
		 {
			double frequency =  (440*Math.pow(1.05956, i-24));
			 buff.add(new GuitarString(frequency));
		 }

		 int magicBox=0;
		 final int beat = 10500;
		 int c = piano.indexOf('p');
        // the main input loop
        while (true) {
        	char key;
            // check if the user has typed a key, and, if so, process it
        	switch(magicBox)
        	{
        	case beat:
        		buff.get(c+7).pluck();
        		break;
        	case (int)(beat*1.5):
        		buff.get(c+6).pluck();
        		break;
        	case beat*2:
        		buff.get(c+4).pluck();
        		break;
        	case (int)(beat*2.5):
        		buff.get(c+4).pluck();
        		break;
        	case beat*3:
        		buff.get(c+6).pluck();
        		break;
        	case (int)(beat*8.5):
        		buff.get(c-3).pluck();
        		break;
        	case beat*9:
        		buff.get(c+7).pluck();
        		break;
        	case (int)(beat*9.5):
        		buff.get(c+6).pluck();
        		break;
        	case beat*10:
        		buff.get(c+4).pluck();
        		break;
        	case (int)(beat*10.5):
        		buff.get(c+4).pluck();
        		break;
        	case (int)(beat*11.5):
        		buff.get(c+6).pluck();
        		break;
        	case beat*13:
        		buff.get(c+2).pluck();
        		break;
        	case beat*14:
        		buff.get(c+4).pluck();
        		break;
        	case (int)(beat*14.5):
        		buff.get(c-3).pluck();
        		break;
        	case (int)(beat*18.5):
        		buff.get(c-3).pluck();
        		break;
        	case beat*19:
        		buff.get(c+4).pluck();
        		break;
        	case beat*20:
        		buff.get(c+6).pluck();
        		break;
        	case (int)(beat*20.5):
        		buff.get(c+7).pluck();
        		break;
        	case beat*22:
        		buff.get(c+4).pluck();
        		break;
        	case (int)(beat*22.5):
        		buff.get(c+1).pluck();
        		break;
        	case (int)(beat*23.5):
        		buff.get(c+2).pluck();
        		break;
        	case beat*25:
        		buff.get(c+4).pluck();
        		break;
        	case beat*26:
        		buff.get(c-3).pluck();
        		break;
        	case (int)(beat*26.5):
        		buff.get(c-3).pluck();
        		break;
        	case (int)(beat*27.5):
        		buff.get(c+6).pluck();
        		break;
        	case beat*33:
        		buff.get(c+7).pluck();
        		break;
        	case (int)(beat*33.5):
        		buff.get(c+6).pluck();
        		break;
        	case beat*34:
        		buff.get(c+4).pluck();
        		break;
        	case (int)(beat*34.5):
        		buff.get(c+4).pluck();
        		break;
        	case beat*35:
        		buff.get(c+6).pluck();
        		break;
        	case (int)(beat*39.5):
        		buff.get(c-3).pluck();
        		break;
        	case beat*40:
        		buff.get(c+7).pluck();
        		break;
        	case (int)(beat*40.5):
        		buff.get(c+6).pluck();
        		break;
        	case beat*41:
        		buff.get(c+4).pluck();
        		break;
        	case (int)(beat*41.5):
        		buff.get(c+4).pluck();
        		break;
        	case (int)(beat*43):
        		buff.get(c+6).pluck();
        		break;
        	case (int)(beat*43.5):
        		buff.get(c+2).pluck();
        		break;
        	case beat*45:
        		buff.get(c+4).pluck();
        		break;
        	case (int)(beat*45.5):
        		buff.get(c-3).pluck();
        		break;
        	case beat*50:
        		buff.get(c+4).pluck();
        		break;
        	case beat*51:
        		buff.get(c+6).pluck();
        		break;
        	case (int)(beat*51.5):
        		buff.get(c+7).pluck();
        		break;
        	case beat*53:
        		buff.get(c+4).pluck();
        		break;
        	case (int)(beat*53.5):
        		buff.get(c+1).pluck();
        		break;
        	case (int)(beat*55):
        		buff.get(c+2).pluck();
        		break;
        	case (int)(beat*55.5):
        		buff.get(c+4).pluck();
        		break;
        	case (int)(beat*56.5):
        		buff.get(c-3).pluck();
        		break;
        	case beat*57:
        		buff.get(c+2).pluck();
        		break;
        	case (int)(beat*57.5):
        		buff.get(c+4).pluck();
        		break;
        	case beat*58:
        		buff.get(c+6).pluck();
        		break;
        	case (int)(beat*58.5):
        		buff.get(c+4).pluck();
        		break;
        	case beat*59:
        		buff.get(c+2).pluck();
        		break;
        	case (int)(beat*59.5):
        		buff.get(c+1).pluck();
        		break;
        	default:
        		break;
        	}
        	
        	magicBox++;
            if (StdDraw.hasNextKeyTyped()) {
 
                // the user types this character
                key = StdDraw.nextKeyTyped();

                // pluck the corresponding string
               
               if(piano.indexOf(key)>=0)
               {
            	   buff.get(piano.indexOf(key)).pluck();
            	   
               }
            }

            // compute the superposition of the samples
            double sample = 0.0;
            for(int q = 0; q<piano.length(); q++)
            {
             sample += buff.get(q).sample();
            }
           // System.out.println(sample);
            // send the result to standard audio
            StdAudio.play(sample);

            // advance the simulation of each guitar string by one step
            for(int w = 0; w<piano.length(); w++)
            {
            	buff.get(w).tic();
            }
        }
    }

}