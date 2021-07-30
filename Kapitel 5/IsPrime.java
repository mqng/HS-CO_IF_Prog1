import java.util.Scanner;

public class IsPrime {

	static boolean isPrime(int n) {
		boolean prime = true;
	
		for(int j=2;j<=n;j++){
			int count=0;
			for(int i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;        
				}
		}		
			if(count==2) {
		       System.out.println(j);     
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do
			n = sc.nextInt();
		while (n < 1);
		isPrime(n);
		sc.close();
		
	}

}

