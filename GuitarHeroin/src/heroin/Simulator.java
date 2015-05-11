package heroin;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author student
 */
public class Simulator {
    public static File_Reader read;
    public static GuitarHeroFixed guitar;
    public static Piano piano;
    public static ArrayList<String> array;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        array= new ArrayList<String>();
        System.out.println("Would you like to use 'filereader' or 'ownstring'?");
        String input=scan.next();
        if(input.equals("filereader"))
        {
            System.out.println("Please insert file name");
            input = scan.next();
            read = new File_Reader(input);
            array=read.returnArray();
        }
        else if(input.equals("ownstring"))
        {
            System.out.println("Please insert your string");
            input = " ";
            input += scan.next();
            System.out.println("Make Array");
            makeArray(input);
        }
       piano = new Piano(array);
        guitar = new GuitarHeroFixed(piano);
        guitar.run();
        
        
    }
    public static void makeArray(String total)
    {
        total+="e";
        int start=0;
        System.out.println("This method is happening " + total);
		for(int i = 0; i<total.length(); i++)
		{
			if(total.charAt(i)=='e' && i!=0 && i!=total.length()-1)
			{
				array.add(total.substring(start,i));
				start=i+1;
			}
		}
    }
    
}
