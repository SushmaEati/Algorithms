/**
 * 
 */
package cs6301.g33.utils;

/**
 * @author Sushma, Sai Vivek Kanaparthy
 *
 */
public class MergeSortUsingIntArray {
/**
 * 
 * @param input: Input array to be sorted
 * @param temp_array: Temp array to be used in the merge function
 * @param start_index: startindex
 * @param end_index: end index
 */
	public static void mergeSort(int[] input,int[] temp_array, int start_index, int end_index)
	{	
	
			//If start index and end index are equal just return  from recursive call
			 if(start_index == end_index)
				 return;
			 //Calculate mid index and apply merge on 
			 int middle_index = (start_index+end_index)>>>1;
			 
			 mergeSort(input,temp_array,start_index, middle_index);
			 mergeSort(input,temp_array,middle_index+1, end_index);
			 merge(input,temp_array,start_index, end_index, middle_index);
		 
	}
	/**
	 * 
	 * @param input: Input array to be sorted
	 * @param temp_array: array used in the intermediate sorting process
	 * @param start_index: Start index
	 * @param end_index: End Index
	 * @param middle_index: Middle Index
	 */
	public static void merge(int[] input,int[] temp_array, int start_index,int end_index, int middle_index)
	{
		int size_of_array = (end_index - start_index)+1;
		int temp_start = start_index;
		int temp_index = 0;
		int temp_middle_index = middle_index+1;

		//Check 1st element of left array and 1st element of right array, assign smallest elem to the temp array and increase index accordingly
		while(temp_start <= middle_index && temp_middle_index <= end_index)
		{
			if(input[temp_start] <input[temp_middle_index])
			{
				temp_array[temp_index] = input[temp_start];
				temp_start++;
			}
			
			else
			{
				temp_array[temp_index] = input[temp_middle_index];
				temp_middle_index++;
			}
			temp_index++;
		}
		
		//Add remaining elements of the left array to the temp array if any
		while(temp_start<= middle_index)
		{
			temp_array[temp_index] = input[temp_start];
			temp_index++;
			temp_start++;
		}
		//Add remaining elements of the right array to the temp array if any
		while(temp_middle_index<=end_index)
		{
			temp_array[temp_index] = input[temp_middle_index];
			temp_index++;
			temp_middle_index++;
		}
		
		//Add 
		for(int index =0 ; index <  size_of_array ; index++)
		{
			input[index+start_index] = temp_array[index];
		}
	}


}
