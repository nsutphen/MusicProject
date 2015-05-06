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

	     ArrayList<GuitarString> buff = new ArrayList<GuitarString>();
		 for(int i=0; i<88; i++)
		 {
			double frequency =  (440*Math.pow(2, (i-49)/12));
			 buff.add(new GuitarString(frequency));
		 }

		 int magicBox=0;
		 final int beat = 10500;
//		 int c = piano.indexOf('p');
        // the main input loop
        while (true) {
        	char key;
            // check if the user has typed a key, and, if so, process it
        	magicBox++;
            if (StdDraw.hasNextKeyTyped()) {
 
                // the user types this character
                key = StdDraw.nextKeyTyped();

                // pluck the corresponding string
                
                /*Stuff that only went with the piano
                 * Will fix
                 * Soon
                 */
                
               
          /*     if(piano.indexOf(key)>=0)
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
            }*/
        }
    }

}}