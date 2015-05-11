package heroin;
import java.util.ArrayList;
public class Piano {

    private static GuitarString[] keyboard;
    private static int[] chords;
    private static int beat;
    private static int[][] toPlay;
    public Piano(){
  

    }
    public Piano(ArrayList<String> sheet)
    {
        beat = 0;
        toPlay = new int[sheet.size()][2];
         for(int x=0; x<sheet.size(); x++)
        {
        	 toPlay[x][0] = Integer.parseInt(sheet.get(x).substring(0,sheet.get(x).indexOf("b")).trim());

        }
         for(int k=0; k<sheet.size(); k++)
         {
             beat+= Integer.parseInt(sheet.get(k).substring(sheet.get(k).indexOf("b")+1),sheet.get(k).length());
             toPlay[k][1]=beat*10500;
         }
    }
    public int nextNote(int i)
    {
        return toPlay[i][0];
    }
    public int nextBeat(int i)
    {
        return toPlay[i][1];
    }
 
    
   /* public static void play(String notes) {
        int notebeat = 0;
        if (notes.contains("c")) {
            String temp = notes;
            int[] chords = new int[notes.length() / 3];
            int count = 0;
            while (temp.contains("c")) {
                int i = Integer.parseInt(temp.substring(0, temp.indexOf("c")));
                chords[count] = i;
                temp = temp.substring(temp.indexOf("c"));
                count++;
            }
            int i = Integer.parseInt(temp.substring(0, temp.indexOf("b")));
            chords[count] = i;
            beat = Integer.parseInt(temp.substring(temp.indexOf("b")));
        } else {
            int[] chords = new int[1];
            chords[0] = Integer.parseInt(notes.substring(0, notes.indexOf("b")));
        }
        
        for (int key : chords) {
            if (key < 88) {
                keyboard[key].pluck();
                double sample = 0.5;
                for (int i = 0; i < keyboard.length; i++) {
                    double original = sample;
                    sample = original + keyboard[i].sample();
                }
                StdAudio.play(sample);
                for (int i = 0; i < 37; i++) {
                    keyboard[i].tic();
                }
            }
        }
    }*/
}
