import java.util.Scanner;

/**
 	This program prompts the users to enter a word and then computes the reverse of that word
 	@author delaneyt
*/
public class c2a3q2_2014_TimDelaney_Rev1
{
	/**
		Recursive method which computes the reverse of a world
	 	@param str the word to be reversed
	 	@return the word reversed
	 */
	public static String reverse(String str)
	{
		// Separate case for shortest strings. 
		if ((str.length()  <= 1) || (null == str))
		{
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}
	
	
	
	/**
	 	Prompts for a word, sends that word to a method to be reversed, then prints this reverse
	 	@param args
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a word to be reversed: ");
		String wordToBeReversed = in.next();
		String wordReversed = reverse(wordToBeReversed);
		System.out.println(wordReversed);
		in.close();
	}
}
