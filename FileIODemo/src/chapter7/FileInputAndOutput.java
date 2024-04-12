package chapter7;

/**
 * Use PrintWriter to create a new file. Then use Scanner to 
 * read this file to make sure everything is good.
 *
 * @author 
 * @version 1.00 06/03/28
 */
import java.io.*;
import java.util.*;

public class FileInputAndOutput {
    
    public static void main(String[] args) throws IOException
    {
    	
    	// DEFAULT TEST FILE
    	
    	// create a file named "defaulttest.txt"
    	PrintWriter outFile = new PrintWriter("defaulttest.txt");
    	
    	// put a line of information into it
    	outFile.println("This is the default file");
    	
    	// put a lot of lines of information into the file
    	for (int i = 0; i < 100; i++) {
    		outFile.println("This is line: " + (i+2));
    	}
    	
    	// close the file
    	outFile.close();
    	
    	
    	//////////////////////////////////////////////////////////
    	
    	
    	// LAST NAMES FILE
    	
    	// create a file named "lastnames.txt"
    	PrintWriter outFile1 = new PrintWriter("lastnames.txt");
    	
    	// put some last names into the file
    	outFile1.println("Jackson");
    	outFile1.println("Jackso");
    	outFile1.println("Jacks");
    	outFile1.println("Jack");
    	outFile1.println("Jac");
    	outFile1.println("Ja");
    	outFile1.println("J");
    	outFile1.println("Jacksons");
    	outFile1.println("Jaxon");
    	outFile1.println("Jax");
    	
    	// close the file
    	outFile1.close();
    	
    	/////////////////////////
    	
    	// read lastnames.txt file with Scanner
    	Scanner input = new Scanner(new File("lastnames.txt"));
    	
    	// read each line
    	while(input.hasNext()) {
    		String tempString = input.nextLine();
    		System.out.println(tempString);
    	}
    	
    	//////////////////////////////////////////////////////////
    	
    	
    	
    	// 2024 DATES FILE
    	
    	// create new file "2024dates.txt"
    	PrintWriter outFile2 = new PrintWriter("2024dates.txt");
    	
    	// now put the days of year 2024 into this file
    	for (int month = 1; month <= 12; month++) {
    		for (int day = 1; day <= 30; day++) {
    			Date tempDate = new Date(2024, month, day);
    			outFile2.println(tempDate.toString());
    		}
    	}
    	
    	// close the file, which is necessary
    	outFile2.close(); 
    	
    	/////////////////////////
    	
    	
    	// read 2024dates.txt file with Scanner
	    Scanner input1 = new Scanner(new File("2024dates.txt"));
	    
	    // read each line
	    while(input1.hasNext()) {
	    	String tempString = input1.nextLine();
	    	System.out.println(tempString);
	    }
	    
    	
	    
	    //////////////////////////////////////////////////////////
	    
    	
    	
    	// FAVORITES FILE
    	
    	// create a new file named "favorites.txt"
    	PrintWriter outFile3 = new PrintWriter("favorites.txt");
    	
    	// put text/information into file
    	outFile3.println("Lauren's Favorite Things");
    	outFile3.println("");
    	outFile3.println("Color: Brown");
    	outFile3.println("Food: Sushi");
    	outFile3.println("Season: Autumn");
    	outFile3.println("Drink: Coffee");
    	outFile3.println("Video Game: Minecraft");
    	outFile3.println("Song: Hard To Handle by Otis Redding");
    	
    	// close file
    	outFile3.close();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	/*
    	// open / create a new file
    	try {
    		outFile = new PrintWriter("SomeNames.txt");
    	}catch(IOException exc){
    		System.out.println("IO Error:" + exc);
    	}
    	
    	outFile.println("Zhao	Qian	Sun	Li	Li	Li");
	    outFile.println("Zhou	Wu	Zheng	Wang");
	    // close two files
	    outFile.close();  
	    
	    // put some names into the file
	    try {
    		outFile = new PrintWriter("Dates.txt");
    	}catch(IOException exc){
    		System.out.println("IO Error:" + exc);
    	}
	    
	    // create 360 dates for year 2021 and put them into the file
	    for(int m =1; m<= 12; m++)
	    {
	    	for(int d =1; d<= 30; d++)
	    	{
	    		Date tempDate = new Date(2021, m, d);
	    		outFile.println(tempDate.toString());	    		
	    	}
	    }	
	    outFile.close();
	    
	    */
    	
    	
	    
	    
	    
	    
	    
	    // read this file using Scanner
	    Scanner input2 = new Scanner( new File("SomeNames.txt") );
	    	    	        
	    // read each line
	    while( input2.hasNext() )
	    {
	    	String tempString = input2.nextLine();
	    	System.out.println(tempString); 		    
    	}
	    
	    
	    // read 2024dates.txt file with Scanner
	    input = new Scanner(new File("2024dates.txt"));
	    
	    // read each line
	    while(input.hasNext()) {
	    	String tempString = input.nextLine();
	    	System.out.println(tempString);
	    }
	    
	    
	    
	    
	    
	    
	   
	    // back to SomeNames
	    input = new Scanner( new File("SomeNames.txt") );
	    while( input.hasNext() )
	    {
	    	String tempString = input.nextLine();
	       	StringTokenizer stnizer = new StringTokenizer(tempString, "	");
	    	
	    	// another while loop to get tokens from each line
	    	while(stnizer.hasMoreTokens())
	    	{
	    		String temp = stnizer.nextToken();
	    		i++;
	    		
	    		// play with the tokens    		
	    		System.out.println("The token is " + temp);	 
	    			    		
	    	}	// end of inner loop
	    
    	}	// end of outter loop
	    System.out.println("");
	    input.close();  
	    
    }
}
