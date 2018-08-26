import java.util.Scanner;
class GCD{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		while(n1!=n2){
			if(n1>n2){
				n1=n1-n2;
			}
			else if(n1<n2){
				n2=n2-n1;
			}
			
		}
		System.out.println(n1);
	}
}