//B - Drawing `X'
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    // this to loop above the rows 
	    for (int i = 0; i < n ; i++){
	        // this to loop above the columns
	        for(int x = 0; x < n; x++){
	            if(i == x && x!= (n/2) ){  // or you can add this also "&& i != (n/2)"
	                System.out.print("\\");
	            }else if(x == n/2 && i == n /2){
	                	System.out.print("X");
	           // here the sum of ((n-1)-x equals the i element)
	            }else if(i == ((n-1)-x) && x != n/2){
	                System.out.print("/");
	            }
	            else{
	                System.out.print("*");
	            }
	              
	        }
	        	System.out.println();
	        
	    }
	}
}
