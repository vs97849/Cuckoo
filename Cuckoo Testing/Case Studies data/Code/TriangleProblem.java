import java.util.Scanner;

class TriangleProblem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>=b+c||b>a+c||c>a+b){
			System.out.println("Not A Triangle");
			
		}
		else{
			if(a==b&&b==c){
				System.out.println("Equilateral Triangle");
				
			}
			else if(a!=b&&b!=c&&a!=c){
				System.out.println("Scalene Triangle");
			}
			else if((a==b&&b!=c)||(a==c&&b!=c)||(b==c&&c!=a)){
				System.out.println("Isosceles Triangle"); 
			}
				
			
		}
		
	}
}