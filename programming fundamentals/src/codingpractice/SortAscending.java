package codingpractice;

import java.util.Arrays;

/*3.Your task is to sort the array in non-decreasing order and print out the original indices of the new sorted array.
Example:
A={4,5,3,7,1}
After sorting the new array becomes A={1,3,4,5,7}.
The required output should be "4 2 0 1 3"*/
public class SortAscending {
	public static void main(String[] args) {
          int arr[]={4,5,3,7,1};
          //copying the array
         int copy[] =Arrays.copyOf(arr, arr.length);
         System.out.println("original array "+Arrays.toString(arr));
          Arrays.sort(copy);
          System.out.println("sorted array"+Arrays.toString(copy));
        for(int i=0;i<copy.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		if(copy[i]==arr[j]) {
        			System.out.print(j+" ");
        		}
        	}
        }
        	
 	}
}
