import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");	
		int n=sc.nextInt();
		System.out.println();
		for(int i=1;i<=n;i++){
			System.out.print(2*i-1+",");
		}
	}}
