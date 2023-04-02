// A. Summation
import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[] A = new int[n];
	    long sum =0;
	    // to give the number of array
	    for(int i : A){
	        A[i] = in.nextInt();
	        sum += A[i];
	    }
	    if(sum < 0){
	        sum = Math.abs(sum);
	    }
	    System.out.println(sum);
	}
}
