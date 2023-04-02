// V - PUM
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int start = 1;
	    int end = 4;
	    for(int i = 0 ; i < n ; i++){
	        for(int x = start; x < end; x++ ){
	            System.out.print(x + " ");
	        }
	        System.out.print("PUM");
	        System.out.println();
	        start += 4;
	        end += 4;
	    }   
	}
}
