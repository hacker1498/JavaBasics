import java.util.Scanner;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int sp=n/2;
		int st=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=sp;j++) {
				if(i==n/2+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			
			for(j=1;j<=st;j++)
			{
				System.out.print("* ");
			}
			
			if(i<=n/2) {
				
				st++;
			}
			else {
				
				st--;
			}
			
			System.out.println();
		}

	}

}
