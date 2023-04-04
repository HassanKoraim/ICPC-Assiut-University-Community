
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    int splitSize = in.nextInt();
	    int[] arr = new int[size];
	    for(int i = 0; i < size; i++){
	        arr[i] = in.nextInt();
	    }
	    int start = 0;
	    int end = splitSize;
	    int remainder = size % splitSize;
	    while(end <= size){
	        System.out.print(split(arr, start, end) + " ");
	        start = end ;
      	    end += splitSize;
	    }
	    if(remainder > 0){
	        System.out.print(split(arr, start, (start+ remainder)) + " ");
	        }
	}
	public static int split(int[] arr , int start , int end){
	    int x = arr[start];
	    for(int i = start; i < end; i++){
	        if(arr[i] < x ){
	            x = arr[i];
	        }
	    }
	    return x;
	}
}
