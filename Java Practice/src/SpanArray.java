import java.util.Scanner;
public class SpanArray {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int[] arr=new int[n]; 
		  arr=span(arr,n);
		  for(int i=0;i<arr.length;i++) {
			  arr[i]=sc.nextInt();
			  System.out.println(arr[i]);  
		  }
		  
	  }
	  public static int[] span(int[] ar,int n) {
		  ar=new int[n];
		  int max=ar[0];
		  int min=ar[0];
		  for(int i=0;i<ar.length;i++) {
			  if(ar[i]>max) {
				  max=ar[i];
			  }else if(ar[i]<min) {
				  min=ar[i];
			  }
			  
		  }
		  
		  return ar;
	  }

}
