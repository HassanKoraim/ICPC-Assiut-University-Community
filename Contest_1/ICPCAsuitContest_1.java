/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpcasuitcontest_1;
import java.util.Scanner;

/**
 *
 * @author f
 */
public class ICPCAsuitContest_1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner in = new Scanner(System.in);
   
      someSum();
    }
   
    
 //--------------
    static void pum(){
    // V - PUM
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

 //--------------------------   
    
    
 // --------------
   
   static void someSum(){
       Scanner in = new Scanner(System.in);
       long N = in.nextLong();
       int A = in.nextInt();
       int B = in.nextInt();
       long result = 0;
       for (int i = 1 ; i <= N; i++ ){ 
               int Num = i;
               int sumN = 0;
               while(Num > 0){
                   sumN += Num % 10;
                   Num /= 10; 
               }
               if (sumN >= A && sumN <= B)
                       result += i;
               } 
        System.out.println(result);
    }//end someSum Method
// --------------

  
// --------------
    
    static void shap(){
        Scanner in = new Scanner(System.in);
        int nRows = in.nextInt();
        String stars = "*";
        int nSpaces = nRows;
        for(int i = 0; i < nRows; i++){ 
            for (int j = nSpaces -1 ; j > 0; j--){
                System.out.print(" ");
            }
            nSpaces = nSpaces - 1;
            System.out.print(stars);
            stars += "**";
            System.out.println();
        }
    }
// --------------
    
    
// --------------
    static void sumOdd(){
            // Take the number of lines 
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        // Loop over them 
        for (int i = 0 ; i < t; i++ ){
            // Take Two numbers
            int x = in.nextInt();
            int y = in.nextInt();
            int start = Math.min(x, y);
            int end = Math.max(x, y);
            int sum = 0;
            for (int n = start +1; n < end; n++ ){
                if(isOdd(n))
                  sum+= n;  
            }
            System.out.println(sum);
        }

    } 
    // isOdd Method
    static boolean isOdd(int n){
        return n % 2 != 0 ;
}
// --------------
  
    
// --------------
    static void loopAndGetSum(){
        Scanner in = new Scanner(System.in);
        int m;
        int n;
        do{
            m = in.nextInt();;
            n = in.nextInt();
            if (m > 0 && n > 0){
            squenceAndSum(m, n);
            }
        }while(m > 0 && n > 0);
    } // end loopAndGetSum Method
    
    static void squenceAndSum(int m , int n){
        long sum = 0;
        int start = Math.min(m , n);
        int end = Math.max(m , n);
        for (int i = start; i <= end; i++){
            sum += i;
            System.out.print(i + " ");
        }
            System.out.print("sum =" + sum);
            System.out.println(); 
    }// end squenceAndSum method
// --------------

    
    
    
    
    // --------------

//      dig(scanString()); // to call this
    static String[] scanString(){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] S = new String[size];
        
        for (int i = 0 ; i < size ; i++){
            S[i] = scan.next();     
        }
        return S;
    }
    static void dig(String[] N){
        //String str = "12354";
        for(String s : N){
            //String n = Integer.toString(s);
            String[] split = s.split("",0);
            for (int i = split.length -1 ; i >=0 ; i--){
                System.out.print(split[i]+ " ");
        }
           System.out.println(); 
        }
        
        

//        for(String s : split)
//            System.out.println(s);
    }
    static void digit(long[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            if(arr.length == 1 & arr[i] == 0){
                System.out.println(0);
                break;
            }
            while (arr[i] != 0){
                long A  = arr[i] % 10;
                System.out.print(A + " ");
                arr[i] /= 10;
        }
            System.out.println();
        }
        
    }
    
// --------------

    
    
    // --------------
  
// P. Shape1 
    // start P. Shape1
static void shape(int N){
        for(int i = N; i >= 1; i--){
            repeat(i);
            System.out.println();
        }
    }
    static void repeat(int i){
        for(int c = 1; c <= i ; c++){
                System.out.print('*');
            }
    }
     // end P. Shape1
// --------------

    
//------------------------------
    
//O. Pyramid  
    // start O. Pyramid
    static void pyramid(int N){
        for(int i = 1; i <= N; i++){
            repeat2(i);
            System.out.println();
        }
    }
    static void repeat2(int i){
        for(int c = 1; c <= i ; c++){
                System.out.print('*');
            }
    }
     
    // end O. Pyramid
//-------------------------------------------  
    
   
// --------------

//               N - Numbers Histogram
    
   //Scanner in = new Scanner(System.in);
       // char s = in.next().charAt(0);
    
// this is new array and take the numbers from users 
        // int A = in.nextInt();
//        int [] B = new int[A];
//        for (int i = 0 ; i < A; i++){
//            B[i] = in.nextInt();
//        }
  
    static void hist(char s ,int[] B){
        for (int t : B){
            for (int u = 1 ; u <= t; u++){
                System.out.print(s);
            }
            System.out.println();
            
        }
  
    }
     // end the method 
  // --------------
  

// --------------
  
// L - GCD
    static int bigDivisor(int A , int B){
        int div = 0;
        if (A >= B){
            for (int i = 1 ; i <= B ; i++){
                if (A % i == 0 & B % i == 0){
                    if (i > div)
                        div = i;
                }
            }
        }else {
            for (int i = 1 ; i <= A ; i++){
                if (A % i == 0 & B % i == 0){
                    if (i > div)
                        div = i;
        }
                
    }
            
        }
        return div;
    }
    
// --------------

    
    //---------------------------------
    
    
// M - Lucky Numbers	
    static void lucky(int A , int B){
        int count = 0;
        for(int i = A ; i <= B; i++){
            int number = i;
            int flag = 0;
            if (number == 4 || number == 7){
                flag++;
            }
            while(number != 0){
                int f = number % 10;
                if (f == 7 || f == 4){
                    flag++;
                }else{
                    flag = 0;
                    break;
                }
                number /= 10;
            }
            //System.out.println(flag);
            if (flag != 0){
                    System.out.print(i + " ");
                    count++;
            }     
        }
        if (count == 0){
            System.out.println(-1);
        }
    }
// --------------

    
    
    
/*
// K - Divisors	

    static void divisor(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n ; i++){
            int flag = 0;    // note this , you must be inside the loop                      
            if (n % i == 0){  // to become the variable 0 in each loop
                flag++;
            }
            if (flag > 0)
                System.out.println(i);
        }
    }
*/  // end method 
    
    
/*
// J - Primes from 1 to n
    static void isPrime(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 1 ; i <= n ; i++){
            int flag = 0;
            if (i == 1){
                flag++; // because the one doesn't go into the loop and 
                        // flag will be zero so I do it one in the first
            } 
            int m = i / 2;
            for (int y = 1; y <= m ; y++){
                if (i == 2){
                    break; // becase the two is prime 
                }else if (i % y == 0 && i != y && y !=1){
                    flag++; // if not prime 
                }
            }
            if (flag == 0) // if prime if flag was 0 
                System.out.print(i + " ");
        }
    }  // end method
    
*/
    
/*    
// I. Palindrome
    static void palindrome(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = x;
        int reverse = 0 ;
        while(x != 0){
            int remainder = x % 10;
            // System.out.print(n);
        // save reverse number in b 
            reverse  = (reverse  * 10) + remainder;
            x /= 10;
        }
        System.out.println(reverse );
        if (reverse == y){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
     
    
  */  
    
    
 /*   
// H - One Prime   , to check the number if prime or not  
    static void isPrime(long x){
        int flag = 0;
        long m = x/2;
        for(int i = 2; i <= m ; i++){
            if(x == 1){
                flag += 1 ; // Not prime
                break;       // end the loop
            }
            else if (x == i){ // maybe you can delete this the check
                continue;     // the number divide by itself
            }else if (x % i == 0){
                flag += 1;   // Not prime 
                break;       // end the loop
            }
            
        }
        if (flag == 0){         // if not count the flag then it's prime
            System.out.println("YES");   
        }else {
            System.out.println("NO");
        }
        
    }
    */
    
    
    
    
 /*   
// G. Factorial
    static void factorail(){
        Scanner in = new Scanner(System.in);
// new array
        long[] i = new long[in.nextInt()];
        
// loob to get elements
        int c= 0;
        while (c < i.length){
            i[c]=in.nextInt();
            c++;
        }
// loop to get factorial
        for (long n : i){
            long result = 1;
            if (n == 0){
                result = 1;
            }else {
                for (long x = n ; x > 0; x--){
                    result *= x;
                }
            }
            System.out.println(result);
        }
    }
// anthor solution for  G. Factorial
    static void factorail_2(){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while (i != 0){
            long n = in.nextLong();
            long result = 1;
            for (int x = 1; x <= n; x++){
                result *= x;
            }
            System.out.println(result);
            i--;
        }
    }
    
    
    */
    
    
    
        
/*
        int i = in.nextInt();
        int a = in.nextInt();
        // factorail 1
        int result = 1;
        if (i == 0){
            result = 1;
        }else{
            for (int n = i; n > 0 ; n--){
                result *= n ; 
            }
            
        }
        // factorail 2
        int result2 = 1;
        if (a == 0){
            result2 = 1;
        }else{
            for (int n = a; n > 0 ; n--){
                result2 *= n ; 
            }
            
        }
        System.out.println(result);
        System.out.println(result2);
    }
*/
    
    
    
   /* 
// F. Multiplication table
    static void table(){
        Scanner in = new Scanner(System.in);
        
        int i = in.nextInt();
        for(int n = 1; n <= 12; n++){
            System.out.println(i + " * " + n + " = " + (i * n));
        }
    }
  */  
    
    
 /*   
// E. Max
    static void max(){
        Scanner in = new Scanner(System.in);
        
        // new array
        int[] i = new int[in.nextInt()];
        
        // get elements of array
        int n =0 ;
        while(n < i.length){
            i[n] = in.nextInt();
            n++;
        }
        
        // check
        int max = 0;
        for (int x : i){
           if (max <= x){
               max = x;
           }
        }
        System.out.println(max);
    }
 */
    
    
    
    
    /* // Start
//D. Fixed Password
    static void getPass(){
        Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        int pass = scan.nextInt();
        while(pass != 1999){
            System.out.println("Wrong");
            pass = scan.nextInt();
        }
        System.out.println("Correct");
    }
*/ // end


    /*
    
    //C. Even, Odd, Positive and Negative
    
    // this loop to get the array
        int i = scan.nextInt();
        int[] a = new int[i];
        int n = 0;
        while(n < i){
            a[n] = scan.nextInt();
            n++;
        }
       
    // this loop to loop over the array and check the elements
        int even =0;
        int odd =0 ;
        int positive =0 ;
        int negative = 0;
        for (int f : a){
           if (f % 2 == 0){
               even++;
           }
           if(f % 2 != 0){
               odd++;
           }
           if (f > 0 ){
               positive++;
           }
           if( f < 0){
               negative++;    
        }
    } // end for loop
    
    // print the count of element
    System.out.println("Even: " + even);
    System.out.println("Odd: " + odd);
    System.out.println("Positive: " + positive);
    System.out.println("Negative: " + negative);
    */
    
    
    
    /*
    
    // Start 
    // A. 1 to N
    static void toN(int N){
        if (N == 1){
            System.out.println(-1);
        }else{
            for (int i = 1; i <= N; i++ ){
                if (i % 2 == 0){
                    System.out.println(i);
                } else if (i % 2 != 0){
                    continue;
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
    */ // end 
 //End
    
    /*  Start 
    int n = scan.nextInt();
    if (returnSecondNum(n) == 0){
        System.out.println("YES");
    }else{
        isDivisible(n);
    }

    static void isDivisible(int Num){
        if (returnFirstNum(Num) > returnSecondNum(Num) ){
            if(returnFirstNum(Num) % returnSecondNum(Num) == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else {
            if (returnSecondNum(Num) % returnFirstNum(Num) == 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    
    static int returnFirstNum(int n){
        int fristNum = 0;
        while(n != 0){
            fristNum = n % 10;
            n /= 10;
        }
        return fristNum;
    }
    
    static int returnSecondNum(int n){
        return n %10;
    }
    /* end 
    

    
   /* 
    //H. Data Type Guessing
    static void guessType(long a , long b , long c){
        long d = (a * b)/ c;
        if (a * b % c !=0 ){
            System.out.println("double");
        }else if (d >= -2147483647 && d <= 2147483647){
            System.out.println("int");
        }else {
            System.out.println("long long");
        }
    }
*/
    
    
    
    /*
    // Katryoshka
static long count;
    static long mouthZero(long e , long b){
        if (e / 2 == b){
            count = b;
        } else if(e/2 < b ){
            count = e/2;
        }else if(b < e/2){
            count = b;
        }
        return count;
    }
    static void Katryoshka(long e, long m , long b){
        if (m == 0){
            mouthZero(e,b);
        }else{
            if (e == m && e == b){
                count = e;
            }else if (e >= m ){
                    
                if (m >= b){
                    count = b;
                }else {
                    count = m + mouthZero(e-m , b- m);
                } 
            }
            else if (e < m ){
                if(m >= b){
                    if (b >= e){
                    count = e;
                    }else {
                        count = b;
                    }
                } else if(m < b){
                    count = e;
                }
                    
            }
        }
        System.out.println(count);
    }
    */
    
    
    
    /*
    // G. Katryoshka
    static void Katryoshka(long e, long m , long b){
        int count = 0;
        while(e != 0 || b != 0 ){
            if(m >= 0){
                if (m == 0 && e >= 2 &&b >= 1){
                    count++;
                    e -= 2;
                    b -=1;
                }else if ( e >= 1 &&  b >= 1 && m >=1){
                    count++;
                   // System.out.println("count " + count);
                    e -= 1;
                    //System.out.println("Eyes" + e);
                    b -= 1;
                    m -= 1;
                } else {
                    break;
                }
            }  
            }
        System.out.println(count);
    }//end method
    
    */
    /*
    // F. Adding Bits
    static int Add(int a , int b){
       
    // this ^ operator use to differens between two bits 
     //   such as 00001 (integer 1) and 00011(integer3) in this case the 
       // is the second 1 in 00011 and this value in integer = 2
     
        return a^ b ; 
    }// end methon Add

    */


    /*
    //E. Interval Sweep
    static void sweep(int a, int b){


        if (a == b && (a != 0 && b !=0)){
            System.out.println("YES");
        }else if ((a > b && (a == b +1)) ||  (a < b && (a == b -1))){
            System.out.println("YES");
        }else{
            System.out.println("NO");
    }
        
    }// end method
 
    */
    
    
    /*
    //D. Ali Baba and Puzzles
    static void puzzle(long a, long b  , long c , long d){
        if (a + b - c == d || a + b * c == d || 
                a - b * c == d || a - b + c == d || 
                a * b - c == d || a * b + c ==d){
            System.out.println("YES");
    }else {
            System.out.println("NO");
        }
    } // end method
    
    */
    
    /*
    // C. Next Alphabet
    static void nextChar(char c){
        if (c == 'z'){
             System.out.println('a');
        }else{
             System.out.println((char)(c +1));
        }
    } // end Methon nextChar
    */
    
    
    
    /*
    // B. Memo and Momo
    static void win(long a, long b, long k){
        if (a % k == 0 && b % k == 0){
            System.out.println("Both");
        }else if (a % k == 0 && b % k != 0){
            System.out.println("Memo");
        }else if (a % k != 0 && b % k == 0){
            System.out.println("Momo");
        }else if (a % k != 0 && b % k != 0){
            System.out.println("No One");
        }
    }
    */
    
    
    /*
    // A. winter sales
    // to know the originalPrice you can calculate price / (1- discount * 100)
    static void discount(double x , int p){
        double originalPrice =  p / (1-(x / 100));
        System.out.println(originalPrice);
        
    } // end discount method
    */
    
} // end the class 
