import java.util.Scanner;

public class PigLatin 
{

	public static void main(String[] args) 
	{  
		     Scanner scan = new Scanner(System.in);
	         String word; 
	         String latin = " ";  
	         char first;
	         boolean cap = false;
	         String line;
	         System.out.println("Welcome to Pig Latin Translator");
	         System.out.print("Enter line to be translated: ");
	         line = scan.nextLine();
	      	 scan = new Scanner(line);
	      	
	      	
	         while (scan.hasNext())	
	         {
	            word = scan.next();
	            first = word.charAt(0);
	            if ('A' <= first && first <= 'Z')  
	            {
	               first = Character.toLowerCase(first);
	               cap = true;
	            }
	            else
	         		cap = false;
	         
	
	            if (first=='a' || first=='e' || first=='i' || first=='o' || first=='u')
	               latin = word + "way";
	            else  
	            {	
	               if (cap)
	               {
	                  latin = "" + Character.toUpperCase(word.charAt(1));  
	                  latin = latin + word.substring(2) + first + "ay";
	               }
	               else
	                  latin = word.substring(1) + first + "ay";
	            }
	         
	            System.out.print(latin + " ");
	         }
	         
	   scan.close(); 
	 }
}