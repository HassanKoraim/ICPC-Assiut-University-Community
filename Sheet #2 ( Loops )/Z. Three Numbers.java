import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int k = in.nextInt();
	    int s = in.nextInt();
	    int counter = 0;
	    for(int x = 0; x <= k; x++){
	        for(int y = 0; y <= k; y++){
	            if(s - x - y >= 0 && s - x - y <= k ){
	                counter++;
	            }
	            
	        }
	    }
	    System.out.println(counter);
	
	}
}
