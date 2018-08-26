import java.util.Scanner;
class LoveLetterMistery{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++){
			String s= sc.next();
			int l = s.length();
			int mid = l/2;
			
			int i=0,j=l-1;
			int count = 0;
			
				while(i<mid){
					if(s.charAt(i)>s.charAt(j)){
						
					count += s.charAt(i)-s.charAt(j);
					}
					else{
						count += s.charAt(j)-s.charAt(i);
					}
					i++;
					j--;
				}
				System.out.println(count);
				
		}
	}
}