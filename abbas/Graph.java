package src.abbas;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Graph {
	ArrayList<Node> nodes;
	int[][]Matrix;
	public Graph(int size) {
		nodes=new ArrayList<>();
		Matrix=new int[size][size];
	}
	public void addEdge(int src,int dst) {
		Matrix[src][dst]=1;
		
	}
	public void addNODE(Node node) {
		nodes.add(node);
	}
	public boolean checkEdge(int src,int dst) {
		return Matrix[src][dst] == 1;
	}
	public void print() {
		for (Node node : nodes) {
			System.out.print("  ");
			System.out.print( node.data );
		}
		System.out.println();
		for (int[] matrix : Matrix) {
			System.out.print(" ");
			for (int i : matrix) {
				System.out.print(i + " ");
			}
			System.out.println();
			
		}
		
	}
	
	public void DFS(int src){
		boolean[]vistied=new boolean[Matrix.length];
		DFShelper(src,vistied);
	}
    private void DFShelper(int src, boolean[] vistied) {
		if (vistied[src]) {
			return;
		}
		else{
			vistied[src]=true;
		}
		for (int i = 0; i < Matrix[src].length; i++) {
			if(Matrix[src][i]==1){
				DFShelper(i, vistied);
			}
		
		}
		return;
	}
	public void addNODE(char c) {
    }
	public void Bfs(int src){
		boolean[]vistied=new boolean[Matrix.length];
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(src);
		vistied[src]=true;
		while(queue.size()!=0){
			src=queue.poll();
			System.out.println(src +"=visited");
			for(int i=0;i<Matrix[src].length;i++){
				if (Matrix[src][i]==1&&!vistied[i]) {
					queue.offer(i);
					vistied[i]=true;	
				}
			}
		}
	}
public static void main(String[] args) {
    Graph graph=new Graph(4);
    graph.addNODE('a');
    graph.addNODE('b');
    graph.addNODE('c');
    graph.addNODE('d');
    graph.addEdge(0, 2);
    graph.addEdge(2, 3);
    graph.addEdge(2, 1);
    graph.addEdge(1, 0);
	graph.addEdge(3, 2);
	graph.print();
	graph.Bfs(0);

}

	}