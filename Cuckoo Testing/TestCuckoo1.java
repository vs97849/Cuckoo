/*This file is responsible for taking input of all data required to do the Computation of solution*/
import java.util.*;

public class TestCuckoo1{
   	public Vector cityDistance = new Vector();	//contains details of all path lengths(weights) 
	public int cities;						//contains No of cities or nodes present in problem
	EdgeData ed[];							// A array of edges to store all the edges data(route)
	EdgeData edg=new EdgeData();	
	public Scanner sc = new Scanner(System.in);
	public Vector path=new Vector();		//used to store main path
	Vector temp;
	public Vector sequence=new Vector();
    public Vector sequence1=new Vector();	//used to store all paths (mainPath+subPath)
	public int edges;
    public int edges2;	
	//Store no of pathways present
	public int inDegree[];			//Array to store in-degree of any nodes (city)
	public int outDegree[];			//Array to store out-Degree of any node(city)
		public Vector subPath=new Vector();

	public void inDegreecal()			//used for calculating in Degree and storing the result in a array inDegree
	{
		inDegree=new int[cities];
			for(int l=0;l<cities;l++)
		{	int k=0;
				for(int m=0;m<edges;m++)
				{	edg=(EdgeData)cityDistance.get(m);
					if(edg.j==l)
					k++;
				}
		
			inDegree[l]=k;
		}	
		
	}
	public void outDegreecal()				//used for calculating Out Degree and storing the result in a array outDegree
	{	outDegree=new int[cities];
	
		for(int l=0;l<cities;l++)
		{	int k=0;
				for(int m=0;m<edges;m++)
				{	edg=(EdgeData)cityDistance.get(m);
					if(edg.i==l)
					k++;
				}
		
			outDegree[l]=k;
		}	
			
	}
	
	
	public void cityData()					// used for insertion of the data set of problem
   {  
	System.out.println("Enter the no of cities");
	cities = sc.nextInt();
	System.out.println("Enter the no of edges");
	edges=sc.nextInt();
	edges2 = edges;
	ed=new EdgeData[edges];
	System.out.println("Enter  i j weight");
	for(int in=0;in<edges;in++){
	ed[in]=new EdgeData();
	  ed[in].getEdge();
	  cityDistance.add(ed[in]);
	  }
	  inDegreecal();
	  outDegreecal();
	
	}
	
}