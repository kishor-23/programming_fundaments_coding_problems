package codingpractice;
//.Implement a function which, given an array of integers, returns a new array for which every index carries the value of the product of the remaining elements.
//Example
//Given array [1, 3, 2, 4, 5] it would return [120, 40, 60,30, 24]
//Given array [4, 10, 3] it would return [30, 12, 40]

import java.util.Arrays;

public class Product0fRemainingElements {
	public static int[] productOfElementsInArray(int[] arr) {
	    int[] result = new int[arr.length];
	    int product;
	    for (int i = 0; i < arr.length; i++) {
	        product = 1;
	        for (int j = 0; j < arr.length; j++) {
	            if (i != j) {
	                product *= arr[j];
	            }
	        }
	        result[i] = product;
	    }
	    return result;
	}


	public static void main(String[] args) {
		 int arr[]={1,3, 2,4,5};
	    
	     System.out.println(Arrays.toString(productOfElementsInArray(arr)));
	}

}
