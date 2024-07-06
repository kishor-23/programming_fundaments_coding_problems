package codingpractice;

import java.util.Arrays;

/*Take input an array, then divide the whole array by there gcd. * Input-1
* ----------
* 5
* 36 12 9 48 15
*
* Output-1
* ----------
* 12 4 3 16 5
*
* Input-2
* ----------
* 5
* 31 51 47 63 24
*
* Output-2
* ----------
* 31 51 47 63 24
*/
public class DivideArrayByGcd {
    public static void main(String[] args) {
        int[] arr = {36 ,12,9 ,48, 15};
        
        int gcd = findGcdOfArray(arr);
        
        System.out.println("Original array of numbers: " + Arrays.toString(arr));
        System.out.println("The GCD is: " + gcd);

        // divide each element by the gcd
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / gcd;
        }

        System.out.println("Resulting array: " + Arrays.toString(arr));
    }

    //find GCD of an array of integers
    public static int findGcdOfArray(int[] arr) {
        int gcd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcd = findGcd(gcd, arr[i]);
            if (gcd == 1) {
                break; // No need to continue if the GCD is already 1
            }
        }
        return gcd;
    }

    //  find GCD of two numbers 
    public static int findGcd(int a, int b) {
    	int min=(a>b)?a:b;
    	int gcd=1;
       for(int i=2;i<=min;i++) {
    	   if(a%i==0 && b%i==0) {
    		   gcd=i;
    	   }
       }
        return gcd;
    }
}
