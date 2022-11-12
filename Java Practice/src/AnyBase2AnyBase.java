import java.util.*;
  
  public class AnyBase2AnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans=anybase(n,sourceBase, destBase);
     System.out.println(ans);
   }   
  public static int anybase(int n, int b1, int b2) {
	  int sum=0;
	  int pow=0;
	  
	  while(n>0) {
		  int num=n%b2;
		  n=n/b2;
		  sum+=num*Math.pow(b1,pow);
		  pow++;
		  
	  }
	  return sum;
	  
  }
  }