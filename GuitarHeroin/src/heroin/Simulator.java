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
            input = scan.next();
            makeArray(input);
        }
        piano = new Piano(array);
        guitar = new GuitarHeroFixed(piano);
        guitar.run();
        
        
    }
    public static void makeArray(String total)
    {
        total+=" ";
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
    
}
