package codingpractice;

//Program to print the following
//SAMPLE INPUT
//Line 1: 4 3 7 6 7 2 2
//Line 2: 7 6
//
//SAMPLE OUTPUT
//3

public class GetPreviousNumber {
	public static void main(String[] args) {
        int[] numbers= {4 ,3 ,7 ,6 ,7 ,2 ,2};
        int[] find= {7,6};
        for(int i=0;i<numbers.length-1;i++) {
            if(numbers[i]==find[0] && numbers[i+1]==find[1]) {
            	System.out.println(numbers[i-1]);
            }
        }
       
	}
}
