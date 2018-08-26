import java.util.Scanner;
class CalenderProblem{
	public static void main(String[] args){
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Day");
	int dd=sc.nextInt();
	System.out.println("Enter the month");
	int mm=sc.nextInt();
	System.out.println("Enter the year");
	int yy=sc.nextInt();
	
	int leapYears=(int)(yy-1)/4;
	
	int nonleapYears=(yy-1)-leapYears;
	int oddDays=leapYears*2+nonleapYears;
	
	final String[] DAY={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
	final int[] MONTHDAY={31,28,31,30,31,30,31,31,30,31,30,31};
	final int[] MONTHDAYLEAP={31,29,31,30,31,30,31,31,30,31,30,31};
	int i=0;
	boolean b1=false;
	boolean b2=false;
	boolean b3=false;
	while(i<mm-1){
		b1=true;
		if(yy%4==0){
			b2=true;
			oddDays+=MONTHDAYLEAP[i];
		}
		else{
			b3=true;
			oddDays+=MONTHDAY[i];
		}
		i++;
		
	}
	
	oddDays+=dd;
	oddDays-=1;
	int effectiveOddDay=oddDays%7;
	System.out.println("The Day is  "+DAY[effectiveOddDay]);
	String path;
	if(!b1){
		path="path 1";
	}
	else{
		if(b2){
			path="path 2";
		}
		else{
			path="path 3";
		}
	}
	System.out.println("The Path Taken was "+path);
	System.out.println(b1+" "+b2+" "+b3);
}
}