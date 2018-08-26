import java.util.Scanner;
class SherlockAndArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int j=0;j<n;j++){
				a[j] = sc.nextInt();
			}
			int l = a.length;
			if(l==2){
				System.out.println("NO");
			}
			else if(l==1){
				System.out.println("YES");
			}
			
			
			else{
				int lsum = 0;
			    int rsum = 0;
				
			  for(int j=1;j<n-1;j++){
				 for(int k=0;k<j;k++){
					 lsum += a[k];
				 }
				 for(int kk=j+1;kk<l;kk++){
					 rsum += a[kk];
				 }
				 if(lsum==rsum){
					 System.out.println("YES");
				
					 j=n;
				 }
				
			  }
			   if(lsum!=rsum) {
					 System.out.println("NO");
					
			   }
			}
		}
	}
}