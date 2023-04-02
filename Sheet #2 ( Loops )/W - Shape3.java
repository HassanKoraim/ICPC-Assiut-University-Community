import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int nSpaces = n -1;
	    String stars = "*";
	    for(int i = 0; i < n; i++){
	        //nSpaces = n-1;
	       
	        for(int x = nSpaces; x > 0; x--){
	            System.out.print(" ");
	        }
	        nSpaces--;
            System.out.print(stars);
	        stars += "**";
	        System.out.println();
	    }
	    nSpaces++;
	   // System.out.println(nSpaces);
	  //  System.out.println(stars);
        //stars = stars.substring(0, stars.length()-2);
	    for (int z = 1; z <= n; z++){
	        for (int c = 0; c < nSpaces; c++){
	            System.out.print(" ");
	        }
	        stars = stars.substring(0, stars.length()-2);
	        nSpaces++;
	        System.out.print(stars);
	        System.out.println();
	    }
	       
	}
}
