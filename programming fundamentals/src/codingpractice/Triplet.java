package codingpractice;

/*2. We define the rating for Alice's challenge to be the triplet a = (a[0],a[1],a[2]), and the rating for Bob's challenge to be the triplet b = (b[0],b[1],b[2]).
Your task is to find their comparison points by comparing a[i] with b[i]
if a[i] > b[i] - alice is awarded 1 point
if a[i] < b[i] - bob is awarded 1 point
if a[i] = b[i] - then neither person receives a point.
Sample Input
5 6 7
3 6 10
Sample Output
1 1

Sample Input
17 28 30
99 16 8
Sample Output
2 1*/
public class Triplet {

	public static void main(String[] args) {
		 int[] a= {5,6,7};
		 int[] b= {3,6,10};
		 int pointA=0;
		 int pointB=0;
		 for(int i=0;i<3;i++) {
			 if(a[i]>b[i] ) {
				 pointA++;
			 }
			 else if(b[i]>a[i]) {
				 pointB++;
			 }
		 }
		 System.out.println("point of a "+pointA);
		 System.out.println("point of b "+pointB);
	}

}
