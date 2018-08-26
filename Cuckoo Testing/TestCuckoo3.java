/* This is used for calculating Fitness/cost of path and sequence*/
import java.util.*;
public class TestCuckoo3 extends TestCuckoo2 
{
	public int DynamicWeightCal(int nodeI, int nodeI2)	
	{
		return inDegree[nodeI2]*outDegree[nodeI];
	}
	
	public int f(Object node1,Object node2)
	{   
	   // System.out.println(edges2);
		for(int i=0;i<edges2;i++)
			{	
		        edg=(EdgeData)cityDistance.get(i);
			//	System.out.println((int)edg.i+" "+(int)edg.j);
				if(edg.i==(int)node1&&edg.j==(int)node2)
				break;
			}
		//	System.out.println("edg.weight "+edg.weight);
		return edg.weight;
	}
	
	public int pathWeight(Vector path)
	{	int sum=0;
	    System.out.println();
	    System.out.println("path size "+path.size());
		for(int x=0;x<path.size();x++)
		{
	 	  if(x<path.size()-2)
		  {// System.out.println(x+" "+path.get(x)+" "+path.get(x+1));
	        System.out.print(x+2);
			System.out.print(f(path.get(x),path.get(x+1))+" * "+DynamicWeightCal((int)path.get(x),(int)path.get(x+2))+" + ");
			sum+=f(path.get(x),path.get(x+1))*DynamicWeightCal((int)path.get(x),(int)path.get(x+2));
		  }
		  else if(x==path.size()-2)
		  {// System.out.println(x);
			System.out.print(f(path.get(x),path.get(x+1))+" * "+outDegree[(int)path.get(x)]);
		    sum+=f(path.get(x),path.get(x+1))*outDegree[(int)path.get(x)];
		  }
		}
		return sum;
	}
	
	public int sequenceWeight()
	{	int sum=0;
		for(int i=0;i<sequence.size();i++)
		{
			sum+=pathWeight((Vector)sequence.get(i));
		}
		return sum;
	}
}