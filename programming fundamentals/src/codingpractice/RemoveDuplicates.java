package codingpractice;

import java.util.Arrays;

/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
Ex 1: Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.

Ex 2: Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
*/
public class RemoveDuplicates {
	public static int[] removeDuplicatesInArray(int arr[]) {
		int index=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[index]=arr[i];
				index++;
			}
		}
		arr[index++]=arr[arr.length-1];
		return Arrays.copyOfRange(arr, 0, index);
	}
	public static void main(String[] args) {
	     int arr[]= {1,1,2,2,3,3,3,4};
	     System.out.println(Arrays.toString(removeDuplicatesInArray(arr)));
	     System.out.println(Arrays.toString(arr));
	    

	}
}
