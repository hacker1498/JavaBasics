import java.util.Scanner;
import java.io.*;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		
		int temp=num;
		while(temp!=0) {
			temp=temp/10;
			count++;
		}
		int div=(int)Math.pow(10, count-1);
		while(div!=0) {
			int q=num/div;
			System.out.println(q);
			
			num=num%div;
			div=div/10;
			
			
		}
	
	}

}
