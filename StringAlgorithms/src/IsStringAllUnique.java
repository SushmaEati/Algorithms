/**
 * 
 */

/**
 * @author Sushma
 *
 */
public class IsStringAllUnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//This code works for strings with alphabets within range 'a' to 'z'.
		//"sushma","suhma","a","","-435654","erw5565" - Test Cases
		String input = "erw5565";
		//Check value
		int check  = 0;
		
		//Iterate over the string for each character.
		for(char charector: input.toCharArray())
		{
			//If the character is not a lower alphabet then exit the program.
			if(!((charector-'a')>=0 &&(charector-'a')<=25))
			{
				System.out.println("String contains charactors that are not in range 'a-z'");
				System.exit(-1);
			}
			//Left shift the value of character and do bitwise end with check (If it is zero all values are unique till now, else there is a duplicate character) 
			if((1<<(charector-'a') & check ) ==  0)
				//If it zero do an bitwise or of checker and the Left shift of the value
				check = check | (1<<(charector-'a'));
			else
			{
				//If not print the duplicate value
				System.out.println("Duplicate Charactor Present: "+charector);
				System.exit(-1);
			}
		}
		System.out.println("No Duplicates are present");
	}
}
