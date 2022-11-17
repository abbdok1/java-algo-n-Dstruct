package src.tree;
public class Binarysearchtree {
	Node root;
	int i=0;
	public  void insert(Node node) {
		root =inserthelper( root, node);
	}
	private Node inserthelper(Node root, Node node) {
		if (root==null) {
			root=node;
			return root;
		}
		else if (root.data>node.data) {
			root.right=inserthelper( root.right, node);
		}
		else {
			root.left=inserthelper(root.left, node);

		}

		return root;
	}
	public void display() {
		displayhelper(root);
	}
	private void displayhelper(Node root) {
		if(root!=null){
		displayhelper(root.left);
		System.out.println(root.data);
		displayhelper( root.right);
	}
		}
	public boolean Search(int data) {
		return SearchHelper(data,root);
		
	}
	private boolean SearchHelper(int data, Node root) {
		if (root==null) {
			return false;
		}
		if (root.data==data) {
			return true;
		}
		else if (root.data>data) {
		 return SearchHelper(data,  root.right);
		}
		else
			return SearchHelper(data, root.left);
	}
	public Node[] minleaf(Node root){
		if(root.right==null&&root.left==null){
			
		}
		
		return null;

	}
	
	

	
	public static void main(String[] args) {
		Binarysearchtree ttr=new Binarysearchtree();
		ttr.insert(new Node(2));
		ttr.insert(new Node(1));
		ttr.insert(new Node(3));
		ttr.insert(new Node(8));
		ttr.insert(new Node(2));
		ttr.insert(new Node(4));
		ttr.display();
	}
	
}