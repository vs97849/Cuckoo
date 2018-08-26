import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.Arrays;
class AcmTeam{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		BigInteger[] b = new BigInteger[n];
		for(int i=0;i<n;i++){
			b[i] = sc.nextBigInteger(2);
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				al.add((b[i].or(b[j])).bitCount());
			}
		}
	//	System.out.println(al);
		Integer[] a = new Integer[al.size()];
		a =  al.toArray(a);
		Arrays.sort(a);
		int size = a.length;
		int maxtopic = a[size-1];
		int count = 0;
		for(int i=size-1;i>=0;i--){
			if(a[i]!=maxtopic){
			
				break;
			}
				count++;
		}
		System.out.println(maxtopic);
		System.out.println(count);
	}
}