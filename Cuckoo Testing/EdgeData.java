/*This class provides object of Edge type*/
import java.util.*;
class EdgeData{
	
	public int i;
	public int j;
	public int weight;
	
	void getEdge()
	{   Scanner sc = new Scanner(System.in);
	
		i = sc.nextInt();
		j = sc.nextInt();
		weight = sc.nextInt();
    }

}
