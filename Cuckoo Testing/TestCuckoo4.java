import java.util.*;
public class TestCuckoo4 extends TestCuckoo3{
void generate()
{
	if(sequence.size()>1)
	{
		System.out.println(sequence.size());
		movgen();
	}
}

 void movgen()
 {
	Vector path=(Vector)sequence.elementAt(0);
	for(int i=1;i<sequence.size();i++)
	  {    // int a=0,b=0;
			temp=(Vector)sequence.elementAt(i);
			System.out.print(temp+"\t\t\t");
			System.out.println("Movgen"+path);
			 int  a=path.indexOf(temp.firstElement());
	         int  b=path.lastIndexOf(temp.lastElement());
				 if(a<b)
				{
					//int count = b+1-a;
				//	subPath=(Vector)path.subList(a,b+1);
				    path.subList(a,b+1).clear();
                                      //  while(count!=0){
                                      //  path.removeRange(a,b+1);
                                     //   path.remove(a);
									//	count--;
                              //  } 
					
					path.addAll(temp);
					
					
				}	 
			 
			System.out.println(path);
		}
		}
}