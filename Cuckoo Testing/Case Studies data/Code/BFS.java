import java.util.*;

class BFS{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of nodes");
		int n = sc.nextInt();
		System.out.println("Enter the graph details");
		int[][] adj = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				adj[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the starting node");
		int s = sc.nextInt();
		int[] q = new int[n];
		Queue<Integer> Q =  new LinkedList<Integer>();
		Q.add(s);
		
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++){
			visited[i]=false;
		}
	//	visited[s]=true;
		while(!Q.isEmpty()){
			
		//	System.out.println(Q.element());
		    s=Q.remove();
			System.out.print(s+"  ");
			visited[s]=true;
			for(int i=0;i<n;i++){
				
				if(adj[s][i]==1&&!visited[i]){
					Q.add(i);
					visited[i]=true;
				}
				
			}
		}
	}
}