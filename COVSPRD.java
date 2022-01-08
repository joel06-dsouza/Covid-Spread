/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    while(t-- != 0){
	        long n = in.nextLong();
	        long d = in.nextLong();
	        
	        long sum = 1;
	        for(long i = 1; i<=d; i++){
	            if(i<=10){
	                sum = sum * 2;
	                if(sum > n){
	                    sum = n;
	                    break;
	                }
	            }
	            else
	            {
                    sum = sum * 3;
                    if(sum > n)
                    {
                        sum = n;
                        break;
	                }
	            }
	        }
	        System.out.println(sum);
	    }
	    in.close();
	}
}
    