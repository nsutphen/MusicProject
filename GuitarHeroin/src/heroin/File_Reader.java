package heroin;
import java.io.*;
import java.util.ArrayList;
public class File_Reader  {

	String file;
	String line = null;
	String total= " ";
	ArrayList<String> array;
	public File_Reader(String fileName) {
		array = new ArrayList<String>();
		readFile(fileName);
		total+=" ";
		toArray();
		
	}
	public void toArray()
	{
		int start=0;
		for(int i = 0; i<total.length(); i++)
		{
			if(total.charAt(i)==' ' && i!=0)
			{
				array.add(total.substring(start+1,i));
				start=i;
			}
		}
	}
        public ArrayList<String> returnArray()
        {
            return array;
        }
	public void readFile(String fileName)
	{
		//Pulled from https://www.caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html
		  try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);
	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	                total+=line;
	            }    

	            // Always close files.
	            bufferedReader.close();            
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileName + "'");                   
	            // Or we could just do this: 
	            // ex.printStackTrace();
	        }
	}
	
	

}
