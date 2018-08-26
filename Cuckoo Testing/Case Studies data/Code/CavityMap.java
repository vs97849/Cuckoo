import java.util.Scanner;
class CavityMap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/* char[][] a = new char[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i>0&&i<n-1&&j>0&&j<n-1&&a[i][j]>a[i-1][j]&&a[i][j]>a[i][j+1]&&a[i][j]>a[i+1][j]&&a[i][j]>a[i][j-1]){
					System.out.print("X");
				}
				else{
					System.out.print(a[i][j]);
				}
			}
			System.out.println();
		}*/
		String[] s = new String[n];
		for(int i=0;i<n;i++){
			s[i]= sc.next();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i>0&&i<n-1&&j>0&&j<n-1&&s[i].charAt(j)>s[i-1].charAt(j) && s[i].charAt(j)>s[i].charAt(j+1)&&
				s[i].charAt(j)>s[i+1].charAt(j) && s[i].charAt(j)>s[i].charAt(j-1)){
					System.out.print("X");
				}
				else{
					System.out.print(s[i].charAt(j));
				}
			}
			System.out.println();
		}
		
	}
}