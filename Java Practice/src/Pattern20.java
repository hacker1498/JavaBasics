import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j;
		int n=sc.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i<=n/2) {
					if(j==1 || j==n) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				else if(i==n/2+1) {
					if(j==n/2+1 || j==1 || j==n) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				else if(i<n) {
					if((i==j || i+j==n+1) || (j==1 || j==n)) {
						System.out.print
						("* ");
					}else {
						System.out.print("  ");
						
					}
				}
				else if(j==1 || j==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
