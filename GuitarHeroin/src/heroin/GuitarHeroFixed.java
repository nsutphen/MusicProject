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

    public GuitarString[] keyboard;
    public Piano piano;
    public GuitarHeroFixed(Piano p)
    {
        piano = p;
    }
    public void run() {
	     keyboard = new GuitarString[89];
        for (int i = 1; i <= 88; i++) {
            keyboard[i] = new GuitarString((Math.pow(2, (i - 49) / 12) * 440));
        }

		 int magicBox=0;
		 final int beat = 10500;
                 int indexKeyboard = 0;
        // the main input loop
        while (true) {
        	char key;
            // check if the user has typed a key, and, if so, process it
        	
        	magicBox++;
            if (piano.nextBeat(indexKeyboard)==magicBox) {
 
               keyboard[piano.nextNote(indexKeyboard)].pluck();
               indexKeyboard++;
            }

            // compute the superposition of the samples
            double sample = 0.0;
            for(int q = 0; q<keyboard.length; q++)
            {
             sample += keyboard[q].sample();
            }
           // System.out.println(sample);
            // send the result to standard audio
            StdAudio.play(sample);

            // advance the simulation of each guitar string by one step
            for(int w = 0; w<keyboard.length; w++)
            {
            	keyboard[w].tic();
            }
        }
    }

}