import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		 //System.out.print(fib(6));
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		fib(n);
	}
	static void fib(int n){
	    int start = 0;
	    int end = 1;
	    int nextTerm;
	    for(int i = 1 ; i <= n ; i++){
	        if(i == 1){
	            System.out.print(start + " ");
	            continue;
	        }else if (i == 2){
	            System.out.print(end + " ");
	            continue;
	        }
	        
	        nextTerm = start + end;
	        start = end;
	        end = nextTerm;
	        
	        System.out.print(nextTerm + " ");
	    }
	}
	//====================================
// for fib method
	// this code in the main method 
// 		 for(int i = 1 ; i <= n; i++){
// 		     System.out.print(fib(i) + " ");
// 		 }
// 		 System.out.println();
// ------------------------------	
		// fib2 method by recursion
	// Start fib2 method
// 	static int fib2(int n){
// 	    if (n == 1){
// 	        return 0;
// 	    }else if(n == 2){
// 	        return 1;
// 	    }else{
// 	        int i = fib(n-1) + fib(n - 2 );
// 	        return i;
// 	    }
// 	}
} // end fib2 method
