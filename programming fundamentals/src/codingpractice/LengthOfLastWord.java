package codingpractice;

/*a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
If the last word does not exist, return 0.
Note: A word is defined as a character sequence consists of non-space characters only.
Example:
Input: "Hello World"
Output: 5*/
public class LengthOfLastWord {

	public static void main(String[] args) {
        String sentance="hello world";
        if(sentance.contains(" ")) {
        	  String[] word=sentance.split(" ");
              System.out.println("length of last word in the string "+word[word.length-1].length()  );

        }
        else {
        	System.out.println(" 0");
        }
	}

}
