import java.util.Scanner;
class Cipher{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
    int head = 0;
    int curr = 0;
	int[] a = new int[n];
	String s = sc.next();
	int l = s.length();
    for(int i=0;i<n;i++){
	  if(i-head==k){
		  curr^=a[head++];
	}
	a[i] = (s.charAt(i)-'0')^curr;
	System.out.print(a[i]);
	curr^=a[i];
  }
  
  }
}