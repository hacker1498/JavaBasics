import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int sp=1;
		int st=(n/2)+1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=st;j++) {
				System.out.print("*");
				
			}
			
			for(j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=st;j++) {
				System.out.print("*");}
			if(i<=n/2) {
				st--;
				sp+=2;
			}
			else {
				st++;
				sp-=2;
			}
			System.out.println();
		}

	}

}
