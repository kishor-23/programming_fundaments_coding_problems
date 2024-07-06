package codingpractice;

/*10. Count of Nonrepeat-digited number (10, 12, 13,.............) between a range
* Note:
* Repeat-Digit :- 11, 22, 33, .............
* You should ignore the digit and count the other numbers
*
* Input :
* ---------------------
   10
   25

   Output :
   -------------------
   14*/
public class NonRepeatDigitedNumbersCount {
	  public static boolean hasRepeatDigits(int num) {
	        String numStr = Integer.toString(num);
	        for (int i = 0; i < numStr.length() - 1; i++) {
	            if (numStr.charAt(i) == numStr.charAt(i + 1)) {
	                return true;
	            }
	        }
	        return false;
	    }
	public static void main(String[] args) {
        int start=10;
        int end=25;
        int count = 0;
        for (int num = start; num <= end; num++) {
            if (!hasRepeatDigits(num)) {
                count++;
            }
        }
        System.out.println("Count of non-repeat-digited numbers between " + start + " and " + end + ": " + count);
        
	}

}
