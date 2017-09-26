/**
 * 
 */
package cs6301.practice.code;

/**
 * @author Sushma, Sai Vivek Kanaparthy
 * Generic class to perform binary search 
 */
public class BinarySearch {	
	//input should be sorted for binary search to work
	public static<T extends Comparable<? super T>> int binarySearch(T[] input,  int start_index, int end_index, T element)
	{		
		//If the last element is less than or equal to element to be found.  
		if(input[input.length-1].compareTo(element) <=0)
			return input.length-1;
		//If all the elements are greater than the element to be found.
		if(input[0].compareTo(element) > 0)
			return -1;
		
		int middle_index=0;
		int result  = 0;
		
		//Iterate through the list and find the index of the largest element greater than or equal to x.
		while(start_index<end_index)
		{
			middle_index = (start_index+end_index)>>>1;
			result = input[middle_index].compareTo(element);
			//Check if the result of comparison is positive, negative or 0 and set start and end indices accordingly
			if(result == 0)
				return middle_index;
			else if(result < 0)
				start_index = middle_index+1;
			else
				end_index = middle_index-1;
		}
		
		//If the element compared is higher than the element given, just before exiting the loop, then the highest element will be on the left side of middle index
		if(result == 1)
			return middle_index-1;
		return middle_index;
	}
}
