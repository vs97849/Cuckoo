/*This class is used for finding Main path and all the subpaths in Map and store them in Sequence*/
import java.util.*;
public class TestCuckoo2 extends TestCuckoo1
{
public void mainPaths(int start,int end)			//finds the main path and store them in sequence
	{ 
		temp=new Vector(cityDistance);
		int node=start;
		//System.out.println(cityDistance);
		int k=0;
		path.add(node);
		
		while(node!=end)
		{
		  k=0;
			for(int l=0;l<edges;l++)
			{	edg=(EdgeData)temp.get(l);
				System.out.println(edg.i+" "+edg.j+"  "+edg.weight);
				if(edg.i==node)
				{
			     k++;
				 node=edg.j;
				 temp.removeElementAt(l);
				 path.add(node);
				 edges--;
				 break;
				}
		    }
			if(k==0)
			   {
				 System.out.println("Executed");
			     path.removeElementAt(path.size()-1);
			     node=(int)path.lastElement();
			   }
			   
		}
		
		System.out.println("\n path "+path);
		sequence.add(path);
		if(!temp.isEmpty())
		{
			subPathCal();
		}
	}
	public void subPathCal() 				//finds sub paths in the map and Store them in Sequence
	{
		Vector subPath=new Vector();
		edg=(EdgeData)temp.get(0);
		int node=edg.i;
		subPath.add(node);
		while(!temp.isEmpty())
		{
		    int k=0;
		    for(int i=0;i<edges;i++)
			{	edg=(EdgeData)temp.get(i);
				//System.out.println(edg.i+" "+edg.j+"  "+edg.weight);
				if(edg.i==node)
				{ k++;
				  node=edg.j;
				  temp.removeElementAt(i);
				  subPath.add(node);
				  edges--;
				  break;
				}
			}     
				if(k==0)
				{
				  subPathCal();
			    }
		}
		sequence.add(subPath);
	}
}